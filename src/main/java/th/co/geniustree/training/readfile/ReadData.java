package th.co.geniustree.training.readfile;

import java.io.*;

public class ReadData {

     public void read() {
          try {
               FileReader pathFile = new FileReader("C:/Users/mbk_i/Desktop/output2.txt");
               BufferedReader readFile = new BufferedReader(pathFile);
               String massage;
               while ((massage = readFile.readLine()) != null){
                    System.out.println(massage);
               }
          } catch (IOException ex) {
               ex.printStackTrace();
          }
     }
}
