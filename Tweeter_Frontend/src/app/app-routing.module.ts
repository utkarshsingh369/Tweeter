import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BookmarksComponent } from './MainComponents/bookmarks/bookmarks.component';
import { ExploreComponent } from './MainComponents/explore/explore.component';
import { HomeComponent } from './MainComponents/home/home.component';
import { MainComponent } from './MainComponents/main/main.component';
import { LoginComponent } from './UtilComponents/login/login.component';
import { SignupComponent } from './UtilComponents/signup/signup.component';

const routes: Routes = [
  {path:'signup',component:SignupComponent},
  {path:'login', component:LoginComponent},
  {path:'',redirectTo:'/login',pathMatch:'full'},
  {path:'main',component:MainComponent},
  {path:'home',component:HomeComponent},
  {path:'explore',component:ExploreComponent},
  {path:'bookmarks',component:BookmarksComponent}



];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
