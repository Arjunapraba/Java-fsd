import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-fetchall',
  templateUrl: './fetchall.component.html',
  styleUrls: ['./fetchall.component.css']
})
export class FetchallComponent implements OnInit {

  dup:any;
  constructor( private http:HttpClient) { }

  ngOnInit(){
    let response =  this.http.get("http://localhost:8080/showAll");
    response.subscribe((data)=>this.dup=data);
  }

}
