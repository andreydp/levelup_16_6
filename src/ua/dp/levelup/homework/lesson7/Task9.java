package ua.dp.levelup.homework.lesson7;

/**
 * Created by andreypo on 11/28/2016.
 */
public class Task9
{
    enum BookType
    {
        NOVEL, FAIRY_TALE, COMEDY, DRAMA, SCIENCE_FANTASTIC, DETECTIVE
    }

    public static class Book
    {
        String name;
        BookType bookType;
        String author;
        int year;

        public Book(String name, BookType bookType, String author, int year)
        {
            this.name = name;
            this.bookType = bookType;
            this.author = author;
            this.year = year;
        }
    }


    public static void main(String[] args)
    {
        Book book1 = new Book("Book1", BookType.NOVEL, "John Doe", 2016);
        Book book2 = new Book("Book2", BookType.FAIRY_TALE, "John Doe", 2015);
        Book book3 = new Book("Book3", BookType.COMEDY, "John Doe", 2014);
        Book book4 = new Book("Book4", BookType.DRAMA, "John Doe", 2012);
        Book book5 = new Book("Book5", BookType.SCIENCE_FANTASTIC, "John Doe", 2001);
        Book book6 = new Book("Book6", BookType.DETECTIVE, "John Doe", 2001);
    }
}
