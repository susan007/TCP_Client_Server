package com.hong.tool;

import com.google.gson.Gson;
import com.hong.bean.FrameKeyWord;

public class JsonToObject {
	
	/**
	 * 
	 * @param json  要解析的字符串
	 * @param obj 所属的对象
	 * @return 
	 */
	public static FrameKeyWord parseData(String json){
		FrameKeyWord obj=new FrameKeyWord();
		Gson gson=new Gson();
		obj=gson.fromJson(json, FrameKeyWord.class);
		return obj;
	}
	
	
	 public <T> T  show(Class<T> c){
		    System.out.println(c);
		    T t = null;
			try {
				
				t = c.newInstance();
				
				
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		    return t;
		  }

}
