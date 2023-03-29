package com.amadeus.utkarsh.TweeterUserManagementService.dto;

import com.amadeus.utkarsh.TweeterUserManagementService.entities.Tweet;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UserDto {
    private int u_id;
    private String username;
    private String first_name;
    private String last_name;
    private String bio;
    private List<TweetDto> tweets;
    private boolean isVerified;
    @JsonProperty("followerCount")
    private int followerCount;
    @JsonProperty("followingCount")
    private int followingCount;

    public UserDto(int u_id, String username, String first_name, String last_name, String bio, List<TweetDto> tweets, boolean isVerified,int followerCount,int followingCount) {
        this.u_id=u_id;
        this.username = username;
        this.first_name = first_name;
        this.last_name = last_name;
        this.bio = bio;
        this.tweets = tweets;
        this.isVerified = isVerified;
        this.followerCount=followerCount;
        this.followingCount=followingCount;
    }
//    public UserDto(int u_id, String first_name, String last_name, String bio, boolean isVerified){
//        this.u_id=u_id;
//        this.first_name=first_name;
//        this.last_name=last_name;
//        this.bio=bio;
//        this.isVerified=isVerified;
//    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public UserDto() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public List<TweetDto> getTweets() {
        return tweets;
    }

    public void setTweets(List<TweetDto> tweets) {
        this.tweets = tweets;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public int getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(int followerCount) {
        this.followerCount = followerCount;
    }

    public int getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(int followingCount) {
        this.followingCount = followingCount;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "u_id=" + u_id +
                ", username='" + username + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", bio='" + bio + '\'' +
                ", tweets=" + tweets +
                ", isVerified=" + isVerified +
                ", followerCount=" + followerCount +
                ", followingCount=" + followingCount +
                '}';
    }
}
