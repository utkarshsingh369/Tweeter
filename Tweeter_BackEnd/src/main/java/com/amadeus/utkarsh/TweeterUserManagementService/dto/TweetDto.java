package com.amadeus.utkarsh.TweeterUserManagementService.dto;

public class TweetDto {
    private int tweet_id;
    private String caption;
    private int postedByUserId;

    public TweetDto(int tweet_id, String caption, int postedByUserId) {
        this.tweet_id = tweet_id;
        this.caption = caption;
        this.postedByUserId = postedByUserId;
    }

    public int getTweet_id() {
        return tweet_id;
    }

    public void setTweet_id(int tweet_id) {
        this.tweet_id = tweet_id;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public int getPostedByUserId() {
        return postedByUserId;
    }

    public void setPostedByUserId(int postedByUserId) {
        this.postedByUserId = postedByUserId;
    }
}
