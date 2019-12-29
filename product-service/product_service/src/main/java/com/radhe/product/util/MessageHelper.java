package com.radhe.product.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.radhe.product.model.Product;

public class MessageHelper {
 

	public static <T> T jsonToObj(String content, Class<T> clazz) throws JsonMappingException, JsonProcessingException {
			ObjectMapper mapper=new ObjectMapper();
			T obj = mapper.readValue(content, clazz);
			return obj;
	}
		
	
	public static <T> String objToJson(T t) throws JsonMappingException, JsonProcessingException {
		ObjectMapper mapper=new ObjectMapper();
		String valueAsString = mapper.writeValueAsString(t);
		return valueAsString;
		
}
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
		Product p=new Product();
		p.setProdId(101);
		p.setProdName("Bull");
		p.setProdPrice(100002);
		String objToJson = objToJson(p);
		System.out.println("objToJson: "+objToJson);
		//
		String contect="{\"product_id\":102,\"product_name\":\"TB\",\"product_price\":500002.0}";
		Product product = jsonToObj(contect, Product.class);
		System.out.println("product: "+product);
		
		
		
	}

}
