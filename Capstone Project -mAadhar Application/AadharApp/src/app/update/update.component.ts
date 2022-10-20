import { Update } from './../update';
import { UserserviceService } from './../service/userservice.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {

  update:Update=new Update("","","","");
  message:any;
  constructor(private service:UserserviceService) { }

  ngOnInit(): void {
  }

  updateNow(){
    this.service.update(this.update).subscribe((data)=>this.message=data);
  }
}
