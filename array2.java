import java.util.ArrayList;

public class array2 {
    
    public static void main(String[] args) {
        //Array decelaration
        int[] myArray = new int[5];
        myArray[4] = 5;
        myArray[0] = 3;
        myArray[1] = 4;

        System.out.println("Value of 5: "+myArray[4]);

        int[] marks = {1,2,3,3,4,6,7};

        System.out.println("Value of 0: "+marks[0]);


        int size = myArray.length;//array size

        System.out.println("Size of Array: "+size );
    }

    ArrayList<Integer> Score = new ArrayList<Integer>() ;

    Score.add(1);
    Score.add(2);

    
}
