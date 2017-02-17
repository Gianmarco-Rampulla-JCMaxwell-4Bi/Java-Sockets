/*
 * socketWorker.java ha il compito di gestire la connessione al socket da parte di un Client.
 * Elabora il testo ricevuto che in questo caso viene semplicemente mandato indietro con l'aggiunta 
 * di una indicazione che e' il testo che viene dal Server.
 */
package server;

import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Prof. Matteo Palitto
 */
public class SocketWorker extends Thread {
  private Socket client;
  
  static List<String> utenti = new ArrayList<String>();

    //Constructor: inizializza le variabili
    SocketWorker(Socket client) {
        this.client = client;
        System.out.println("Connesso con: " + client);
    }

    // Questa e' la funzione che viene lanciata quando il nuovo "Thread" viene generato
    public void run(){
    	BufferedReader in = null;
        PrintWriter out = null;
        try{
          // connessione con il socket per ricevere (in) e mandare(out) il testo
          in = new BufferedReader(new InputStreamReader(client.getInputStream()));
          out = new PrintWriter(client.getOutputStream(), true);
        } catch (IOException e) {
          System.out.println("Errore: in|out fallito");
          System.exit(-1);
        }
        
    	String line = "";
        //SETTAGGIO USERNAME
        try{
            do
            {
                //richiede username al client
                out.println("Scegli NickName: ");
                //riceve username dal client
                line = in.readLine();
            }while(ControlloLista(line) == true);
            utenti.add(line); //aggiunge utente alla list
            
           
            System.out.println("NickName host: " + line);
        }catch(IOException e){
        	System.out.println("Ricezione username fallita");
        	System.exit(-1);
        }
        
        
        

        
        String clientPort = line; //il "nome" del mittente (client)
        while(line != null){
          try{
            line = in.readLine();
            //Manda lo stesso messaggio appena ricevuto con in aggiunta il "nome" del client
            out.println("Server-->" + clientPort + ">> " + line);
            //controlla se la lista utenti è richiesta
            if(line.equals("listaUtenti"))
            {
                out.println(getLista());
            }
            
            //scrivi messaggio ricevuto su terminale
            System.out.println(clientPort + ">> " + line);
           } catch (IOException e) {
            System.out.println("lettura da socket fallito");
            try {
            client.close();
            System.out.println("connessione con client: " + client + " terminata!");
            line = null;
            } catch (IOException e1) {
                System.out.println("Errore connessione con client: " + client);
            }
           }
        }
    }
    
    
    private boolean ControlloLista(String nick)
    {
        for(int i=0; i<utenti.size(); i++)
        {
            if(nick.equals(utenti.get(i)))
            {
                return true;
            }
        }
        return false;
    }
    
    private String getLista()
    {
        StringBuilder str = new StringBuilder();
        for(int i=0; i<utenti.size(); i++)
        {
            str.append("[" + (i+1) + "]" + utenti.get(i) + "\n");
        }
        return str.toString();
    }
}
