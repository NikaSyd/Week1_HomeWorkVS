import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vsydorenko on 26.04.2017.
 */
public class week1Task41 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        int num1 = Integer.parseInt(num);

     if ((num1 >=9) && (num1 <=18)){
            System.out.println("Я на работе");
        } else {
            System.out.println("Я отдыхаю");
        }
    }

}
