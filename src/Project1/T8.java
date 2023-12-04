package Project1;

public class T8 {
    public static void main(String[] args) {
        int[] num={10,25,97,2,33,57,89};
        int largest=num[0], min=num[0];

        for (int i = 1; i <num.length ; i++) {
            if( largest<num[i]){
                largest=num[i];

            }else if(min>num[i]){
                min=num[i];
            }

        }
        System.out.println(largest);
        System.out.println(min);

    }
}
