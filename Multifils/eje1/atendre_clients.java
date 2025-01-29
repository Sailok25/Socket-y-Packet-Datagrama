package Multifils.eje1;

import java.io.IOException;
import java.net.Socket;

class atendre_clients extends Thread {
    private Socket newSocket = null;

    public atendre_clients(Socket cs) {
        newSocket = cs;
    }

    public void run() {
        try {
            Thread.sleep(10000);
            // atenc al client
            newSocket.close();
            System.out.println("Tanquem nou socket");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
