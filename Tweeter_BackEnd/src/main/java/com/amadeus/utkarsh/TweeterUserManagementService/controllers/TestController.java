//package com.amadeus.utkarsh.TweeterUserManagementService.controllers;
//
//
//import com.amadeus.utkarsh.TweeterUserManagementService.entities.User;
//import com.amadeus.utkarsh.TweeterUserManagementService.services.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/user")
//@CrossOrigin(origins = "http://localhost:4200/")
//public class TestController {
//    @Autowired
//    UserService userService;
//    @PostMapping("test/adduser")
//    public ResponseEntity<User> addUserHandler(@RequestBody User user){
//        try{
//            this.userService.addUser(user);
//            return ResponseEntity.of(Optional.of(user));
//        }catch (Exception ex){
//            ex.printStackTrace();
//            System.out.println("Test Failed : couldn't add user!");
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//        }
//    }
//
//    @GetMapping("test/getAllUsers")
//    public ResponseEntity<List<User>> getAllUsersHandler(){
//        List<User> temp=null;
//        temp=this.userService.getAllUsersService();
//        if(temp==null){
//            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//        }else{
//            return ResponseEntity.of(Optional.of(temp));
//        }
//    }
//
//    @GetMapping("test/getFollowingsById/{Id}")
//    public ResponseEntity<List<Object>> getFollowingsByIdHandler(@PathVariable("Id") int id){
//        List<Object> temp=null;
//        temp=this.userService.getFollowingsByIdService(id);
//        if(temp==null){
//            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//        }else{
//            return ResponseEntity.of(Optional.of(temp));
//        }
//    }
//
//    @GetMapping("test/getFollowersById/{Id}")
//    public ResponseEntity<List<Object>> getFollowersByIdHandler(@PathVariable("Id") int id){
//        List<Object> temp=null;
//        temp=this.userService.getFollowersByIdService(id);
//        if(temp==null){
//            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//        }else{
//            return ResponseEntity.of(Optional.of(temp));
//        }
//    }
//
//
//}
