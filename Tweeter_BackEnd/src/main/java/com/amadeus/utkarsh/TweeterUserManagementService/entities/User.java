package com.amadeus.utkarsh.TweeterUserManagementService.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "user_id_seq")
    @SequenceGenerator(name = "user_id_seq",sequenceName = "user_id_seq",initialValue = 1,allocationSize=1)
    private int user_id;

    @OneToOne(cascade ={CascadeType.ALL},orphanRemoval = true)
    @JsonManagedReference
    private UserDetail userDetails;

    @ManyToMany
//    @JsonManagedReference
    private List<User> followers;



    @ManyToMany(mappedBy = "followers")
//    @JsonBackReference
    private List<User> followedBy;



    @OneToMany(cascade = CascadeType.ALL,mappedBy = "postedBy",orphanRemoval = true)
    private List<Tweet> tweetsPosted;


    @ManyToMany(mappedBy = "likedBy")
    private List<Tweet> likedTweets;

    @ManyToMany(mappedBy = "savedBy")
    private List<Tweet> savedTweets;


    @OneToMany(mappedBy = "commentedBy",orphanRemoval = true)
    private List<Comment> commentList;


    @ManyToMany(mappedBy = "likedBy")
    private List<Comment> likedCommentList;


    //*************************************************************************************************************//
    public User() {
    }

    public User(int user_id, UserDetail userDetails, List<User> followers, List<User> followedBy, List<Tweet> tweetsPosted, List<Tweet> likedTweets, List<Tweet> savedTweets, List<Comment> commentList, List<Comment> likedCommentList) {
        this.user_id = user_id;
        this.userDetails = userDetails;
        this.followers = followers;
        this.followedBy = followedBy;
        this.tweetsPosted = tweetsPosted;
        this.likedTweets = likedTweets;
        this.savedTweets = savedTweets;
        this.commentList = commentList;
        this.likedCommentList = likedCommentList;
    }


    public List<User> getFollowers() {
        return followers;
    }

    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }

    public List<User> getFollowedBy() {
        return followedBy;
    }

    public void setFollowedBy(List<User> followedBy) {
        this.followedBy = followedBy;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public UserDetail getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetail userDetails) {
        this.userDetails = userDetails;
    }

    public List<Tweet> getTweetsPosted() {
        return tweetsPosted;
    }

    public void setTweetsPosted(List<Tweet> tweetsPosted) {
        this.tweetsPosted = tweetsPosted;
    }

    public List<Tweet> getLikedTweets() {
        return likedTweets;
    }

    public void setLikedTweets(List<Tweet> likedTweets) {
        this.likedTweets = likedTweets;
    }

    public List<Tweet> getSavedTweets() {
        return savedTweets;
    }

    public void setSavedTweets(List<Tweet> savedTweets) {
        this.savedTweets = savedTweets;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public List<Comment> getLikedCommentList() {
        return likedCommentList;
    }

    public void setLikedCommentList(List<Comment> likedCommentList) {
        this.likedCommentList = likedCommentList;
    }
}
