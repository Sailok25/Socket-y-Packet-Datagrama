import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;

public class RebreEnviar {
	
	public static void main(String[] args){
		try{
			System.out.println("Informació sobre l'adreça on a d'anar el datagrama");			
			InetSocketAddress addr1= new InetSocketAddress("localhost",5555);

			System.out.println("Crea un socket Datagrama per rebre o enviar informació");
			DatagramSocket dtgSocket= new DatagramSocket(addr1);
			
			System.out.println("Crea una forma per rebre un missatge de 50 caracters");
			byte[] missatge = new byte[50];

			System.out.println("Conté la informació del datagrama");
			DatagramPacket datagrama1 =new DatagramPacket(missatge, 50);

			System.out.println("Espera a rebre un datagrama");
			dtgSocket.receive(datagrama1);
				
			System.out.println("Crea una segona adreça datagrama, sol que la diferencia amb el primer es que aquest no especifica port");
			InetAddress addr2 = InetAddress.getByName("localhost");

			System.out.println("Crea un segon socket Datagrama amb informació sobre  el missatge, llargada, remitent de la conexió 2 i destinatari");
			DatagramPacket datagrama2 =new DatagramPacket(missatge,missatge.length, addr2,5556);

			System.out.println("Envia un paquet datagrama amb informació del missatge, llargada del missatge i l'adreça del remitent");
			dtgSocket.send(datagrama2);	
			
			System.out.println("Tanca la conexió");
			dtgSocket.close();
			
		} catch(IOException e){
			e.printStackTrace();
		}
	}
}
