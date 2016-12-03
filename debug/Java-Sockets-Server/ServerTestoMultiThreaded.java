/*
 * ServerTesto MultiThreaded.java Server che attende per richieste di connessioni da Clients
 * e li gestisce in modo contemporaneo generando un socket "worker" per ogni connessione.
 * 
 */

/**
 *
 * @author Prof. Matteo Palitto
 */
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class ServerTestoMultiThreaded {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        /*if (args.length != 1) {
            System.out.println("Uso: java ServerTestoMultithreaded <Porta Server>");
            return;
        }*/
        
        int portNumber = s.nextInt();


        try{
            ServerSocket server = new ServerSocket(portNumber);
            System.out.println("Server di Testo in esecuzione...  (CTRL-C quits)\n");

            while(true){
                SocketWorker w;
                try {
                    //server.accept returns a client connection
                    w = new SocketWorker(server.accept());
                    Thread t = new Thread(w);
                    t.start();
                } catch (IOException e) {
                    System.out.println("Connessione NON riuscita con client: ");
                    System.exit(-1);
                }
            }
        } catch (IOException e) {
            System.out.println("Error! Porta: " + portNumber + " non disponibile");
            System.exit(-1);
        }

        
    }
}
