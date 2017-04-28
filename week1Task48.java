import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vsydorenko on 27.04.2017.
 */
public class week1Task48 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        int num1 = Integer.parseInt(num);
        String num2 = reader.readLine();
        int num3 = Integer.parseInt(num2);

        int result = num1 % 10;
        int result1 = num3 % 10;

        if (result == result1){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }

}


//4.8. Вводим два числа, сравнить последнии цифры этих чисел (пользоваться оператором %)
// 124    4    -   true
//   1456   567  -   false
// 1      2    -   false
// 18     98   -   true