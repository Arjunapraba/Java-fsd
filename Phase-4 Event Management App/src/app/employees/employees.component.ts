import { ApiService } from './../shared/api.service';
import { EmployeeModel } from './employee.model';
import { Component,OnInit } from '@angular/core';
import {FormBuilder,FormGroup} from '@angular/forms'
@Component({
  selector: 'app-employees',
  templateUrl: './employees.component.html',
  styleUrls: ['./employees.component.css']
})
export class EmployeesComponent implements OnInit {

  formValue !:FormGroup;
  EmployeeModelObj :EmployeeModel = new EmployeeModel();
  employeeData:any;
  showAdd !:boolean;
  showUpdate !:boolean;
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
  postEmployeeDetails(){
    this.EmployeeModelObj.firstname=this.formValue.value.firstname;
    this.EmployeeModelObj.lastname=this.formValue.value.lastname;
    this.EmployeeModelObj.email=this.formValue.value.email;

    this.api.addEmployee(this.EmployeeModelObj)
    .subscribe(res=>{
      console.log(res);
      alert("Added Successfully")
      let ref=document.getElementById('cancel')
      ref?.click();
      this.formValue.reset();
      this.getAllemployees();
    },
    err=>{
      alert("Something went wrong");
    }
    )
  }

  getAllemployees(){
    this.api.getAllEmployee()
    .subscribe(res=>{
      this.employeeData=res;
    })
  }

  deleteEmp(row:any){
   this.api.deleteEmployee(row.id)
   .subscribe(res=>{
    alert("Employee removed from Database")
    this.getAllemployees();
   })
  }

  updateEmp(row:any){
    this.showAdd=false;
    this.showUpdate=true;
    this.EmployeeModelObj.id=row.id;
    this.formValue.controls['firstname'].setValue(row.firstname)
    this.formValue.controls['lastname'].setValue(row.lastname)
    this.formValue.controls['email'].setValue(row.email)
  }

  updateEmpdetails(){
    this.EmployeeModelObj.firstname=this.formValue.value.firstname;
    this.EmployeeModelObj.lastname=this.formValue.value.lastname;
    this.EmployeeModelObj.email=this.formValue.value.email;
    
    this.api.updateEmployee(this.EmployeeModelObj,this.EmployeeModelObj.id)
    .subscribe(res=>{
      alert("Employee Details Updates Successfully")
      let ref=document.getElementById('cancel')
      ref?.click();
      this.formValue.reset();
      this.getAllemployees();
    })
  }

  clickAddemp(){
    this.formValue.reset();
    this.showAdd=true;
    this.showUpdate=false;
  }
}
