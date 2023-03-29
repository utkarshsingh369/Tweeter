// import { TweetEntity } from "../TweetEntity";

import { TweetDto } from "./TweetDto";

export class UserDto{
    uid:number=-1;
    username:string="";
    firstName:string="lui";
    lastName:string="";
    bio:string="";
    tweets!:TweetDto[];
    isVerified:boolean=false;
    followerCount:number=0;
    followingCount:number=0;
    constructor(uid:number,username:string,firstName:string,lastName:string,bio:string,tweets:TweetDto[],isVerified:boolean,followerCount:number,followingCount:number){
        this.uid=uid;
        this.username=username;
        this.firstName=firstName;
        this.lastName=lastName;
        this.bio=bio;
        this.tweets=tweets;
        this.isVerified=isVerified;
        this.followerCount=followerCount;
        this.followingCount=followingCount;
    }
    setFollowerCount(x:number){
        this.followerCount=x;
    }
    setFollowingCount(x:number){
        this.followingCount=x;
    }
}