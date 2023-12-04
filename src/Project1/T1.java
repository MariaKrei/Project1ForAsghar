package Project1;

public class T1 {
    public static void main(String[] args) {


        int [] temp={5, 12, 20, 46, 14, 11, 3};
        int largest=temp[0];
        int smalest=temp[0];
        for (int i=0;i<temp.length; i++ ){
            if (temp[i]>largest) {
                largest = temp[i];
            }
            if (temp[i]<smalest){
                smalest=temp[i];}


        }System.out.println("The largest number is "+largest);
        System.out.println("The smallest number is "+smalest);}
}


