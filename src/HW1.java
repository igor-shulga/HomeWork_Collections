import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HW1 {
    public static void main (String... args) {
        List<Integer> list= new ArrayList<>();

        // uncomment to use manual adding to list
        /*
        list.add(3);
        list.add(33);
        list.add(-33);
        list.add(0);
        */


        // uncomment to use random adding to list
        /*
        int N = 10;  // N -- quantity of elements to generate
        Random rand = new Random();
            for (int i=0; i<N; i++) {
                int nextX = rand.nextInt(100);
                list.add(nextX);
}
        */

        Collections.sort(list);   // Sorting Collection List
        for( int elements:list){
            System.out.println(elements);
        }
    }
}
