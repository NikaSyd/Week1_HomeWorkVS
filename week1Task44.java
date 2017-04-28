import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vsydorenko on 27.04.2017.
 */
public class week1Task44 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        double num1 = Double.parseDouble(num);

        if (num1 <= 1.0) {
            System.out.println("Число лежит в диапазоне от 0 до 1");
        } else {
            System.out.println("Число лежит не в диапазоне от 0 до 1");
        }
    }

}


//4.4. Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1