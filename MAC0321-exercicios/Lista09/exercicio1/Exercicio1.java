package exercicio1;

import java.io.*;

public class Exercicio1 {
    public static void main (String[] args) throws IOException {
        String pwd_read = "input.txt";
        String pwd_write = "output.txt";
        
        BufferedReader br = null;
        PrintWriter writer = null;
                
        try {
            br = new BufferedReader(new FileReader(pwd_read));
            writer = new PrintWriter(pwd_write, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }

        String line = null;
        String output = "Olá mundo";
        
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        output += " " + line;

        do {
            writer.println(output);
            output = "Olá mundo";

            line = br.readLine();
            output += " " + line;
        } while (line != null);

        br.close();
        writer.close();
    }
}
