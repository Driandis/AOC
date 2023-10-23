import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;

import tools.MyFileReader;

public class CalorieCounter {

    //private MyFileReader reader = new MyFileReader();
    private static final String INPUT = "input/calories.txt";
    private static final String TEST = "input/check.txt";
    public static void main(String[] args) {

        ArrayList<Integer> temp;
        int current = 0;
        int max = 0;
        int hits = 0;

       MyFileReader reader = new MyFileReader();
       temp = reader.readFile(INPUT);
       for(int i = 1; i < temp.size(); i++){
           //System.out.println(temp.get(i));
           if(temp.get(i) == null){
               if(current > max) {
                   max = current;
                   hits++;
                   current = 0;
               }
               else {
                   current = 0;
               }
           }
           else {
               current = current + temp.get(i);
           }
       }
       System.out.println("Maximum calories: " + max + " Hits: " + hits);
    }


}
