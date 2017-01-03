/*
 * ServerTesto MultiThreaded.java Server che attende per richieste di connessioni da Clients
 * e li gestisce in modo contemporaneo generando un socket "worker" per ogni connessione.
 * 
 */


import java.net.*;
import java.io.*;
import java.util.Scanner;
import javaapplication7.KeyListen;


public class ServerTestoMultiThreaded {

    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        
        System.out.print("Inserisci numero porta: ");
        int portNumber = s.nextInt();
         KeyListen C = new KeyListen(); //creo ascoltatore comandi

        try{
            ServerSocket server = new ServerSocket(portNumber);
            System.out.println("Server di Testo in esecuzione...  (CTRL-C quits)\n");
             C.start(); //faccio partire il thread per l'ascolto
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
