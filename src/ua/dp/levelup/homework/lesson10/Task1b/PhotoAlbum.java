package ua.dp.levelup.homework.lesson10.Task1b;

import java.util.Arrays;

/**
 * Created by andreypo on 12/8/2016.
 */
public class PhotoAlbum
{
    private Page[] photoAlbumPages;

    public PhotoAlbum(Page[] photoAlbumPages)
    {
        this.photoAlbumPages = photoAlbumPages;
    }

    public PhotoAlbum()
    {
        photoAlbumPages = new Page[1];
        photoAlbumPages[0] = new Page();
    }

    public Page[] getPhotoAlbumPages()
    {
        return photoAlbumPages;
    }

    public void setPhotoAlbumPages(Page[] photoAlbumPages)
    {
        this.photoAlbumPages = photoAlbumPages;
    }

    void setPhotoNameById(int photoId, String name)
    {
        for (Page page : photoAlbumPages)
        {
            for (Photo photo : page.getPagePhotosArray())
            {
                if (photoId == photo.getPhotoId())
                {
                    photo.setPhotoName(name);
                }
            }
        }
    }

    //Suppose to add to the ending page of the album
    void addPhoto(Photo photo)
    {
        if (photoAlbumPages.length > 1)
        {
            getPhotoAlbumPages()[getPhotoAlbumPages().length - 1].addPhoto(photo);
        }
        else
        {
            photoAlbumPages[0].addPhoto(photo);
        }
    }

    void addPhoto(int pageId, Photo photo)
    {
        if (null != photoAlbumPages[pageId])
        {
            photoAlbumPages[pageId].addPhoto(photo);
        }
    }

    void addPhoto(Page page, Photo photo)
    {
        page.addPhoto(photo);
    }

    void addPhoto(int pageId, String photoName)
    {
        addPhoto(pageId, new Photo(photoName));
    }

    void addPhotoOnNewPage(Photo photo)
    {
        Page newPage = new Page();
        photoAlbumPages = Arrays.copyOf(photoAlbumPages, photoAlbumPages.length + 1);
        photoAlbumPages[photoAlbumPages.length - 1] = newPage;
        newPage.addPhoto(photo);
    }

    int getPhotosAmount()
    {
        int result = 0;
        for (Page page : photoAlbumPages)
        {
            result += page.getNumberOfPhotos();
        }
        return result;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhotoAlbum that = (PhotoAlbum) o;

        return Arrays.equals(photoAlbumPages, that.photoAlbumPages);
    }

    @Override
    public int hashCode()
    {
        int result = 34;
        return result * Arrays.hashCode(photoAlbumPages);
    }

    @Override
    public String toString()
    {
        return "PhotoAlbum{" + "photoAlbumPages=" + Arrays.toString(photoAlbumPages) + '}';
    }

    public static void main(String[] args)
    {
        PhotoAlbum a1 = new PhotoAlbum();
        a1.addPhoto(new Photo("New year 2010"));
//        a1.addPhoto(new Photo("New year 2011"));
//        a1.addPhoto(new Photo("New year 2012"));
//        a1.addPhoto(new Photo("New year 2013"));
//        a1.addPhoto(new Photo("New year 2014"));
//        a1.addPhoto(new Photo("New year 2015"));
//        a1.addPhoto(new Photo("New year 2016"));
//        a1.addPhoto(new Photo("New year 2017"));
//        a1.addPhoto(new Photo("New year 2018"));
//        a1.addPhoto(new Photo("New year 2019"));
//        a1.addPhoto(new Photo("New year 2020"));
        a1.addPhotoOnNewPage(new Photo("Corporate 2016"));

        System.out.println(a1);
    }
}
