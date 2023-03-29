import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { CredRough } from 'src/app/CredRough';
import { UserDto } from 'src/app/dto/UserDto';
import { Rough } from 'src/app/Rough';
import { User } from 'src/app/User';
import { UserServiceService } from 'src/app/user-service.service';
import { UserCredential } from 'src/app/UserCredential';
import { UserDetail } from 'src/app/UserDetail';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent {
    uid:number=999999;
    firstName:string="";
    lastName:string="";
    phone:string="";
    email:string="";
    username:string="";
    password:string="";
    dobDay!:number;
    dobMonth!:number;
    dobYear!:number;
    user!:User;
    userDetails!:UserDetail;
    userCredentials!:UserCredential;

    rough!:Rough;
    cred!:CredRough;

    testId=2;
    testId2=4;
    testArray!:UserDto[];


    private userService!:UserServiceService;
    private router!:Router;
    constructor(userService:UserServiceService,router:Router){
      this.userService=userService;
      this.router=router;
      // userService.getFollowingsById(this.testId).subscribe(data=>{
      //   this.testArray=data;
      // })
      
    }

    onAddUser(){
      this.userCredentials=new UserCredential(this.uid,this.username,this.password);
      this.userDetails=new UserDetail(this.uid,this.userCredentials,this.firstName,this.lastName,this.email,this.dobYear,this.dobMonth,this.dobDay,this.phone,"Add Your Bio",false);
      this.user=new User(this.uid,this.userDetails);
      console.log(this.user);
      this.userService.getFollowingsById(this.testId2).subscribe(data=>{
        this.testArray=data;
        console.log("And this came from boot \n",this.testArray[0]);
      });
      this.userService.createNewUser(this.user).subscribe(data=>{
        if(data!=null){
          window.alert("Signup successful! :)");
          this.router.navigate(['/login']);
        }
        console.log(data)
      });
      // this.cred=new CredRough(2,"tettehehui","*djpda;apsswork");
      // this.rough=new Rough(4,"Nice","gpgp@gmail.com",this.cred);
      // this.userService.createRoughUser(this.rough).subscribe(data=>{
      //   console.log(data);
      // });
    }

    
}
