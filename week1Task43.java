import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vsydorenko on 27.04.2017.
 */
public class week1Task43 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        int num1 = Integer.parseInt(num);

        if (num1 % 7 == 0) {
            int result = num1 * 2;
            System.out.println(result);
        }
    }
}

//4.3. Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.