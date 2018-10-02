package com.guigu.pojo;

import java.util.Date;

public class NewsInfo {
    private Integer newsId;

    private String newsTitle;

    private String newsAuthor;

    private String newsTime;

    private String newsAddress;

    private String newsStatus;

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle == null ? null : newsTitle.trim();
    }

    public String getNewsAuthor() {
        return newsAuthor;
    }

    public void setNewsAuthor(String newsAuthor) {
        this.newsAuthor = newsAuthor == null ? null : newsAuthor.trim();
    }

    public String getNewsAddress() {
        return newsAddress;
    }

    public void setNewsAddress(String newsAddress) {
        this.newsAddress = newsAddress == null ? null : newsAddress.trim();
    }

    public String getNewsStatus() {
        return newsStatus;
    }

    public void setNewsStatus(String newsStatus) {
        this.newsStatus = newsStatus == null ? null : newsStatus.trim();
    }

	public String getNewsTime() {
		return newsTime;
	}

	public void setNewsTime(String newsTime) {
		this.newsTime = newsTime;
	}
}