package ua.dp.levelup.homework.lesson10.Task1b;

import java.util.Arrays;

/**
 * Created by andreypo on 12/8/2016.
 */
class Page
{
    static int PAGES_COUNTER = 0;
    private int pageId;
    private int photosOnPage = 0;
    private final static int DEFAULT_PHOTOS_ON_PAGE = 10;
    private Photo[] pagePhotosArray = new Photo[DEFAULT_PHOTOS_ON_PAGE];

    public Page(Photo photo)
    {
        pagePhotosArray = new Photo[DEFAULT_PHOTOS_ON_PAGE];
        pagePhotosArray[0] = photo;
        photosOnPage++;
        pageId = ++PAGES_COUNTER;
    }

    public Page()
    {
        pagePhotosArray = new Photo[DEFAULT_PHOTOS_ON_PAGE];
        pageId = ++PAGES_COUNTER;
    }

    public int getNumberOfPhotos()
    {
        return photosOnPage;
    }

    public Photo[] getPagePhotosArray()
    {
        return pagePhotosArray;
    }

    void addPhoto(Photo photo)
    {
        for (int i = 0; i < pagePhotosArray.length; i++)
        {
            if (null == pagePhotosArray[i])
            {
                pagePhotosArray[i] = photo;
                photosOnPage++;
                break;
            }
            if (photosOnPage >= DEFAULT_PHOTOS_ON_PAGE)
            {
                pagePhotosArray = Arrays.copyOf(pagePhotosArray, pagePhotosArray.length + 1);
                pagePhotosArray[pagePhotosArray.length - 1] = photo;
                photosOnPage++;
                break;
            }
        }
    }

    public void setPageId(int pageId)
    {
        this.pageId = pageId;
    }

    public static void main(String[] args)
    {
        Photo[] pp1 = new Photo[5];
        Page page1 = new Page();
        for (int i = 0; i < pp1.length; i++)
        {
            pp1[i] = new Photo("Name " + i);
            page1.addPhoto(pp1[i]);
        }
        System.out.println(page1.getNumberOfPhotos());
        System.out.println(Arrays.toString(page1.getPagePhotosArray()));
        page1.addPhoto(new Photo("Yura Morozov"));
        System.out.println(Arrays.toString(page1.getPagePhotosArray()));
    }

    void addPhoto(String name)
    {
        addPhoto(new Photo(name));
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Page page = (Page) o;

        if (photosOnPage != page.photosOnPage && pageId != page.pageId) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(pagePhotosArray, page.pagePhotosArray);
    }

    @Override
    public int hashCode()
    {
        int result = photosOnPage;
        result = 32 * result + Arrays.hashCode(pagePhotosArray);
        return result;
    }

    @Override
    public String toString()
    {
        return "Page{" +
                "pageId=" + pageId +
                ", photosOnPage=" + photosOnPage +
                ", pagePhotosArray=" + Arrays.toString(pagePhotosArray) +
                '}';
    }
}
