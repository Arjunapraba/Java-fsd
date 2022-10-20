import { UserserviceService } from './../service/userservice.service';
import { Userlog } from './../userlog';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-userlogin',
  templateUrl: './userlogin.component.html',
  styleUrls: ['./userlogin.component.css']
})
export class UserloginComponent implements OnInit {

  constructor(private service:UserserviceService) { }

  ngOnInit(): void {
  }
  userlog: Userlog=new Userlog("","");
  message:any;
  public loginNow()
  {
     this.service.login(this.userlog).subscribe((data)=>this.message=data);
    
  }
}
