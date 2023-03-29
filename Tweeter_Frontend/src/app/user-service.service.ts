import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { TweetDto } from './dto/TweetDto';
import { UserDto } from './dto/UserDto';
import { Rough } from './Rough';
// import { TweetEntity } from './TweetEntity';
import { User } from './User';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  testUrl1="http://localhost:8080/user/test/getFollowingsById/"
  testUrl2="http://localhost:8080/user/create/newUser/"
  testUrl3="http://localhost:8080/create/roughUser/"
  testUrl4="http://localhost:8080/user/authenticate/"
  testUrl5="http://localhost:8080/user/getActiveDetails/"
  testUrl6="http://localhost:8080/user/create/newTweet/"
  constructor(private httpClient:HttpClient) { }

  getFollowingsById(id:number):Observable<UserDto[]> {
    return this.httpClient.get<UserDto[]>(`${this.testUrl1+id}`);
  }

  createNewUser(user:User):Observable<Object>{
    return this.httpClient.post(`${this.testUrl2}`,user);
  }

  getCredentialsByUsername(username:string):Observable<Object>{
    return this.httpClient.get<Object>(`${this.testUrl4+username}`);
  }

  createRoughUser(rough:Rough):Observable<Object>{
    return this.httpClient.post(`${this.testUrl3}`,rough);
  }
  getActiveDetailsAfterLogin(username:string){
    return this.httpClient.get(`${this.testUrl5+username}`);
  }

  createNewTweet(tweet:TweetDto):Observable<Object>{
    return this.httpClient.post(`${this.testUrl6}`,tweet);
  }
}
