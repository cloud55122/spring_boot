package com.config.hazelcast;

import java.util.Arrays;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.config.Config;
import com.hazelcast.config.EvictionPolicy;
import com.hazelcast.config.GlobalSerializerConfig;
import com.hazelcast.config.GroupConfig;
import com.hazelcast.config.InMemoryFormat;
import com.hazelcast.config.JoinConfig;
import com.hazelcast.config.MapConfig;
import com.hazelcast.config.MaxSizeConfig.MaxSizePolicy;
import com.hazelcast.config.MergePolicyConfig;
import com.hazelcast.config.MulticastConfig;
import com.hazelcast.config.NetworkConfig;
import com.hazelcast.config.TcpIpConfig;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IExecutorService;
import com.hazelcast.durableexecutor.DurableExecutorService;
import com.hazelcast.scheduledexecutor.IScheduledExecutorService;
import com.hazelcast.scheduledexecutor.IScheduledFuture;
import com.hazelcast.scheduledexecutor.NamedTask;
import com.scheduler.EchoTask;
import com.scheduler.ExampleScheduler;

import static com.hazelcast.scheduledexecutor.TaskUtils.named;


import info.jerrinot.subzero.SubZero;

@Configuration
@PropertySource("classpath:hazelcast.properties")
public class HazelcastConfig {

	private Environment env;

	@Autowired
	public HazelcastConfig(Environment env) {
		this.env = env;
	}

	@Bean
	@SuppressWarnings("deprecation")
	public HazelcastInstance getHazelcastInstance() {
		Config config = new Config();

		config.setInstanceName(env.getProperty("ft.hz.instance.name", "instance-name"));

		ClientConfig clientConfig = new ClientConfig();
		clientConfig.setGroupConfig(new GroupConfig(env.getProperty("ft.hz.group.name", "dev"),
				env.getProperty("ft.hz.group.pwd", "dev-pass")));

		config.setProperty("hazelcast.jmx", env.getProperty("ft.hz.jmx", "true"));
		config.setProperty("hazelcast.jmx.detailed", env.getProperty("ft.hz.jmx.detailed", "true"));
		config.setProperty("hazelcast.logging.type", "slf4j");
		config.setProperty("hazelcast.socket.bind.any", "false");
		config.setProperty("hazelcast.health.monitoring.level", "OFF");

		NetworkConfig networkConfig = new NetworkConfig();
		networkConfig.setPort(Integer.valueOf(env.getProperty("ft.hz.network.port", "5900")))
				.setPortAutoIncrement(Boolean.valueOf(env.getProperty("ft.hz.network.port.auto.increment", "false")));

		JoinConfig joinConfig = new JoinConfig();
		joinConfig.getAwsConfig().setEnabled(false);

		MulticastConfig multicastConfig = new MulticastConfig();
		multicastConfig.setEnabled(Boolean.valueOf(env.getProperty("ft.hz.multicast.enabled", "true")));

		joinConfig.setMulticastConfig(multicastConfig);

		TcpIpConfig tcpIpConfig = new TcpIpConfig();
		tcpIpConfig.setEnabled(Boolean.valueOf(env.getProperty("ft.hz.tcp.ip.enabled", "true")));
		tcpIpConfig.setMembers(Arrays.asList(env.getProperty("ft.hz.members.list", "").split(",")));

		joinConfig.setTcpIpConfig(tcpIpConfig);

		networkConfig.setJoin(joinConfig);

		config.setNetworkConfig(networkConfig);

		MapConfig mapConfig = new MapConfig();
		mapConfig.setName(env.getProperty("ft.hz.imap.cache.type", "type"))
				.setBackupCount(Integer.valueOf(env.getProperty("ft.hz.map.backup.count", "0")))
				.setInMemoryFormat(InMemoryFormat.BINARY);
		mapConfig.getMaxSizeConfig().setSize(Integer.valueOf(env.getProperty("ft.hz.map.max.size", "150000")))
				.setMaxSizePolicy(MaxSizePolicy.PER_NODE);
		mapConfig.setEvictionPercentage(Integer.valueOf(env.getProperty("ft.hz.map.eviction.percentage", "true")));
		mapConfig.setReadBackupData(Boolean.valueOf(env.getProperty("ft.hz.map.read.backup.data", "true")));
		mapConfig.setEvictionPolicy(EvictionPolicy.LRU);
		mapConfig.setMergePolicyConfig(
				new MergePolicyConfig().setPolicy((env.getProperty("ft.hz.map.merge.policy", "mergePolicy"))));


		config.addMapConfig(mapConfig);

		HazelcastInstance instance = Hazelcast.newHazelcastInstance(config);

		IScheduledExecutorService scheduler = instance.getScheduledExecutorService("scheduler");
		scheduler.scheduleAtFixedRate(named("task", new ExampleScheduler()), 5, 5, TimeUnit.SECONDS);
		
		return instance;
	}

}
