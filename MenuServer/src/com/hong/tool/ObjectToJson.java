package com.hong.tool;

import com.google.gson.Gson;
import com.hong.bean.FrameKeyWord;
import com.hong.bean.Result;
import com.hong.bean.User;

public class ObjectToJson {
	//打包双层的json
	public static String setJsonPacket(String functionCode,User obj) {  
		Gson gson=new Gson();
		FrameKeyWord fkw=new FrameKeyWord();
		fkw.setFunctionCode(functionCode);  
		fkw.setValidData(obj);
		String result=gson.toJson(fkw);
		return result;
	}

}
