import java.util.Scanner;
public class array_loop {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int[] marks = new int[5];
    
        int size = marks.length;  //lengh is used for size of the array

        for(int i=0; i<size; i++){
           System.out.println("Enter the value of "+(i+1)+" :");
           marks[i]=obj.nextInt();
        }

        for(int i=0; i<size; i++){
            System.out.println(marks[i]);
        }

    }
}
