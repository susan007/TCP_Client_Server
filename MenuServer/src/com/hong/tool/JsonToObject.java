package com.hong.tool;

import com.google.gson.Gson;
import com.hong.bean.FrameKeyWord;

public class JsonToObject {
	
	//解析数据
	public static FrameKeyWord parseData(String json){ 
		FrameKeyWord obj=new FrameKeyWord();
		Gson gson=new Gson();
		obj=gson.fromJson(json, FrameKeyWord.class);
		return obj;
	}
	//接收任意类型的参数并返回解析后的对象
	public static <T> T parseObject(String json,T t){  
		Gson gson=new Gson();
		t=(T) gson.fromJson(json,t.getClass());
		return t;
		
	}
	
}
