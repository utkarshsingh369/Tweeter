import { Component, Input, OnInit } from '@angular/core';
import { UserDto } from 'src/app/dto/UserDto';
import { UserServiceService } from 'src/app/user-service.service';
import { HomeComponent } from '../home/home.component';

@Component({
  selector: 'app-searched-user',
  templateUrl: './searched-user.component.html',
  styleUrls: ['./searched-user.component.css']
})
export class SearchedUserComponent implements OnInit {
  @Input() searchedUsername!:string;
  testArray=[1,2,3,4,5];
  isFollowingSearchedUser:boolean=false;
  searchedUserDetails!:UserDto;
  alreadyFollowed=false;
  constructor(private userService:UserServiceService,private homeComponent:HomeComponent){}
  ngOnInit(){
    this.userService.getActiveDetailsAfterLogin(this.searchedUsername).subscribe(data=>{
      let arr=Object.values(data);
      console.log("size :",arr.length)
      arr.forEach(element => {
        console.log(typeof element,"Hehe :",element)
      });
      this.searchedUserDetails=new UserDto(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7],arr[8]);
      console.log("searchedUserDetails :::",this.searchedUserDetails);
      
      // localStorage.setItem("activeUserDetails",JSON.stringify(this.searchedUserDetails));
    })
  }
  unfollowSearchedUser() {
    this.alreadyFollowed=false;
    // this.ngOnInit();
  }
  followSearchedUser() {
    this.alreadyFollowed=true;
    // this.ngOnInit();
  }
  
}
