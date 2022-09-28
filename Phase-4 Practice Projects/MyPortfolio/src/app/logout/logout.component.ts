import { Router } from '@angular/router';
import { HardcodedauthenticationserviceService } from './../service/hardcodedauthenticationservice.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-logout',
  templateUrl: './logout.component.html',
  styleUrls: ['./logout.component.css']
})
export class LogoutComponent implements OnInit {

  constructor(private router:Router,private hardcodedauthenticationserviceService:HardcodedauthenticationserviceService) { 

  }

  ngOnInit() {

    this.hardcodedauthenticationserviceService.logout();
  }

  goto()
  {
    this.router.navigate(['logout/login']);
  }
}
