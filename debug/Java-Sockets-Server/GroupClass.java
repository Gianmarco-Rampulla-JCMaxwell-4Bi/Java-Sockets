package server;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alessandro.ampala/gianmarco.rampulla
 */
public class GroupClass {
    
    
    private String NomeGruppo;
    private List<SocketWorker> listaSocket = new ArrayList<>();
    
    public GroupClass(String name, SocketWorker socketDaAggiungere)
    {
        setNomeGruppo(name);
        listaSocket.add(socketDaAggiungere);
    }
    
    public void aggiungiUtente(SocketWorker socketDaAggiungere)
    {
        listaSocket.add(socketDaAggiungere);
    }
    
    
    
    public String getNomeGruppo() {
        return NomeGruppo;
    }

    public List<SocketWorker> getListaSocket() {
        return listaSocket;
    }
    
    private void setNomeGruppo(String NomeGruppo) {
        this.NomeGruppo = NomeGruppo;
    }
    
    public void sendMessageToGroup(String msg, SocketWorker sender)
    {
        for(SocketWorker c : listaSocket)
        {
            if(c != sender)
            {
                c.sendMessage(msg);
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    /*public void printNames(PrintWriter out)
    {
        for(String item : NomeGruppi)
        {
            out.println(item);
        }
    }

    public int getGroupSize() {
        return NomeGruppi.size();
    }
    
    
    
    public String searchListNameBySocketWorker(SocketWorker sw)
    {
        for(int i=0; i<)
    }*/

    

    
    
}
