import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { UserDto } from 'src/app/dto/UserDto';
import { UserServiceService } from 'src/app/user-service.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  testArray!:number[];
  strData!:string;
  activeUserDetails!:UserDto;
  username:string="";
  isDataLoaded:boolean=false;
  userService!:UserServiceService;

  // firstName:string="";
  // lastName:string="";
  
  constructor(route:ActivatedRoute, userService:UserServiceService){
    this.testArray=[1,2,4,7];
    this.userService=userService;
    this.username=route.snapshot.paramMap.get('username') as string;
    // console.log(">>>>>>>",this.username,typeof this.username);
    console.log("home constructor")

    
  }
  
  public ngOnInit(){
    console.log("ngoninit called again")
    
    setTimeout(() => {
      this.isDataLoaded=true;
      this.strData=localStorage.getItem("activeUserDetails") as string;
      this.activeUserDetails=JSON.parse(this.strData);
      this.userService.getActiveDetailsAfterLogin(this.activeUserDetails.username).subscribe(data=>{
        let arr=Object.values(data);
        console.log("size :",arr.length)
        arr.forEach(element => {
          console.log(typeof element,"Hehe :",element)
        });
        this.activeUserDetails=new UserDto(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7],arr[8]);
        console.log("activedetails :::",this.activeUserDetails);
        localStorage.setItem("activeUserDetails",JSON.stringify(this.activeUserDetails));
      })
    }, 200);
    
    // console.log(this.activeUserDetails);
    
    // this.userService.getActiveDetailsAfterLogin(this.username).subscribe(data=>{
    //   console.log(data,typeof data)
      // var dataStr=JSON.stringify(data);
      // console.log("Stringified json : ",dataStr);
      // Object.assign(this.activeUserDetails,JSON.parse(dataStr));
      // this.activeUserDetails=JSON.parse(dataStr);
      // let arr=Object.values(data);
      // this.activeUserDetails=new PassiveProfileView(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6]);
      
      // console.log("okayyyyy",arr,typeof arr);
      
      // this.isDataLoaded=true;
      // console.log("data loaded >>",this.activeUserDetails);
      
      // let arr=this.activeUserDetails.values();
      // this.firstName=this.activeUserDetails.firstName;
      // this.lastName=this.activeUserDetails.lastName;
      // console.log(this.activeUserDetails + "{ type = "+typeof this.activeUserDetails+"}>>>>>\n"+this.firstName+"____"+this.lastName);
      
    // })
    
    
  }
}
