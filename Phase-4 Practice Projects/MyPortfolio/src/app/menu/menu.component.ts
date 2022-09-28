import { HardcodedauthenticationserviceService } from './../service/hardcodedauthenticationservice.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  isLoggedIn:boolean=false;
  constructor(public hardcodedauthenticationserviceService:HardcodedauthenticationserviceService) { }

  ngOnInit() {
    this.isLoggedIn=this.hardcodedauthenticationserviceService.isLoggedIn();
  }

}
