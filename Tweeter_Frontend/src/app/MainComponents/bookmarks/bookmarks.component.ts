import { Component,OnInit } from '@angular/core';
import { UserDto } from 'src/app/dto/UserDto';

@Component({
  selector: 'app-bookmarks',
  templateUrl: './bookmarks.component.html',
  styleUrls: ['./bookmarks.component.css']
})
export class BookmarksComponent {
  testArray:number[]=[];
  activeUserDetails!:UserDto;
  constructor(){
    this.testArray=[1,2,3]
    this.activeUserDetails=JSON.parse(localStorage.getItem("activeUserDetails") as string);
  }
  ngOnInit(){
    // setTimeout(() => {
      
    // }, 200);
  }

}
