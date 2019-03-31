import java.io.*;
import java.lang.*;
 
public class detectPlag {

   public static void main(String[] args) {
      try {

         // print a message
         System.out.println("Executing... python getURL1.py");

         // create a process and execute python getURL1.py
         Process process = Runtime.getRuntime().exec("python /home/aadsah/bona-fide/codelets/getURL1.py");

         // print another message
         System.out.println("python getURL1.pyuld now open.");

      } catch (Exception ex) {
         ex.printStackTrace();
      }
   }
}