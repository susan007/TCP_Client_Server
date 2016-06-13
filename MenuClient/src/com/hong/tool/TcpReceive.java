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
		String result = "";
		try {
			if (socket !=null && socket.isConnected() ) {
				br = new BufferedInputStream(socket.getInputStream());
				while ((len = br.read(buf)) != -1 ) {
					// 读取结果
					result=new String(buf,0,len);
					System.out.println("客户端接收到的数据："+result);
				}
				
			} else {
				System.out.println("socket is closed");
			}
//			if ((len = br.readLine().length()) != -1) {  //这是一个阻塞的方法 除非读到/n结束符他才会停止 否则一直等待
//				// һֱ������
////				result = new String(buf, 0, len);
//				result=br.readLine();
//				System.out.println("客户端接收到的数据为: " + result);
//			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

}
