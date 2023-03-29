import { Component, ViewChild } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { TweetDto } from 'src/app/dto/TweetDto';
import { UserDto } from 'src/app/dto/UserDto';
import { HomeComponent } from 'src/app/MainComponents/home/home.component';
// import { TweetEntity } from 'src/app/TweetEntity';
import { User } from 'src/app/User';
import { UserServiceService } from 'src/app/user-service.service';

@Component({
  selector: 'app-composetweet',
  templateUrl: './composetweet.component.html',
  styleUrls: ['./composetweet.component.css']
})
export class ComposetweetComponent {

  userService!:UserServiceService;
  caption:string="demo - cap"
  activeUserDetails!:UserDto;
  router!:Router;
  roughRouter!:ActivatedRoute;
  
  constructor(userService:UserServiceService,router:Router,private homeComponent:HomeComponent){
    this.userService=userService;
    this.router=router;
    this.activeUserDetails=JSON.parse(localStorage.getItem("activeUserDetails") as string)
  }
  createNewTweet() {
    this.userService.createNewTweet(new TweetDto(99999,this.caption,this.activeUserDetails.uid)).subscribe(data=>{
      if(data!=null){
        window.alert("Tweet Posted Successfully");
        this.userService.getActiveDetailsAfterLogin(this.activeUserDetails.username).subscribe(data=>{
          let arr=Object.values(data);
          this.activeUserDetails=new UserDto(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7],arr[8]);
          localStorage.setItem("activeUserDetails",JSON.stringify(this.activeUserDetails));
          this.homeComponent.ngOnInit();
        })
        this.router.navigate(['/home']);
      }
    })
  }

}
