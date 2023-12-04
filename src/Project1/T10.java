package Project1;

public class T10 {
    public static void main(String[] args) {

        int[] age={10, 25, 10, 57, 18, 27};
        for (int i = 0; i <age.length  ; i++) {
            for (int j = i+1; j <age.length ; j++) {
                if (age[i]==age[j]){
                    System.out.println("Duplicate Element is "+age[i]);

                }

            }

        }

    }
}
