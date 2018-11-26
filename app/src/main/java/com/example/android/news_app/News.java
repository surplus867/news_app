package com.example.android.news_app;

public class News {

     private String mTitle;
     private String mAuthor;
     private String mUrl;
     private String mDate;
     private String mSection;



    public News(String title, String author, String url, String date, String section) {
        mTitle = title;
        mAuthor = author;
        mUrl = url;
        mDate = date;
        mSection = section;
    }

    public String getTitle() {
        return mTitle;
    }
    public void setTitle(String title) {
        mTitle = title;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public void setAuthor(String author) {
        mAuthor = author;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }
    public String getSection() {
        return mSection;
    }

    public void setSection(String section) {
        mSection = section;
    }
}
