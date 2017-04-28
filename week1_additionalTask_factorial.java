import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vsydorenko on 28.04.2017.
 */

public class week1_additionalTask_factorial {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        int num1 = Integer.parseInt(num);
        int res = 1;
        for (int i = 1; i <= num1; i++) {
            res = res * i;
        }
        System.out.println(num1);
        System.out.println(res);
    }
}

//5.2. Вычислить факториал числа.