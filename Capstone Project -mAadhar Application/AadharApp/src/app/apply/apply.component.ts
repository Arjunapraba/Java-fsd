import { Application } from './../application';
import { UserserviceService } from './../service/userservice.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-apply',
  templateUrl: './apply.component.html',
  styleUrls: ['./apply.component.css']
})
export class ApplyComponent implements OnInit {

apply:Application = new Application("","","","","","");
message:any;
  constructor(private service:UserserviceService) { }
  
  ngOnInit(): void {
  }   
  public applyNow()
  {
     this.service.apply(this.apply).subscribe((data)=>this.message=data);
  }
}
