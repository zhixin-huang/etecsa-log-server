package com.etecsa.log.start.message;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class ResultMap {

	   private String message="operation successful";

	   private String code="111111";

	   public Map<String,Object> data(Object data){
		   Map<String,Object> map=new HashMap<>(4);
		   map.put("msg", message);
		   map.put("code", code);
		   map.put("data", data);
		   return map;
	   }


}
