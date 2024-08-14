package Java.iostream;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        String data = "Hello, Byte Streams!";
        
        // 바이트 스트림을 사용하여 데이터 쓰기
        try (FileOutputStream fos = new FileOutputStream("Java/iostream/test.txt")) {
            fos.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 바이트 스트림을 사용하여 데이터 읽기
        try (FileInputStream fis = new FileInputStream("Java/iostream/test.txt")) {
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}