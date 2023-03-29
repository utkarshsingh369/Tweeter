import { Component,OnInit } from '@angular/core';
import { UserDto } from 'src/app/dto/UserDto';
import { FormControl } from '@angular/forms';
import { Observable, startWith } from 'rxjs';
import {map} from 'rxjs';
import { UserServiceService } from 'src/app/user-service.service';

@Component({
  selector: 'app-explore',
  templateUrl: './explore.component.html',
  styleUrls: ['./explore.component.css']
})
export class ExploreComponent {

  myControl:FormControl=new FormControl();
  filterArray!:Observable<string[]>;
  testArray:number[]=[];
  activeUserDetails!:UserDto;
  isUserSearched=false;
  searchedUsername:string="";
  searchedUserDetails!:UserDto;

  ngOnInit(){
  }
  constructor(private userService:UserServiceService){
    this.testArray=[1,2,3,4]
    this.activeUserDetails=JSON.parse(localStorage.getItem("activeUserDetails") as string)
  }
  toggleState(flag:boolean){
    this.isUserSearched=flag;
  }
  onSearchUser() {

    console.log(this.searchedUsername);
    
  }
}
