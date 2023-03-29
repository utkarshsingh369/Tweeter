package com.amadeus.utkarsh.TweeterUserManagementService.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
public class Tweet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="seq")
    @GenericGenerator(name = "seq", strategy="increment")
    private int tweet_id;

    private String caption;

    @ManyToOne
    private User postedBy;

    @ManyToMany
    private List<User> likedBy;

    @ManyToMany
    private List<User> savedBy;

    @OneToMany(mappedBy = "tweetRef")
    private List<Comment> comments;

    @ManyToMany(mappedBy = "associatedTo")
    private List<Hashtag> hashtagList;



    public Tweet() {
    }

    public Tweet(int tweet_id, String caption, User postedBy, List<User> likedBy, List<User> savedBy, List<Comment> comments, List<Hashtag> hashtagList) {
        this.tweet_id = tweet_id;
        this.caption = caption;
        this.postedBy = postedBy;
        this.likedBy = likedBy;
        this.savedBy = savedBy;
        this.comments = comments;
        this.hashtagList = hashtagList;
    }


    public void setTweet_id(int tweetId) {
        this.tweet_id = tweetId;
    }

    public int getTweet_id() {
        return tweet_id;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public User getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(User postedBy) {
        this.postedBy = postedBy;
    }

    public List<User> getLikedBy() {
        return likedBy;
    }

    public void setLikedBy(List<User> likedBy) {
        this.likedBy = likedBy;
    }

    public List<User> getSavedBy() {
        return savedBy;
    }

    public void setSavedBy(List<User> savedBy) {
        this.savedBy = savedBy;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Hashtag> getHashtagList() {
        return hashtagList;
    }

    public void setHashtagList(List<Hashtag> hashtagList) {
        this.hashtagList = hashtagList;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "tweet_id=" + tweet_id +
                ", caption='" + caption + '\'' +
                ", postedBy=" + postedBy +
                ", likedBy=" + likedBy +
                ", savedBy=" + savedBy +
                ", comments=" + comments +
                ", hashtagList=" + hashtagList +
                '}';
    }
}
