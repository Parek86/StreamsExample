package inandout;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Reader {

    public void readSingleChar(){
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\user\\Desktop\\InAndOut\\test.txt");
            int i = fis.read();
            System.out.println((char) i);
            fis.close();
        } catch (Exception ex) {
            System.out.println(""+ex);
        }
    }
    
    public void readMultipleCharacters(){
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\user\\Desktop\\InAndOut\\test.txt");
            int i = 0;
            String result = "";
            while((i=fis.read()) != -1){
                result += (char) i;
            }
            System.out.println(result);
            fis.close();
        } catch (Exception ex) {
            System.out.println(""+ex);
        }
    }
    
    public void bufferedReader(){
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\user\\Desktop\\InAndOut\\test.txt");
            BufferedInputStream bin = new BufferedInputStream(fis);
            int i = 0;
            String result = "";
            while((i=bin.read()) != -1){
                result += (char) i;
            }
            System.out.println(result);
            fis.close();
        } catch (Exception ex) {
            System.out.println(""+ex);
        }
    }
    
}
