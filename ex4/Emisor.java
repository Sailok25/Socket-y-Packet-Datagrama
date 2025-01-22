import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Emisor {
	public static void main(String[] args){
		try{
			System.out.println("Creem un nou Datagrama Socket");
			DatagramSocket dtgSocket= new DatagramSocket();

			System.out.println("Creem un nou missatge");
			String missatge="Missatge des de l'emissor: Holaaaaaa :D";

			System.out.println("Especifica la informació on s'envia el datagrama");
			InetAddress addr = InetAddress.getByName("localhost");

			System.out.println("Creem un paquet datagrama amb la informació");
			DatagramPacket datagrama =new DatagramPacket(missatge.getBytes(),missatge.getBytes().length, addr,5555);

			System.out.println("Envia el paquet datagrama");
			dtgSocket.send(datagrama);

			System.out.println("Tanquem el datagrama socket");
			dtgSocket.close();
			
		} catch(IOException e){
			e.printStackTrace();
		}
	}	
	
}