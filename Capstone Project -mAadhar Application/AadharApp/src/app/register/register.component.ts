import { UserserviceService } from './../service/userservice.service';
import { Register } from './../register';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  register: Register=new Register("","","");
  message:any;
  constructor(private service:UserserviceService) { }
  ngOnInit(): void {
  }
 
  
  public registerNow()
  {
     this.service.register(this.register).subscribe((data)=>this.message=data);
  }
}
