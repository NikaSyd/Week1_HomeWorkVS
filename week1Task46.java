import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vsydorenko on 26.04.2017.
 */
public class week1Task46 {

    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        int num1 = Integer.parseInt(num);
        String num2 = reader.readLine();
        int num3 = Integer.parseInt(num2);

        int sumresult = num1+num3;

        if((sumresult >=11)&& (sumresult<=19)){
            System.out.println(sumresult);
        }
        else {
        }

    }

}


// 4.6. Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.