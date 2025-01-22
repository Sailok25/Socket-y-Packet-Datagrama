import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class Servidor {
    public static void main(String[] args) {
        try {
            InetSocketAddress addr1 = new InetSocketAddress("localhost", 5555);
            DatagramSocket dtgSocket = new DatagramSocket(addr1);

            byte[] missatge = new byte[50];
            DatagramPacket datagrama1 = new DatagramPacket(missatge, 50);
            dtgSocket.receive(datagrama1);
            
            DatagramPacket datagramaResposta = new DatagramPacket(datagrama1.getData(), datagrama1.getLength(), datagrama1.getAddress(), datagrama1.getPort());
			// DatagramPacket datagrama =new DatagramPacket(missatge.getBytes(),missatge.getBytes().length, addr,5555);

            dtgSocket.send(datagramaResposta);
            dtgSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}