import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent {
  private router!:Router;
  constructor(router:Router){
    this.router=router;
  }
  onClickHome(){
    this.router.navigate(['main/home']);
  }
  onClickExplore(){
    this.router.navigate(['/explore']);
  }
  onClickBookmarks(){
    this.router.navigate(['/bookmarks']);
  }
}
