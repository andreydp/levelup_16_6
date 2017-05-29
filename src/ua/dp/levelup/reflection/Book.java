package ua.dp.levelup.reflection;

/**
 * Created by andrey on 07.03.17.
 */
public class Book
{
    @ToXML
    private final long id;
    @ToXML
    public String bookName;
    private int pageCount;
    public String author;

    public long getId()
    {
        return id;
    }

    public Book(long id, String bookName, int pageCount)
    {
        this.id = id;
        this.bookName = bookName;
        this.pageCount = pageCount;
    }

    public String getBookName()
    {
        return bookName;
    }

    public void setBookName(String bookName)
    {
        this.bookName = bookName;
    }

    public int getPageCount()
    {
        return pageCount;
    }

    public void setPageCount(int pageCount)
    {
        this.pageCount = pageCount;
    }
}
