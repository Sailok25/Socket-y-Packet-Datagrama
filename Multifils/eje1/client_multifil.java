package Multifils.eje1;

import java.net.InetSocketAddress;
import java.net.Socket;

public class client_multifil {
    public static void main(String[] args) {
        try {
            System.out.println("Creem el socket client");
            Socket clientSocket = new Socket();

            InetSocketAddress addr = new InetSocketAddress("192.168.18.138", 1234);
            clientSocket.connect(addr);
            System.out.println("Ens conectem");

            //codi client

            Thread.sleep(10000);

            //Tancant el socket client
            clientSocket.close();

        } catch (Exception e) { 
        }
    }
}
