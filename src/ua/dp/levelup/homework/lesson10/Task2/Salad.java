package ua.dp.levelup.homework.lesson10.Task2;

import java.util.Arrays;

/**
 * Created by andrey on 11.12.16.
 */
public class Salad implements Cloneable
{
    private String name;
    private Vegetable[] ingredients;
    private int calories = 0;

    public Salad(String name)
    {
        this.name = name;
    }

    void addVegetable(Vegetable vegetable)
    {
        if (ingredients != null && ingredients.length > 0)
        {
            ingredients = Arrays.copyOf(ingredients, ingredients.length + 1);
            ingredients[ingredients.length - 1] = vegetable;
            this.calories += vegetable.getCalories();
        }
        else
        {
            ingredients = new Vegetable[1];
            ingredients[0] = vegetable;
            this.calories += vegetable.getCalories();
        }
    }

    void sortSaladIngredientsByCalories()
    {
        if (ingredients == null || ingredients.length == 0)
        {
            System.out.println("Salad ingredients array is empty!");
        }
        else
        {
            Vegetable bufVegetable;
            for (int i = 0; i < ingredients.length; i++)
            {
                for (int j = 1; j < ingredients.length - 1; j++)
                {
                    if (ingredients[j - 1].getCalories() > ingredients[j].getCalories())
                    {
                        bufVegetable = ingredients[j - 1];
                        ingredients[j - 1] = ingredients[j];
                        ingredients[j] = bufVegetable;
                    }
                }
            }
        }
    }

    public Salad(String name, Vegetable[] ingredients)
    {
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Vegetable[] getIngredients()
    {
        return ingredients;
    }

    public void setIngredients(Vegetable[] ingredients)
    {
        this.ingredients = ingredients;
    }

    public int getCalories()
    {
        return calories;
    }

    public void setCalories(int calories)
    {
        this.calories = calories;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Salad salad = (Salad) o;

        if (calories != salad.calories) return false;
        if (name != null ? !name.equals(salad.name) : salad.name != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(ingredients, salad.ingredients);

    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    @Override
    public int hashCode()
    {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(ingredients);
        result = 31 * result + calories;
        return result;
    }

    @Override
    public String toString()
    {
        return "Salad{" +
                "name='" + name + '\'' +
                ", ingredients=" + Arrays.toString(ingredients) +
                ", calories=" + calories +
                '}';
    }
}
