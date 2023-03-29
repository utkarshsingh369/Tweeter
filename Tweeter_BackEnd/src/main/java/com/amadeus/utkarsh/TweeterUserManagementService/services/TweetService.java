package com.amadeus.utkarsh.TweeterUserManagementService.services;

import com.amadeus.utkarsh.TweeterUserManagementService.dto.TweetDto;
import com.amadeus.utkarsh.TweeterUserManagementService.entities.Tweet;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TweetService{
    TweetDto createNewTweetService(TweetDto tweetDto);
    List<TweetDto> getTweetByUserId(int user_id);
    TweetDto tweetToDto(Tweet tweet);
    Tweet newDtoToTweet(TweetDto tweetDto);
    Tweet existingDtoToTweet(TweetDto tweetDto);

}
