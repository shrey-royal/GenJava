import java.util.Iterator;
import java.util.Vector;

public class Vecktor {
    public static void main(String[] args) {
        Vector<Integer> nums = new Vector<>();

        //Randomly add elements to the vector
        for (int i = 0; i < 10; i++) {
            nums.add((int)(Math.random() * 100));
        }

        System.out.println(nums);

        System.out.println(nums.get(3));

        Iterator<Integer> it = nums.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
    }
}

/*
Vector is a growable array of objects.

Methods of Vector:

Same as ArrayList except that all the methods of Vector are synchronized.


*/