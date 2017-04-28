import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vsydorenko on 26.04.2017.
 */
public class week1Task45 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        int num1 = Integer.parseInt(num);
        String num2 = reader.readLine();
        int num3 = Integer.parseInt(num2);

        if (num1 > num3) {
            int difresult = num1 - num3;
            System.out.println(difresult);
        } else {
            int sumresult = num1 + num3;
            System.out.println(sumresult);
        }
    }
}


