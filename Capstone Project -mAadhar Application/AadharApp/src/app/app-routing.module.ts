import { ViewcancelComponent } from './viewcancel/viewcancel.component';
import { VerifiedComponent } from './verified/verified.component';
import { ViewstatusComponent } from './viewstatus/viewstatus.component';
import { FetchallComponent } from './fetchall/fetchall.component';
import { AfterduplicateComponent } from './afterduplicate/afterduplicate.component';
import { DuplicateComponent } from './duplicate/duplicate.component';
import { AftercancelComponent } from './aftercancel/aftercancel.component';
import { CancelComponent } from './cancel/cancel.component';
import { UpdateComponent } from './update/update.component';
import { AfterupdateComponent } from './afterupdate/afterupdate.component';
import { AfterapplyComponent } from './afterapply/afterapply.component';
import { ApplyComponent } from './apply/apply.component';
import { RegisteredComponent } from './registered/registered.component';
import { UserloginComponent } from './userlogin/userlogin.component';
import { RegisterComponent } from './register/register.component';
import { UserpageComponent } from './userpage/userpage.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { HomeComponent } from './home/home.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminpageComponent } from './adminpage/adminpage.component';


const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:'userlogin',component:UserloginComponent},
  {path:'adminlogin',component:AdminloginComponent},
  {path:'userpage',component:UserpageComponent},
  {path:'register',component:RegisterComponent},
  {path:'registered',component:RegisteredComponent},
  {path:'apply',component:ApplyComponent},
  {path:'afterapply',component:AfterapplyComponent},
  {path:'update',component:UpdateComponent},
  {path:'afterupdate',component:AfterupdateComponent},
  {path:'cancel',component:CancelComponent},
  {path:'aftercancel',component:AftercancelComponent},
  {path:'duplicate',component:DuplicateComponent},
  {path:'afterduplicate',component:AfterduplicateComponent},
  {path:'adminpage',component:AdminpageComponent},
  {path:'fetchall',component:FetchallComponent},
  {path:'verify',component:ViewstatusComponent},
  {path:'verified',component:VerifiedComponent},
  {path:'cview',component:ViewcancelComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
