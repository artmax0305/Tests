import javax.xml.crypto.Data;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class TaskOne {
    public static void methodSearch(ArrayList<BigInteger> mass){

        for (int i = 0; i < mass.size(); i++) {
            if (mass.get(i).equals(mass.get(i+1))){
                if(mass.get(i).equals(BigInteger.valueOf(i+1))) {
                    BigInteger multiply = mass.get(i).add(BigInteger.valueOf(1));
                    System.out.println(multiply);
                    break;
                }

            }
        }
    }

    public static void main(String[] args) {
        ArrayList<BigInteger> arrayList =new ArrayList<>();

        for (int i = 1; i < 10_000_000; i++) {
             arrayList.add(BigInteger.valueOf(i));
        }
        arrayList.set(10000, BigInteger.valueOf(10000));

        methodSearch(arrayList);
    }
}
