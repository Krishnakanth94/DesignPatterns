package pattern.decorator.wrapper;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) throws FileNotFoundException {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("/media/krishna-leadics/Pers/DesignPatterns/src/pattern/decorator/wrapper/test")));
            while((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
            in.close();
        }catch (Exception e){
e.printStackTrace();
        }
    }
}
