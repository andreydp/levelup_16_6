package ua.dp.levelup.homework.lesson20;

/**
 * Created by andrey on 25.01.17.
 */
public class InvalidListIndexException extends RuntimeException
{
    public InvalidListIndexException()
    {
    }

    public InvalidListIndexException(String message)
    {
        super(message);
    }

    public InvalidListIndexException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
