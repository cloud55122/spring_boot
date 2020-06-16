package com.wdpr.bussvcs.payment.hub.util;

public interface JsonMapper {
	
	String toJson(Object object);
	
	<T> T fromJson(String json, Class<T> clazz);
	
	String findRootField(String json, String field);

}
