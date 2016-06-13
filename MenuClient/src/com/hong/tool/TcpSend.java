package com.hong.tool;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TcpSend {
	
	/**
	 * ����tcp���֡
	 * @param socket ����socket
	 * @param json Ҫ���͵�json��ݰ�
	 */
	public static void sendTcpData(Socket socket, String json) {
		// ������� ͨ����
		BufferedOutputStream bos;
		try {
			bos = new BufferedOutputStream(
					socket.getOutputStream());
			
			bos.write(json.getBytes());;
			bos.flush();
			System.out.println("客户端发送的数据为："+json);
			//不写这一步socket一直在等待发送 写了之后报socketException
			socket.shutdownOutput();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
