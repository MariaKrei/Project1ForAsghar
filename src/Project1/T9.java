package Project1;

public class T9 {
    public static void main(String[] args) {
        int[] numbers={16, 80, 36, 20, 89, 7};
        int secondLargest=0;
        int largestNumber=0;
        for (int i = 0; i<numbers.length; i++) {
            if (largestNumber<numbers[i]){
                secondLargest=largestNumber;
                largestNumber=numbers[i];


            }else if(numbers[i]>secondLargest) {
                secondLargest=numbers[i];
            }

        } System.out.println(secondLargest);
    }
}
