package ua.dp.levelup.reflection;


/**
 * Created by andrey on 07.03.17.
 */
public class Main
{
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException
    {
        Book book = new Book(1, "test", 35);
        book.author = "Pushkin";


        Class aClass = book.getClass(); //get class sample
        book.setBookName("WAR");

        Class bookClass = Book.class; //get class sample

//        System.out.println("Book fields:");
//        Field[] fields = bookClass.getFields();
//
//        for (Field field : fields) System.out.println(field.getName());
//
//
//        System.out.println("Book declared fields:");
//        Field[] declaredFields = bookClass.getDeclaredFields();
//        for(Field field: declaredFields) System.out.println(field.getName());
//
//
//        System.out.println("Book methods");
//        Method[] methods = bookClass.getDeclaredMethods();
//        for (Method method : methods) System.out.println(method.getName());

//        System.out.println((String)bookClass.getDeclaredField("bookName").get(book));
//
//        bookClass.getDeclaredField("bookName").set(book, "PIECE");
//
//        System.out.println((String)bookClass.getDeclaredField("bookName").get(book));

//        Field field1 = bookClass.getDeclaredField("id");
//        field1.setAccessible(true);
//        field.setInt(book, 22);
//        System.out.println(field.get(book));
//
//                StringBuilder sb = new StringBuilder();
//                Field[] declaredFields = bookClass.getDeclaredFields();
//                for(Field field: declaredFields)
//                {
//                    if (!field.isAccessible())
//                    {
//                        field.setAccessible(true);
//                    }
//                    sb.append("<").
//                            append(field.getName()).
//                            append(">").
//                            append(field.get(book)).
//                            append("</").
//                            append(field.getName()).
//                            append(">");
//                }
//        System.out.println(sb.toString());

        XMLParser parser = new XMLParser();
        String bookAsXML = parser.toXml(book);
        System.out.println(bookAsXML);

        Author author = new Author("John", "Doe", 44);

        System.out.println(parser.toXml(author));

    }
}
