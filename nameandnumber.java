/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package answer.pseudo;
import java.io.*;


/**
 *
 * @author ankur
 */
public class nameandnumber {
    public static void main(String ar[])throws IOException
    {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        System.out.println("enter a name");
        String s=br.readLine();
         display(s);
    }
    private static void display(String s)
    {
        int min=6, max=15;
        int r=min+(int)(Math.random()*((max-min)+1));
        System.out.println(s+r);
          
                    
              
    }
}
