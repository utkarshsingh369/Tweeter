package com.amadeus.utkarsh.TweeterUserManagementService.services.impl;

import com.amadeus.utkarsh.TweeterUserManagementService.dao.TweetRepository;
import com.amadeus.utkarsh.TweeterUserManagementService.dao.UserRepository;
import com.amadeus.utkarsh.TweeterUserManagementService.dto.TweetDto;
import com.amadeus.utkarsh.TweeterUserManagementService.entities.Tweet;
import com.amadeus.utkarsh.TweeterUserManagementService.services.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TweetServiceImpl implements TweetService {
    @Autowired
    private TweetRepository tweetRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public TweetDto createNewTweetService(TweetDto tweetDto) {
        Tweet tweet=newDtoToTweet(tweetDto);
        Tweet t=this.tweetRepository.save(tweet);
        return tweetToDto(t);
    }

    @Override
    public List<TweetDto> getTweetByUserId(int user_id) {
        List<TweetDto> tweetDtos=(List<TweetDto>) this.tweetRepository.getTweetByUserId(user_id).stream().map(this::tweetToDto).collect(Collectors.toList());
        Collections.reverse(tweetDtos);
        return tweetDtos;
    }

    public TweetDto tweetToDto(Tweet tweet){
        return new TweetDto(tweet.getTweet_id(),tweet.getCaption(),tweet.getPostedBy().getUser_id());
    }
    public Tweet existingDtoToTweet(TweetDto tweetDto){
        return this.tweetRepository.findById(tweetDto.getTweet_id()).get();
    }
    //for creation of new tweet
    public Tweet newDtoToTweet(TweetDto tweetDto){
        return new Tweet(999999,tweetDto.getCaption(),this.userRepository.findById(tweetDto.getPostedByUserId()).get(),null,null,null,null);
    }
}
