public class TaskOne {
    public static void methodSearch(int[] mass){

        for (int i = 0; i < mass.length; i++) {
            if (mass[i]==mass[i+1]){
                System.out.println(mass[i]+1);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] ints =new int[]{1,2,3,4,4,6,7,8,9};
        methodSearch(ints);
    }
}
