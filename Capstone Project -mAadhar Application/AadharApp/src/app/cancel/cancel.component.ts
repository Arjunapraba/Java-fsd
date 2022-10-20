import { UserserviceService } from './../service/userservice.service';
import { Cancel } from './../cancel';
import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cancel',
  templateUrl: './cancel.component.html',
  styleUrls: ['./cancel.component.css']
})
export class CancelComponent implements OnInit {

  dup:any;
constructor( private http:HttpClient,private service:UserserviceService) { }
cancel:Cancel =new Cancel("","");
message:any;
  ngOnInit(){
    let response =  this.http.get("http://localhost:8080/showAll");
    response.subscribe((data)=>this.dup=data);
  }
  public cancelNow()
  {
     this.service.cancel(this.cancel).subscribe((data)=>this.message=data);
  }
}
