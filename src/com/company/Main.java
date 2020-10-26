package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
        populateArray(animals);
        reverseArray(animals);
    }

    private static void populateArray(ArrayList<String> animals) {
        try {
            animals.add("Cat");
            animals.add("Dog");
            animals.add("Elephant");
            animals.add("Giraffe");
            animals.add("Squirrel");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println(animals);
        }
    }

    private static void reverseArray(ArrayList<String> animals) {
        ArrayList<String> reverseAnimals = new ArrayList<String>();
        try {
            for (int count = animals.size() - 1; count > -1; count--){
                reverseAnimals.add(animals.get(count));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println(reverseAnimals);
        }
    }
}
