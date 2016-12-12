package ua.dp.levelup.homework.lesson10.Task2;

/**
 * Created by andrey on 11.12.16.
 */
public class Main
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Salad salad = new Salad("Greek");
        salad.addVegetable(new Tomato("Cumato", "Black", "Sweet"));
        salad.addVegetable(new Pepper("Pepper", 1, "Red", "Sweet", 5, true));
        salad.addVegetable(new Potato("Potato", "Yellow", "Sweet", 1));
        salad.addVegetable(new Tomato("Red tomato", 75, "Red", "Sweet", 2));
        System.out.println(salad);
        salad.sortSaladIngredientsByCalories();
        System.out.println(salad);

        Salad salad2 = (Salad) salad.clone();
        System.out.println(salad2);
        salad.setCalories(1000);
        System.out.println(salad);
    }
}
