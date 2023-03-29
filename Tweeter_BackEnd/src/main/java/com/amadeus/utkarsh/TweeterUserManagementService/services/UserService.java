package com.amadeus.utkarsh.TweeterUserManagementService.services;

//import com.amadeus.utkarsh.TweeterUserManagementService.dao.RoughRepository;
import com.amadeus.utkarsh.TweeterUserManagementService.dto.UserDto;
//import com.amadeus.utkarsh.TweeterUserManagementService.entities.Rough;
import com.amadeus.utkarsh.TweeterUserManagementService.entities.User;

import java.util.List;

public interface UserService {
//     UserDto addUser(User user);
//     List<User> getAllUsersService();
//     List<Object> getFollowingsByIdService(int id);
//     List<Object> getFollowersByIdService(int id);
     UserDto createNewUserService(User user);
     List<Object> getCredentialsByUsernameService(String username);
     UserDto getDetailsAfterLoginService(String username);

}

//    public void createNewTweetService(TweetInsertHelper tweet) {
//        this.userRepository.insertTweet(tweet.tweet_id,tweet.posted_by_user_id,tweet.caption);
//        System.out.println("Tweet created successfulllyyyy");
//    }