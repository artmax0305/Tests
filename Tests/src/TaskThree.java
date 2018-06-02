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
                    int index = stringBuilder.lastIndexOf(".");
                    stringBuilder.replace(index,index+1,"!");
                    int index1 = stringBuilder.lastIndexOf(".");
                    stringBuilder.replace(index1,index1+1,"!");
                    int index2 = stringBuilder.lastIndexOf(".");
                    String substring = stringBuilder.substring(index2+1, index1);
                    System.out.println(substring);
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    if(connection!=null){
                        connection.disconnect();
                    }
                }
            }

    public static void main(String[] args) {
        html("https://support.microsoft.com/ru-ru/help/310521/how-to-create-and-edit-an-html-document-with-microsoft-word-2002");
    }
}
