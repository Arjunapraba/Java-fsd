import { Component, OnInit } from '@angular/core';
import { ApiService } from './../shared/api.service';
import { EmployeeModel } from './../employees/employee.model';
import {FormBuilder,FormGroup} from '@angular/forms'
@Component({
  selector: 'app-showallemployees',
  templateUrl: './showallemployees.component.html',
  styleUrls: ['./showallemployees.component.css']
})
export class ShowallemployeesComponent implements OnInit {
  formValue !:FormGroup;
  EmployeeModelObj :EmployeeModel = new EmployeeModel();
  employeeData:any;
  constructor(private api:ApiService,private formbuilder :FormBuilder) { }

  ngOnInit(): void {
    this.formValue=this.formbuilder.group(
      {
        firstname:[''],
        lastname:[''],
        email:['']
      }
    )
    this.getAllemployees();
  }
  getAllemployees(){
    this.api.getAllEmployee()
    .subscribe(res=>{
      this.employeeData=res;
    })
  }
}
