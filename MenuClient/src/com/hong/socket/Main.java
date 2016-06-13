package com.hong.socket;

import java.io.IOException;
import java.net.Socket;

import com.hong.bean.FrameKeyWord;
import com.hong.bean.Result;
import com.hong.bean.User;
import com.hong.tool.JsonToObject;
import com.hong.tool.ObjectToJson;
import com.hong.tool.TcpReceive;
import com.hong.tool.TcpSend;

/**
 * TCP  Socket�ͻ���
 * @author susan
 *
 */
public class Main {

	public static void main(String[] args) {
		try {
			Main st = new Main();
			// socket
			Socket socket = new Socket("10.0.0.2", 9527);
			// 发送tcp
			TcpSend.sendTcpData(socket, setA0());
			// 接收tcp
			String str = TcpReceive.receiveTcpData(socket);
			// 解析结果
			FrameKeyWord fkw=JsonToObject.parseData(str);
					
			System.out.println(" --- :"+fkw.getFunctionCode());
			User user = fkw.getValidData();
			// 判断是否符合标准
			st.isSuccess(user);
			
			// 关闭资源
			
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 合成A0
	 * @return json字符串֡
	 */
	public static String setA0() {
		User user;
		user = new User();
		user.setUserName("小明");
		user.setUserPassword("12345678");
		user.setUserImg("fengjie.jip");

		String json = ObjectToJson.setJsonPacket("A0", user);

		return json;
	}

	/**
	 * 判断A1是否符合要求
	 * @param re  result=1��ע��ɹ� ����ʧ��
	 */
	public void isSuccess(User re) {
		if (re.getUserName().equals("1")) {
			System.out.println("注册成功");
		} else {
			System.out.println("注册失败");
		}
	}

}
