;
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './UtilComponents/login/login.component';
import { SignupComponent } from './UtilComponents/signup/signup.component';
import { MainComponent } from './MainComponents/main/main.component';
import { HomeComponent } from './MainComponents/home/home.component';
import { ExploreComponent } from './MainComponents/explore/explore.component';
import { BookmarksComponent } from './MainComponents/bookmarks/bookmarks.component';
import { NavComponent } from './UtilComponents/nav/nav.component';
import { TweetDesignComponent } from './TweetComponents/tweet-design/tweet-design.component';
import { SideMenuComponent } from './UtilComponents/side-menu/side-menu.component';
import { CommentDesignComponent } from './TweetComponents/comment-design/comment-design.component';
import { ComposetweetComponent } from './TweetComponents/composetweet/composetweet.component';
import { ExploreSideMenuComponent } from './UtilComponents/explore-side-menu/explore-side-menu.component';
import {MatInputModule} from '@angular/material/input';
import {MatAutocompleteModule} from '@angular/material/autocomplete';
import { SearchedUserComponent } from './MainComponents/searched-user/searched-user.component'

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    SignupComponent,
    MainComponent,
    HomeComponent,
    ExploreComponent,
    BookmarksComponent,
    NavComponent,
    TweetDesignComponent,
    SideMenuComponent,
    CommentDesignComponent,
    ComposetweetComponent,
    ExploreSideMenuComponent,
    SearchedUserComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatInputModule,
    MatAutocompleteModule
  ],
  providers: [HomeComponent],
  bootstrap: [AppComponent]
})
export class AppModule { }
