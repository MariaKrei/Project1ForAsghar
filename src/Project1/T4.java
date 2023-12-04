package Project1;

public class T4 {
    public static void main(String[] args) {
        int[][] numbers={
                {4, 8, 20, 7, 67},
                {5, 9, 78, 80},};
        int sumOdd=0;
        int sumEven=0;
        for (int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
                if(numbers[i][j]%2==0) {
                    sumEven=sumEven+numbers[i][j];
                }else{
                    sumOdd=sumOdd+numbers[i][j];
                }
            }
        }System.out.println("The sum of even numbers equal "+sumEven);
        System.out.println("The sum of odd numbers equals "+sumOdd);

    }
}
