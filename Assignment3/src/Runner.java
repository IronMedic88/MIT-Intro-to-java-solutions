

import java.sql.Array;
import java.util.Arrays;

import static java.util.Arrays.*;

public class Runner {
    String name;
    int time;

    Runner(String name, int time) {
        this.name = name;
        this.time = time;
    }
    Runner(){};

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    //sorts int arrays
    public static int [] arraySort(int [] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    //returns largest number in array
public int print(int  [] runners){
        int [] sorted = arraySort(runners);
        int largest = sorted[sorted.length -1];
        int second = sorted[sorted.length - 2];
        int ret = 0;
        for(int i = 0; i < sorted.length; i++){
            if(sorted[i] == largest){
                ret = sorted[i];
            }
        }
        return ret;

    }
}



















