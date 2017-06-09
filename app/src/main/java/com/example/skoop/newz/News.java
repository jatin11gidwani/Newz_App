package com.example.skoop.newz;

public class News {

    /**
     * Title of the News
     */
    private String mTitle;

    /**
     * Author of the News
     */
    private String mSection;

    /**
     * Website URL of the News
     */
    private String mUrl;

    public News(String Title, String Section, String Url) {
        mUrl = Url;
        mTitle = Title;
        mSection = Section;
    }

    /**
     * Returns the title of the News.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the Section of the News.
     */
    public String getSection() {
        return mSection;
    }

    /**
     * Returns the website URL to find more information about the news.
     */
    public String getUrl() {
        return mUrl;
    }
}
