/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.training.readfile;

import java.io.*;

public class FileData {

     public void writeData() {
          try {
               File pathFileSave = new File("C:/Users/mbk_i/Desktop/output.txt");
               FileOutputStream createFile = new FileOutputStream(pathFileSave);
               OutputStreamWriter writeStream = new OutputStreamWriter(createFile, "UTF-8");
               Writer write = new BufferedWriter(writeStream);
               String massage = "พี่อิฐ พี่นายคะ พรุ่งนี้ 9.30 - 16.30 มีนัดทดสอบระบบ UCEP ฝั่ง NCH นะคะ แต่ทางพี่หลินยังไม่ได้ระบุห้องมาค่ะ"
                       + " รบกวนพี่อิฐ กับพี่นายเข้าร่วมประชุมด้วยได้ไหมคะ";
               write.write(massage);
               write.close();
          } catch (IOException ex) {
               ex.printStackTrace();
          }

     }

}
