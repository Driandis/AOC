package aoc.day1;

import java.util.List;

import aoc.day1.model.Backpack;

public class BookTests {

    private static final InputExtractor extractor = new InputExtractor();

    public static void main(String[] args) {

        List<Integer> allFoodItems = extractor.extractAll();
        List<Backpack> backpacks = extractor.getBackpacks(allFoodItems);
        Backpack firstBackpack = backpacks.get(0);
        Backpack secondBackpack = backpacks.get(0);
        Backpack thirdBackpack = Backpack.createBackpack(0);
        thirdBackpack.addFood(2936);
        thirdBackpack.addFood(2154);
        thirdBackpack.addFood(1578);
        thirdBackpack.addFood(4820);
        thirdBackpack.addFood(5674);
        thirdBackpack.addFood(5582);
        thirdBackpack.addFood(2392);
        thirdBackpack.addFood(6148);
        thirdBackpack.addFood(1276);
        thirdBackpack.addFood(1783);
        thirdBackpack.addFood(2572);
        //Switch last to items
        thirdBackpack.addFood(3526); //last
        thirdBackpack.addFood(5067);


        System.out.println(firstBackpack.equals(secondBackpack));
        System.out.println(firstBackpack.equals(thirdBackpack));
        System.out.println(firstBackpack.toString());
        System.out.println(secondBackpack.toString());
        System.out.println(thirdBackpack.toString());

    }
}
