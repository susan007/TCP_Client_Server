package com.hong.tool;

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
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));
			bw.write(json);
			bw.flush();
			System.out.println("服务器发送的数据："+json);
			//表示 我已经发送完了
			socket.shutdownOutput();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
