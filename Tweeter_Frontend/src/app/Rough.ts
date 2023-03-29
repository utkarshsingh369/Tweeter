import { CredRough } from "./CredRough";

export class Rough{
    id:number=-1;
    name:string="";
    email:string="";
    cred!:CredRough;
    constructor(id:number,name:string,email:string,cred:CredRough){
        this.id=id;
        this.name=name;
        this.email=email;
        this.cred=cred;
    }
}