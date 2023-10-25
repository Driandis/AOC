package aoc.day1.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Backpack {

    private int id;
    private int calories;
    private final List<Integer> food;

    private Backpack() {
        this.food = new ArrayList<>();
    }

    public static Backpack createBackpack(int id) {
        Backpack backpack = new Backpack();
        backpack.setId(id);
        return backpack;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void addFood(int foodItem) {
        food.add(foodItem);
    }

    public int getId() {
        return id;
    }

    public int getCalories() {
        return calories;
    }

    public List<Integer> getFood() {
        return food;
    }

    @Override
    public String toString() {
        return "Backpack ID: " + id + ", Calories: " + calories + ", Food: " + food.toString();
    }

    @Override
    public boolean equals(Object o) {
        if(this == o){
            return true;
        }
        if(o == null || getClass() != o.getClass()){
            return false;
        }
        Backpack second = (Backpack) o;
        return  id == second.id &&
                calories == second.calories &&
                Objects.equals(food, second.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, calories, food);
    }
}
