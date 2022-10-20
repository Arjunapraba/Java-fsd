import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-viewcancel',
  templateUrl: './viewcancel.component.html',
  styleUrls: ['./viewcancel.component.css']
})
export class ViewcancelComponent implements OnInit {

  can:any;
  constructor( private http:HttpClient) { }

  ngOnInit(){
    let response =  this.http.get("http://localhost:8080/cancelrequests");
    response.subscribe((data)=>this.can=data);
  }

}
