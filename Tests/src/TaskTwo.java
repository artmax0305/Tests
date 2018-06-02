import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TaskTwo {
    public static void reverseOutput(String filename){
        try {
            StringBuilder stringBuilder=new StringBuilder();

           BufferedReader bufferedReader =new BufferedReader(new FileReader(filename));
           String s;
           while ((s=bufferedReader.readLine())!=null){
               stringBuilder.append(s);
               stringBuilder.append("\n");
           }
            String[] split = stringBuilder.toString().split(" ");
            for (int i = 1; i < split.length; i++) {
                if (i%5==0){
                    String[] split1 = split[i].split("");
                    List<String> lists = Arrays.asList(split1);
                    Collections.reverse(lists);
                    for (String list:lists) {
                        System.out.print(list);
                    }
                    System.out.println();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        reverseOutput("testfile.txt");
    }
}
