package ua.dp.levelup.model;

/**
 * Created by java on 11.11.2016.
 */
public class Main
{
    static String lessonNumber = "lesson3";
    public static void main(String[] args)
    {
        Square s1 = new Square();
        Square s2 = new Square(25d);
        Square s3 = new Square("Blue", 26d);
        System.out.println(s2.color);
//        s1.perimiter = 16;
//        s1.color = "Black";
//        s1.side = 4;
//        System.out.println(s1.getPerimeter());

 /*       System.out.println("Begin program");
        String global = "Global var";
        {
            String local = "Local var";
            {
                System.out.println("Local scope :");
                System.out.println("global= " + global);
                System.out.println("local=" + local);
            }
        }
        System.out.println("_______________");
        System.out.println("Global scope :");
        System.out.println("global= " + global);
//        System.out.println("local=" + local);
        System.out.println();
        System.out.println("End program");
        System.out.println(lessonNumber);*/
    }
}
