import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { UserDto } from 'src/app/dto/UserDto';
import { UserServiceService } from 'src/app/user-service.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
    username:string="";
    password:string="";
    passwordObtained:string="";
    private activeUserDetails!:UserDto;
    private userService!:UserServiceService;
    router!:Router;
    constructor(router:Router, userService:UserServiceService){
      this.userService=userService;
      this.router=router;
    }

    loginUser(){
        console.log("hello");
        this.userService.getCredentialsByUsername(this.username).subscribe(data=>{
          this.passwordObtained=String(data);
          if(this.passwordObtained==this.password){
                this.userService.getActiveDetailsAfterLogin(this.username).subscribe(data=>{
                  let arr=Object.values(data);
                  console.log("size :",arr.length)
                  arr.forEach(element => {
                    console.log(typeof element,"Hehe :",element)
                  });
                  this.activeUserDetails=new UserDto(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7],arr[8]);
                  console.log("activedetails :::",this.activeUserDetails);
                  localStorage.setItem("activeUserDetails",JSON.stringify(this.activeUserDetails));
                })
                this.router.navigate(['/home']);
          }
          else{
            window.alert("Invalid Credentials");
          }
        })
      
    }
}
