package ua.dp.levelup.homework.lesson10.Task1b;

import java.util.Arrays;

/**
 * Created by andreypo on 12/8/2016.
 */
class Photo
{
    static int PHOTO_COUNTER = 0;
    //    2) Создать объект класса Фотоальбом, используя классы Фотография, Страница. Методы: задать название фотографии, дополнить фотоальбом фотографией, вывести на консоль количество фотографий.
    private int photoId;
    private String photoName;
    public Photo(String photoName)
    {
        this.photoName = photoName;
        this.photoId = ++PHOTO_COUNTER;
    }

    public Photo()
    {
        this.photoName = "";
        this.photoId = ++PHOTO_COUNTER;
    }

    public String getPhotoName()
    {
        return photoName;
    }

    public void setPhotoName(String photoName)
    {
        this.photoName = photoName;
    }

    public int getPhotoId()
    {
        return photoId;
    }

    public void setPhotoId(int photoId)
    {
        this.photoId = photoId;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Photo photo = (Photo) o;

        return photoId == photo.photoId && (photoName != null ? photoName.equals(photo.photoName) : photo.photoName == null);

    }

    @Override
    public int hashCode()
    {
        int result = photoId;
        result = 31 * result + (photoName != null ? photoName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString()
    {
        return "Photo{" + "photoId=" + getPhotoId() + ", photoName='" + getPhotoName() + '\'' + '}';
    }
}
