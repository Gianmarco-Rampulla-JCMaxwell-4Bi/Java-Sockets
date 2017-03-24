package server;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alessandro.ampala
 */
public class GroupClass {
    
    
    private static List<String> NomeGruppi = new ArrayList<>();
    private static List<List<String>> gruppi = new ArrayList<>();
    
    
    public static void printNames(PrintWriter out)
    {
        for(String item : NomeGruppi)
        {
            out.println(item);
        }
    }

    public static int getGroupSize() {
        return NomeGruppi.size();
    }
    
    public static boolean checkGroup(String nome)
    {
        for(String item : NomeGruppi)
        {
            if(item.equals(nome))
                return true;
        }
        return false;
    }
    
}