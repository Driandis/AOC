package aoc.day1;

import java.util.ArrayList;
import java.util.List;

import aoc.day1.model.Backpack;

public class CalorieCounter {

    private static final InputExtractor extractor = new InputExtractor();

    public static void main(String[] args) {

   List<Integer> allFoodItems = extractor.extractAll();
   List<Backpack> backpacks = extractor.getBackpacks(allFoodItems);
   //Check on empty list needed?
   int[] calories = new int[backpacks.size()];
   int maxCalories = 0;
   int id = 0;
   for(int i = 0; i < backpacks.size(); i++){
       calories[i] = backpacks.get(i).getCalories();
       if(calories[i] > maxCalories) {
           maxCalories = calories[i];
           id = backpacks.get(i).getId();
       }
   }
   System.out.println("Maximum calrories carried are " + maxCalories + " in backpack nr: " + id);
        /*
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

         */
    }
}
