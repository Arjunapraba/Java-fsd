import { HardcodedauthenticationserviceService } from './../service/hardcodedauthenticationservice.service';

import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  username:string='Arjun'
  password:string='xyz123'
 errorMessage='Invalid Credentials';
 invalidlogin:boolean=false;
  constructor(private router:Router,private hardcodedauthenticationserviceService:HardcodedauthenticationserviceService) { }

  ngOnInit(): void {
  }
  handlelogin(){
   if(this.hardcodedauthenticationserviceService.authenticate(this.username,this.password)) 
   {
     this.router.navigate(['home']);
     this.invalidlogin=false;
     console.log("Logged In Successfully")
    }
    else
      this.invalidlogin=true;  
   }
}
