package JacksonAPI;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jsonUtil {
	
	private static ObjectMapper mapper;
	
	static {
		mapper = new ObjectMapper();
	}
	
	public static String convertJavaToJson(Object obj) {
		String jsonResult = null;
		try {
			 jsonResult = mapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			System.out.println("Exception occured while convert java objectd to json");
		}
		return jsonResult;
	}
	
	
	public static <T> T convertjsonToJava(String jsonString, Class<T> cls) {
		// T - any type of object and if you write Object then downcasting is required so therefore <T>
		T result = null;
		try {
			result = mapper.readValue(jsonString, cls);
		} catch (JsonMappingException e) {
		System.out.println("Exception occured while converting json into java"+e);
		} catch (JsonProcessingException e) {
			System.out.println("Exception occured while converting json into java"+e);
		}
		
		return result;
		
	}

}
