package profeFitxers;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class EmisorDatagram {
	public static void main(String[] args){
		try{
			
			DatagramSocket dtgSocket= new DatagramSocket();
			String missatge="Missatge des de l'emissor";
			InetAddress addr = InetAddress.getByName("localhost");
			DatagramPacket datagrama =new DatagramPacket(missatge.getBytes(),missatge.getBytes().length, addr,5555);
			dtgSocket.send(datagrama);
			dtgSocket.close();
			
		} catch(IOException e){
			e.printStackTrace();
		}
	}	
	
}