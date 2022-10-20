import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';

import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { UserpageComponent } from './userpage/userpage.component';
import { RegisterComponent } from './register/register.component';
import { UserloginComponent } from './userlogin/userlogin.component';
import { ViewstatusComponent } from './viewstatus/viewstatus.component';
import { DuplicateComponent } from './duplicate/duplicate.component';
import { HttpClientModule } from '@angular/common/http';
import { RegisteredComponent } from './registered/registered.component';
import { ApplyComponent } from './apply/apply.component';
import { UpdateComponent } from './update/update.component';
import { CancelComponent } from './cancel/cancel.component';
import { AfterapplyComponent } from './afterapply/afterapply.component';
import { AfterupdateComponent } from './afterupdate/afterupdate.component';
import { AftercancelComponent } from './aftercancel/aftercancel.component';
import { AfterduplicateComponent } from './afterduplicate/afterduplicate.component';
import { AdminpageComponent } from './adminpage/adminpage.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { FetchallComponent } from './fetchall/fetchall.component';
import { VerifiedComponent } from './verified/verified.component';
import { ViewcancelComponent } from './viewcancel/viewcancel.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    UserloginComponent,
    AdminloginComponent,
    UserpageComponent,
    RegisterComponent,
    ViewstatusComponent,
    DuplicateComponent,
    RegisteredComponent,
    ApplyComponent,
    UpdateComponent,
    CancelComponent,
    AfterapplyComponent,
    AfterupdateComponent,
    AftercancelComponent,
    AfterduplicateComponent,
    AdminpageComponent,
    HeaderComponent,
    FooterComponent,
    FetchallComponent,
    VerifiedComponent,
    ViewcancelComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
