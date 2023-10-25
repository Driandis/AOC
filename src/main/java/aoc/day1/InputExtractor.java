package aoc.day1;

import java.util.ArrayList;
import java.util.List;

import aoc.day1.model.Backpack;
import tools.MyFileReader;
public class InputExtractor {
    private static final String INPUT = "aoc/day1/input/calories.txt";
    private static final String EQUAL_TEST = "aoc/day1/input/booktest1.txt";

    private ArrayList<Integer> allFoodItems;
    private ArrayList<Backpack> allBackpacks = new ArrayList<>();
    public List<Integer> extractAll(){
        MyFileReader reader = new MyFileReader();
        allFoodItems = reader.readFile(EQUAL_TEST);
        return allFoodItems;
    }

    public List<Backpack> getBackpacks(List<Integer> list){
        int number = 0;
        int calories = 0;
        if(list.isEmpty()) {
            return new ArrayList<>();
        }
        allBackpacks.add(Backpack.createBackpack(number));
        for (Integer integer : list) {
            if (integer != null) {
                allBackpacks.get(number)
                        .addFood(integer);
                calories += integer;
            } else {
                allBackpacks.get(number)
                        .setCalories(calories);
                //Just to test the toString() method
                //System.out.println(allBackpacks.get(number).toString());
                calories = 0;
                allBackpacks.add(Backpack.createBackpack(++number));
            }
        }
        return allBackpacks;
    }
}
