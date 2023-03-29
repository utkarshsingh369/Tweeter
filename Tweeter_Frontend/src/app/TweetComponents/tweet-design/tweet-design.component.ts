import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-tweet-design',
  templateUrl: './tweet-design.component.html',
  styleUrls: ['./tweet-design.component.css']
})
export class TweetDesignComponent {
  @Input() caption:string="";
  testArray:number[]=[];

  constructor(){
    this.testArray=[1,2,3];
  }
}
