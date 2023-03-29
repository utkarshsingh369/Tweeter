import { UserCredential } from "./UserCredential";

export class UserDetail{
    ud_id:number=-1;
    cred!:UserCredential;
    first_name:string="";
    last_name:string="";
    email:string="";
    dobYear:number=-1;
    dobMonth:number=-1;
    dobDate:number=-1;
    phone:string="";
    bio:string="";
    isVerified:boolean=false;

    constructor(ud_id:number,cred:UserCredential,first_name:string,last_name:string,email:string,dobYear:number,dobMonth:number,dobDate:number,phone:string,bio:string,isVerified:boolean){
        this.ud_id=ud_id;
        this.cred=cred;
        this.first_name=first_name;
        this.last_name=last_name;
        this.email=email;
        this.dobYear=dobYear;
        this.dobMonth=dobMonth;
        this.dobDate=dobDate;
        this.phone=phone;
        this.bio=bio;
        this.isVerified=isVerified;
    }
}