package Project1;

public class T3 {
    public static void main(String[] args) {
        int[][] numbers={
                {4, 8, 20, 7, 67},
                {5, 9, 78, 80},};

        int odd=0;
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
                if(numbers[i][j]%2==0){
                    System.out.print(numbers[i][j]+" ");
                }



            };
        }
    }
}
