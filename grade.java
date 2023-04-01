import java.text.NumberFormat.Style;
import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter something: ");
        int a = sc.nextInt();

        int first_term = 85;
        int mid_term = 90;
        int final_term = 95;

        float average = (first_term+mid_term+final_term)/3;

        if (average>90) {
            System.out.println("Grade is A "+average);
        } else if (average>80) {
            System.out.println("Grade is B "+average);
        } else if (average>70) {
            System.out.println("Grade is C "+average);
        } else if (average>60) {
            System.out.println("Grade is D "+average);
        } else {
            System.out.println("Fail");
        }

        for(int i=0; i<=10; i++){
            System.out.println(i);
        }
        
    }
}
