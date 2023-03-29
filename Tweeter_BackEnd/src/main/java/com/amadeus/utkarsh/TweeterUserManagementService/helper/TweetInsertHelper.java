package com.amadeus.utkarsh.TweeterUserManagementService.helper;

public class TweetInsertHelper {
    public int tweet_id;
    public int posted_by_user_id;
    public String caption;

    public TweetInsertHelper(int tweet_id, int posted_by_user_id, String caption) {
        this.tweet_id = tweet_id;
        this.posted_by_user_id = posted_by_user_id;
        this.caption = caption;
    }
}
