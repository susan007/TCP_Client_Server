package com.hong.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import com.hong.bean.FrameKeyWord;
import com.hong.bean.Result;
import com.hong.bean.User;
import com.hong.tool.JsonToObject;
import com.hong.tool.ObjectToJson;
import com.hong.tool.TcpReceive;
import com.hong.tool.TcpSend;

public class MyServer {
	
	
	public static void main(String[] args){
		
		try {
			ServerSocket ss=new ServerSocket(9527);
			Socket socket=ss.accept();
			//接收socket数据
			String str=TcpReceive.receiveTcpData(socket);
			//泛型解析数据
			FrameKeyWord fkw=new FrameKeyWord();
			fkw=JsonToObject.parseObject(str, fkw);  
			User user=fkw.getValidData();
			System.out.println("name: "+user.getUserName());
			System.out.println("password: "+user.getUserPassword());
			//判断是否接收到有效数据
			if (isEfficient(user)) {
				User u=new User();
				u.setUserName("1");
				u.setUserPassword("1");
				String json=ObjectToJson.setJsonPacket("A1", u);
				TcpSend.sendTcpData(socket, json);
				
				System.out.println("成功接收");
			}else{
				User u=new User();
				u.setUserName("0");
				u.setUserPassword("0");
				String json=ObjectToJson.setJsonPacket("A1", u);
				TcpSend.sendTcpData(socket, json);
				
				System.out.println("失败接收");
			}
			
//			ss.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean isEfficient(User user){
		if ((user.getUserName()) != null && (user.getUserPassword()) !=null) {
			System.out.println("name: "+user.getUserName());
			System.out.println("password: "+user.getUserPassword());
			return true;
		} else {
			return false;
		}
	}
	
	

}
