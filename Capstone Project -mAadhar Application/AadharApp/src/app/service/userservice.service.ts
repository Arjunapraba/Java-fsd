import { Adminlog } from './../adminlog';
import { Cancel } from './../cancel';
import { Update } from './../update';
import { Application } from './../application';
import { Router } from '@angular/router';
import { Userlog } from './../userlog';
import { Register } from './../register';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserserviceService {

  constructor(private http:HttpClient) { }

  register(register :Register){
    return this.http.post("http://localhost:8080/register",register,{responseType:'text' as 'json'});
  }

  login(userlog :Userlog){
    return this.http.post("http://localhost:8080/login",userlog,{responseType:'text' as 'json'});

  }
  apply(apply :Application){
    return this.http.post("http://localhost:8080/applyaadhar",apply,{responseType:'text' as 'json'})
  }

  update(update :Update){
    return this.http.post("http://localhost:8080/updateAadhar",update,{responseType:'text' as 'json'})
  }
  cancel(cancel :Cancel){
    return this.http.post("http://localhost:8080/cancel",cancel,{responseType:'text' as 'json'});
  }
  adlogin(adlogin:Adminlog){
    return this.http.post("http://localhost:8080/adminlogin",adlogin,{responseType:'text' as 'json'});

  }
}
