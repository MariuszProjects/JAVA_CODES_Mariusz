package org.example;
import java.util.HashSet;
import java.util.Set;

public class CatsHashSetExample {
//Create a Cat class with fields: name, colour, hasOwner, isHungry. Generate 5 cats and add
//them to a HashSet. Create a method that displays all cat’s names from the passed set.

 public class Cat {
         static void catList(String name, String color, String hasOwner, String isHungry){
        System.out.println("My cat name is " + name +  ", he is " + color + ". Does he has an owner ? "+ hasOwner+ ". Is he hungry? "+ isHungry);
}
}
    public static void main(String[] args) {
        Set<String> setNames = new HashSet<>();
        String name1 = "Black cat";
        String name2 = "Bonifacy";
        String name3 = "Filemon";
        String name4 = "Mruczek";
        String name5 = "Białek";
        setNames.add(name1);
        setNames.add(name2);
        setNames.add(name3);
        setNames.add(name4);
        setNames.add(name5);

        Set<String> setColor = new HashSet<>();
        String color1 = "white";
        String color2 = "black";
        String color3 = "brown";
        String color4 = "white-black";
        String color5 = "white-red";
        setColor.add(color1);
        setColor.add(color2);
        setColor.add(color3);
        setColor.add(color4);
        setColor.add(color5);

        Set<String> setOwner = new HashSet<>();
        String hasOwner1 = "Yes :)";
        String hasOwner2 = "No :(";
        String hasOwner3 = "Yes :)";
        String hasOwner4 = "No :(";
        String hasOwner5 = "Yes :)";

        setOwner.add(hasOwner1);
        setOwner.add(hasOwner2);
        setOwner.add(hasOwner3);
        setOwner.add(hasOwner4);
        setOwner.add(hasOwner5);

        Set<String> setHungry = new HashSet<>();
        String isHungry1 = "Yes :((";
        String isHungry2 = "No :))";
        String isHungry3 = "No :))";
        String isHungry4 = "No :))";
        String isHungry5 = "No :))";

        System.out.println("All cats names are: ");
        for (String setName : setNames) {
            System.out.println(setName);
        }
        System.out.println();
        System.out.println("Now, here we have the list of all cats: ");
        Cat.catList(name1, color1, hasOwner1, isHungry1);
        Cat.catList(name2, color2, hasOwner2, isHungry2);
        Cat.catList(name3, color3, hasOwner3, isHungry3);
        Cat.catList(name4, color4, hasOwner4, isHungry4);
        Cat.catList(name5, color5, hasOwner5, isHungry5);
    }
}



