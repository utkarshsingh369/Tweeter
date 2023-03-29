export class TweetDto{
    tweet_id=-1;
    caption:string="";
    postedByUserId=-1;
    

    constructor(tweet_id:number,caption:string,postedByUserId:number){
        this.tweet_id=tweet_id;
        this.postedByUserId=postedByUserId;
        this.caption=caption;
    }
}