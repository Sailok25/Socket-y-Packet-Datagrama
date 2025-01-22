import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Usuari {
    public static void main(String[] args){
		try{
            DatagramSocket dtgSocket= new DatagramSocket();
			String missatge="¿Quina es la meva ip?";
			InetAddress addr = InetAddress.getByName("localhost");
			DatagramPacket datagrama =new DatagramPacket(missatge.getBytes(),missatge.getBytes().length, addr,5555);
			dtgSocket.send(datagrama);

			System.out.println("Esperant resposta del servidor...");

			dtgSocket.receive(datagrama);

			System.out.println("S'esta revent una resposta: ");
			System.out.println("La teva adreça es: " + datagrama.getAddress());
			System.out.println("El teu port es: " + datagrama.getPort());
			dtgSocket.close();
		} catch(IOException e){
			e.printStackTrace();
		}
	}	
}