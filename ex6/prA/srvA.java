package ex6.prA;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class srvA {
    public static void main(String[] args) {
        try {
            InetSocketAddress addrA = new InetSocketAddress("localhost", 5559);
            DatagramSocket socketA = new DatagramSocket(addrA);

            byte[] missatgeARebre = new byte[50];
            DatagramPacket missatgeRebut = new DatagramPacket(missatgeARebre, 50);
            socketA.recive(missatgeRebut);

            socketA.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
