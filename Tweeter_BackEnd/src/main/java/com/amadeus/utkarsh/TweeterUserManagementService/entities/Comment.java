package com.amadeus.utkarsh.TweeterUserManagementService.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class Comment {
    @Id
    private int comment_id;

    @ManyToOne
    private Tweet tweetRef;

    @ManyToOne
    private User commentedBy;

    @ManyToMany
    private List<User> likedBy;

    public Comment() {
    }

    public Comment(int comment_id, Tweet tweetRef, User commentedBy, List<User> likedBy) {
        this.comment_id = comment_id;
        this.tweetRef = tweetRef;
        this.commentedBy = commentedBy;
        this.likedBy = likedBy;
    }

    public int getComment_id() {
        return comment_id;
    }

    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }

    public Tweet getTweetRef() {
        return tweetRef;
    }

    public void setTweetRef(Tweet tweetRef) {
        this.tweetRef = tweetRef;
    }

    public User getCommentedBy() {
        return commentedBy;
    }

    public void setCommentedBy(User commentedBy) {
        this.commentedBy = commentedBy;
    }

    public List<User> getLikedBy() {
        return likedBy;
    }

    public void setLikedBy(List<User> likedBy) {
        this.likedBy = likedBy;
    }
}
