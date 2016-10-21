import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.lang.System;
import java.util.*;

/**
 * Created by Computing on 21/10/2016.
 */
public class S {
    public static void main(String[] args){

       /* InetAddress myAddress = null;
        try {
            myAddress = InetAddress.getByName("192.168.0.185");
            Socket clientSocket = new Socket(myAddress, 5000);
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true); //
            out.println("CHICKEN AND RICEEEE");
            //BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            // BufferedReader stdIn = new BufferedReader(System.in=);
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
        Program1 prog1 = new Program1();
        Program2 prog2 = new Program2();
       // prog1.run();
       // prog2.run();

        Thread t1 = new Thread(prog1);
        Thread t2 = new Thread(prog2);
        t1.start();
        t2.start();
    }
}


class Program1 extends Thread{
    Random rnd = new Random();

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println("I am Program 1: " + rnd.nextInt(100));
        }
    }
}

class Program2 extends Thread{
    Random rnd = new Random();
@Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("I am Program 2: " + rnd.nextInt(40));
        }
    }
}






















