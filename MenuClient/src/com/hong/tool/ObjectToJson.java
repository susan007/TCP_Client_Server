package com.hong.tool;

import com.google.gson.Gson;
import com.hong.bean.FrameKeyWord;
import com.hong.bean.User;

public class ObjectToJson {
	/**
	 * 
	 * @param functionCode  功能码
	 * @param user  用户信息
	 * @return 包含用户信息的json数据
	 */
	public static String setJsonPacket(String functionCode,User obj) {  
		Gson gson=new Gson();
		FrameKeyWord fkw=new FrameKeyWord();
		fkw.setFunctionCode(functionCode);
		fkw.setValidData(obj);
		String result=gson.toJson(fkw);
		return result;
	}

}
