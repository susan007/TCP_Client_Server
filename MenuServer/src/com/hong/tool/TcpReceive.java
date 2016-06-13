package com.hong.tool;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class TcpReceive {
	
	/**
	 * �������֡
	 * @param socket ����socket
	 * @return ���ؽ��յ�json��ݰ�
	 */
	public static String receiveTcpData(Socket socket) {
		BufferedInputStream br;
		byte[] buf = new byte[1024];
		int len = 0;
		String result = null;
		try {
			br =new BufferedInputStream(socket.getInputStream());
		while ((len = br.read(buf)) != -1) {
				// 读取结果
				result=new String(buf,0,len);
				System.out.println("服务器接收到的数据："+result);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

}
