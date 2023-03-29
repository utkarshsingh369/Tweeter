package com.amadeus.utkarsh.TweeterUserManagementService.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Hashtag {
    @Id
    private String hashtag;

    @ManyToMany
    private List<Tweet> associatedTo;

    public Hashtag() {
    }

    public Hashtag(String hashtag, List<Tweet> associatedTo) {
        this.hashtag = hashtag;
        this.associatedTo = associatedTo;
    }

    public String getHashtag() {
        return hashtag;
    }

    public void setHashtag(String hashtag) {
        this.hashtag = hashtag;
    }

    public List<Tweet> getAssociatedTo() {
        return associatedTo;
    }

    public void setAssociatedTo(List<Tweet> associatedTo) {
        this.associatedTo = associatedTo;
    }
}
