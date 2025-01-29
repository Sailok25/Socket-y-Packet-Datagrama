package Multifils.eje1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class server_multifil {
    public static void main(String[] args) {
        try {
            System.out.println("Creem el socket servidor");
            ServerSocket serverSocket = new ServerSocket();
            InetSocketAddress addr = new InetSocketAddress("localhost", 5556);
            System.out.println("Fem el bind. Ja acceptem connexions...");
            serverSocket.bind(addr);
            serverSocket.close();
            int conn = 1;
            while (true) {
                System.out.println("Acceptant connexions");
                Socket newSocket = serverSocket.accept();
                System.out.println("Conexión rebuda" + conn);
                new atendre_clients(newSocket).start();
                conn++;
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
