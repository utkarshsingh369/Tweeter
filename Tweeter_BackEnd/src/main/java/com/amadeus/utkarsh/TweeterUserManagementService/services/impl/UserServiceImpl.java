package com.amadeus.utkarsh.TweeterUserManagementService.services.impl;

import com.amadeus.utkarsh.TweeterUserManagementService.dao.UserRepository;
import com.amadeus.utkarsh.TweeterUserManagementService.dto.TweetDto;
import com.amadeus.utkarsh.TweeterUserManagementService.dto.UserDto;
import com.amadeus.utkarsh.TweeterUserManagementService.entities.Tweet;
import com.amadeus.utkarsh.TweeterUserManagementService.entities.User;
import com.amadeus.utkarsh.TweeterUserManagementService.services.TweetService;
import com.amadeus.utkarsh.TweeterUserManagementService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TweetService tweetService;
//    public UserDto addUser(User user) {
//        User u=this.userRepository.save(user);
//        return this.userToDto(u);
//    }
//
//    public List<User> getAllUsersService() {
//        return (List<User>)this.userRepository.findAll();
//    }
//
//    public List<Object> getFollowingsByIdService(int id) {
//        return this.userRepository.getFollowingsById(id);
//    }
//
//    public List<Object> getFollowersByIdService(int id){
//        return this.userRepository.getFollowersById(id);
//    }

    public UserDto createNewUserService(User user) {
        User u=this.userRepository.save(user);
        return userToDto(u);
    }

    public List<Object> getCredentialsByUsernameService(String username) {
        return this.userRepository.getCredentialsByUsername(username);
    }

    public UserDto getDetailsAfterLoginService(String username) {
        String alString= this.userRepository.getDetailsAfterLogin(username).get(0);
        List<String> al= Arrays.asList(alString.split(","));
        int user_id=this.userRepository.getUserIdByUD(Integer.parseInt(al.get(0)));
        System.out.println(al.toString());
        List<TweetDto> tweets=this.tweetService.getTweetByUserId(user_id);
        UserDto obj=new UserDto(user_id,username,al.get(1),al.get(2),al.get(3),tweets,Boolean.parseBoolean(al.get(4)),this.userRepository.getFollowerCount(user_id),this.userRepository.getFollowingCount(user_id));
        System.out.println(">>>>>>>>Returning :"+obj);
        return obj;
    }
    private UserDto userToDto(User user){
        List<Tweet> tweets=user.getTweetsPosted();
        List<TweetDto> t= (List<TweetDto>) tweets.stream().map(x -> this.tweetService.tweetToDto(x)).collect(Collectors.toList());
        return new UserDto(user.getUser_id(),user.getUserDetails().getCred().getUsername(),user.getUserDetails().getFirst_name(),user.getUserDetails().getLast_name(),user.getUserDetails().getBio(),t,user.getUserDetails().isVerified(),this.userRepository.getFollowerCount(user.getUser_id()),this.userRepository.getFollowingCount(user.getUser_id()));
    }

    private User dtoToUser(UserDto dto){
        return this.userRepository.findById(dto.getU_id()).get();
    }
}
