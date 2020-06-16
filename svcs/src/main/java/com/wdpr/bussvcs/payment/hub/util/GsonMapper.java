package com.wdpr.bussvcs.payment.hub.util;

import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class GsonMapper implements JsonMapper {

	private static final String DATETIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ssZ";

	private Gson gson;

	public GsonMapper() {
		this.gson = new GsonBuilder().registerTypeAdapter(Date.class, new DateAdapter()).setDateFormat(DATETIME_FORMAT)
				.registerTypeAdapter(Date.class, new JsonSerializer<Date>() {
					
					public JsonElement serialize(Date date, Type type, JsonSerializationContext context) {
						return new JsonPrimitive(date.getTime());
					}
				}).create();
	}


	public String toJson(Object object) {
		return gson.toJson(object);
	}


	public <T> T fromJson(String json, Class<T> clazz) {
		return gson.fromJson(json, clazz);
	}


	public String findRootField(String json, String field) {
		JsonParser p = new JsonParser();
		JsonElement element = p.parse(json);

		if (element.isJsonObject()) {
			JsonObject root = element.getAsJsonObject();
			return root.get(field).getAsString();
		} else {
			return null;
		}
	}

	private static final class DateAdapter implements JsonDeserializer<Date> {
	
		public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
				throws JsonParseException {
			return new Date(json.getAsJsonPrimitive().getAsLong());
		}
	}

	public File readJsonFromFile(String path) {
		return new File(getClass().getClassLoader().getResource(path).getFile());
	}

}
