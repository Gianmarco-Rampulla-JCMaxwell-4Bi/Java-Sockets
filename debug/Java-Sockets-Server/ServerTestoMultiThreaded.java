package server;

/*
 * ServerTesto MultiThreaded.java Server che attende per richieste di connessioni da Clients
 * e li gestisce in modo contemporaneo generando un socket "worker" per ogni connessione.
 * 
 */

import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ServerTestoMultiThreaded {
    
    public static List<GroupClass> gruppi = new ArrayList<GroupClass>();
    public static List<String> utenti = new ArrayList<String>();
    
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
    
    public static boolean checkGroup(String nome)
    {
        for(int i=0; i<gruppi.size(); i++)
        {
            if(gruppi.get(i).getNomeGruppo().equals(nome))
                return true;
        }
        return false;
    }
    
    public static boolean ControllaNickname(String nick)
    {
        for(int i=0; i<gruppi.size(); i++)
        {
            if(utenti.get(i).equals(nick))
                return true;
        }
        return false;
    }
    
    public static void printUtentiFromNomeGruppo(String nomeGruppo, PrintWriter out)
    {
        for(int i=0; i<gruppi.size(); i++)
        {
            if(gruppi.get(i).getNomeGruppo().equals(nomeGruppo))
            {
                for(int j=0; j<gruppi.get(i).getListaSocket().size(); j++)
                {
                    out.println(gruppi.get(i).getListaSocket().get(j));
                }
            }
        }
    }

}
