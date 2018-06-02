import org.jsoup.Jsoup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TaskThree {
            public  static void html(String ref){
                HttpURLConnection connection = null;
                try {
                    connection = (HttpURLConnection) new URL(ref).openConnection();
                    BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    StringBuilder stringBuilder =new StringBuilder();
                    String s;
                    while ((s=bufferedReader.readLine())!=null){
                        stringBuilder.append(s);
                        stringBuilder.append("\n");
                    }
                    String[] split = stringBuilder.toString().split("[.]");
                    int length = split.length;
                    String s1 = split[length - 3];
                    System.out.println(s1);
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    if(connection!=null){
                        connection.disconnect();
                    }
                }
            }

    public static void main(String[] args) {
        html("http://morepesen.ru/");
    }
}
