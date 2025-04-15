import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };
        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };

        Runner[] runners = new Runner[names.length];
        for (int i = 0; i < names.length; i++) {
            runners[i] = new Runner(names[i], times[i]);
        }

        //make TreeMap to hold key and value pairs
        TreeMap<Integer, String> sortHash = new TreeMap <>();
        for(int i = 0; i < names.length; i++){
            sortHash.put(runners[i].getTime(), runners[i].getName());
        }

        //sorting hashmap
        TreeMap<Integer, String> postSort = new TreeMap<>();
        postSort.putAll(sortHash);
        //get the name by using an int key
        if(postSort.containsKey(runners[0].print(times))){
            System.out.println(postSort.get(runners[0].print(times)));
        }

        //prints the time of the fastest runner
        for(int i = 0; i < names.length; i++){
            if(runners[0].print(times) == times[i]){
                System.out.println(times[i]);
            }
        }


        //prints TreeMap;
        System.out.println(postSort);




    }
}
