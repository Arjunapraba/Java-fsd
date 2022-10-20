import { Adminlog } from './../adminlog';
import { UserserviceService } from './../service/userservice.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {

  constructor(private service:UserserviceService) { }

  ngOnInit(): void {
  }
  adminlog :Adminlog = new Adminlog("","");
  message:any;
  public adloginNow()
  {
     this.service.adlogin(this.adminlog).subscribe((data)=>this.message=data);
    
  }
}
