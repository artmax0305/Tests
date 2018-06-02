import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =new BufferedReader(new FileReader("testfile.txt"));
        StringBuilder stringBuilder =new StringBuilder();
        String s;
        while ((s=bufferedReader.readLine())!=null){
            stringBuilder.append(s);
            stringBuilder.append("\n");
        }
        int index = stringBuilder.lastIndexOf(".");
        stringBuilder.replace(index,index+1,"!");
        int index1 = stringBuilder.lastIndexOf(".");
        stringBuilder.replace(index1,index1+1,"!");
        int index2 = stringBuilder.lastIndexOf(".");
        String substring = stringBuilder.substring(index2+1, index1);
        System.out.println(substring);

    }
}
