import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by vsydorenko on 26.04.2017.
 */
public class week1Task42 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[3];

        for(int i = 0; i < array.length; i++){

            array[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(array);
        System.out.println(array[2]);
        System.out.println(array[0]);
    }
}


//4.2. Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее