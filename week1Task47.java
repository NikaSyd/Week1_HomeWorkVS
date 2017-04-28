import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vsydorenko on 27.04.2017.
 */
public class week1Task47 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        int num1 = Integer.parseInt(num);
        String num2 = reader.readLine();
        int num3 = Integer.parseInt(num2);
        int result;


        result = num1 / num3;

        if (num1 % num3 == 0) {
            System.out.println("true");
            System.out.println(result);
        } else {
            System.out.println("false");
            System.out.println(result);
            System.out.println(num1 % num3);
        }

    }
}


//4.7. Вводим два числа, если одно из них делиться на другое без остатка, то выводим тру и показываем результат деления (целую часть от деления  и остачу)
//в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу)