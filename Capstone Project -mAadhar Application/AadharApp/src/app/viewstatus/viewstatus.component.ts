import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-viewstatus',
  templateUrl: './viewstatus.component.html',
  styleUrls: ['./viewstatus.component.css']
})
export class ViewstatusComponent implements OnInit {

  dup:any;
  constructor( private http:HttpClient) { }

  ngOnInit(){
    let response =  this.http.get("http://localhost:8080/showAll");
    response.subscribe((data)=>this.dup=data);
  }

}
