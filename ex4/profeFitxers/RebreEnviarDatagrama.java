package profeFitxers;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;

public class RebreEnviarDatagrama {
	
	public static void main(String[] args){
		try{
						
			InetSocketAddress addr1= new InetSocketAddress("localhost",5555);
			DatagramSocket dtgSocket= new DatagramSocket(addr1);
			
			byte[] missatge = new byte[50];
			DatagramPacket datagrama1 =new DatagramPacket(missatge, 50);
			dtgSocket.receive(datagrama1);
				
			InetAddress addr2 = InetAddress.getByName("localhost");
			DatagramPacket datagrama2 =new DatagramPacket(missatge,missatge.length, addr2,5556);
			dtgSocket.send(datagrama2);			

			dtgSocket.close();
			
		} catch(IOException e){
			e.printStackTrace();
		}
	}
}
