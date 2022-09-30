import { HardcodedauthenticationserviceService } from './../service/hardcodedauthenticationservice.service';
import { Component, OnInit } from '@angular/core';
import {FormBuilder,FormGroup} from '@angular/forms'
@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  isLoggedIn:boolean=false;
  formValue !:FormGroup;
  constructor(public hardcodedauthenticationserviceService:HardcodedauthenticationserviceService,private formbuilder :FormBuilder) { }
  
  ngOnInit() {
    this.isLoggedIn=this.hardcodedauthenticationserviceService.isLoggedIn();
    this.formValue=this.formbuilder.group(
      {
        opw:[''],
        npw:[''],
        rnpw:[''],
      })
  }

}
