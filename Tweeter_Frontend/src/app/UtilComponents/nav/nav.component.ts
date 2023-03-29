import { Component, Input, OnInit, Output } from '@angular/core';
import { Router } from '@angular/router';
import { UserDto } from 'src/app/dto/UserDto';

@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.css']
})
export class NavComponent {

  // @Input() activeUserDetails!:PassiveProfileView;
  activeUserDetails!:UserDto;

  router!:Router;
  constructor(router:Router){
    this.router=router;
    this.activeUserDetails=JSON.parse(localStorage.getItem("activeUserDetails") as string)
  }
  
  ngOnInit(){
    // console.log("In nav passed :",this.activeUserDetails);

  }
}
