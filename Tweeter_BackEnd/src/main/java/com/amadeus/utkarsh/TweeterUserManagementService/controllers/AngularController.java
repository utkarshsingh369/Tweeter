package com.amadeus.utkarsh.TweeterUserManagementService.controllers;

//import com.amadeus.utkarsh.TweeterUserManagementService.entities.Rough;
import com.amadeus.utkarsh.TweeterUserManagementService.dto.TweetDto;
import com.amadeus.utkarsh.TweeterUserManagementService.dto.UserDto;
import com.amadeus.utkarsh.TweeterUserManagementService.entities.User;
import com.amadeus.utkarsh.TweeterUserManagementService.services.TweetService;
import com.amadeus.utkarsh.TweeterUserManagementService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200/")
public class AngularController {

    @Autowired
    UserService userService;

    @Autowired
    TweetService tweetService;

    @PostMapping("/create/newUser")
    public ResponseEntity<UserDto> createNewUserHandler(@RequestBody User user){
        System.out.println("this is going to get inserted : "+user);
        try{
            UserDto dto=this.userService.createNewUserService(user);
            return ResponseEntity.of(Optional.of(dto));
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Couldn't create new user");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping(value = "/authenticate/{username}",produces = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity<List<Object>> getCredentialsByUsernameHandler(@PathVariable String username){
        List<Object> temp=null;
        temp=this.userService.getCredentialsByUsernameService(username);
        if(temp==null){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }else{
            return ResponseEntity.of(Optional.of(temp));
        }
    }

    @GetMapping(value = "/getActiveDetails/{username}")
    private ResponseEntity<UserDto> getDetailsAfterLoginHandler(@PathVariable String username){
        UserDto temp=null;
        temp=this.userService.getDetailsAfterLoginService(username);
        if(temp==null){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }else{
            return ResponseEntity.of(Optional.of(temp));
        }
    }

    @PostMapping("/create/newTweet")
    public ResponseEntity<TweetDto> createNewTweetHandler(@RequestBody TweetDto tweetDto){
        System.out.println("this is going to get inserted : "+tweetDto);
        try{
            TweetDto dto=this.tweetService.createNewTweetService(tweetDto);
            return ResponseEntity.of(Optional.of(dto));
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Couldn't create new user");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/getTweetByUserId/{id}")
    public ResponseEntity<List<TweetDto>> getTweetByUserIdHandler(@PathVariable("id") int user_id){
        List<TweetDto> list=new ArrayList<>();
        try{
            list=this.tweetService.getTweetByUserId(user_id);

        }catch (Exception ex){
            System.out.println("Can't get user tweets");
        }
        return ResponseEntity.of(Optional.of(list));
    }

}
