import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by Computing on 19/10/2016.
 */


class Connect {
    public Connect(InetAddress address, int port) {


    }

}


public class M {
    public static void main(String[] args) throws IOException {

        InetAddress ip = InetAddress.getByName("192.168.0.185");
        int PORT = 5000;

        Socket s = new Socket(ip,PORT);
        PrintWriter out = new PrintWriter(s.getOutputStream(),true);

        //bool b = true;

            out.println("Henry Wallis did this");
            //BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));


            BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));


            //out.print("HELO");

            out.write("HELO");

            //s.close();




        System.out.print(s.getLocalPort());


    }
}
