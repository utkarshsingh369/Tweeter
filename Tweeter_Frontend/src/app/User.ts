import { UserDetail } from "./UserDetail";

export class User{
    user_id:number=999999;
    // firstName:string="";
    // lastName:string="";
    // phone:string="";
    // email:string="";
    // dobDay:number=0;
    // dobMonth:number=0;
    // dobYear:number=1900;
    // bio:string="";
    // isVerified:boolean=false;
    userDetails!:UserDetail;
    constructor(user_id:number,userDetails:UserDetail){
        this.user_id=user_id;
        this.userDetails=userDetails;
    }
}