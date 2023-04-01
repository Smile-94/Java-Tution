import java.util.ArrayList;
public class array {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 5;

        int[] newList = {1,2,3,4};

        System.out.println("Marks 0 is: "+marks[0]);
        System.out.println("Size of array "+marks.length);

        System.out.println(newList[0]);

        ArrayList<Integer> myList = new ArrayList<Integer>();
        
        // add elements to the ArrayList
        myList.add(1);
        myList.add(2);
        myList.add(3);
        
        // get the size of the ArrayList
        int size = myList.size();
        
        // print out the elements of the ArrayList
        for (int i = 0; i < size; i++) {
            System.out.println(myList.get(i));
    }
}
}
