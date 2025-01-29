package Multifils.ex1;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class server_multiclient extends Thread {
    Socket newSocket;

    public server_multiclient(Socket newSocket) {
        this.newSocket = new Socket();
    }

    public void run() {
        try {
            // atenc al client
            // preparo is i os per comunicar-me amb el client
            InputStream is = newSocket.getInputStream();
            OutputStream os = newSocket.getOutputStream();

            // atenc al client i em comunico mitjançant el socol
            // llegir del socol el nick del client
            String missatge = "Missatge rebut";
            byte[] text = new byte[80];
            is.read(text);
            os.write(missatge.getBytes());

            // llegir al sòcol el missatge rebut del client
            // mostrar el missatge format Nick: missatge
            // escriure missatge rebut i tornar a llegir missatge....

            // simulo temps d'atenció
            Thread.sleep(100);
        } catch (Exception e) {
        }
    }
}
