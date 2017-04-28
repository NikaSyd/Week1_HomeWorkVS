import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vsydorenko on 28.04.2017.
 */
public class week1_additionalTask_count8 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();

        char[] array = num.toCharArray();
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == '8') {
                count++;
                System.out.println(count);
            }
        }

    }

}


//5.3. Посчитать сколько раз встречается символ 8 в заданном числе, которое вводит юзер
