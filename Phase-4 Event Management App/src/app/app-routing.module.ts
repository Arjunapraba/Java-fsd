import { ShowallemployeesComponent } from './showallemployees/showallemployees.component';
import { EmployeesComponent } from './employees/employees.component';
import { RouteguardService } from './service/routeguard.service';
import { ErrorComponent } from './error/error.component';
import { LogoutComponent } from './logout/logout.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';


import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {path:'',component:LoginComponent},
  {path:'employees',component:EmployeesComponent},
  {path:'home',component:HomeComponent,canActivate:[RouteguardService]},
  {path:'login',component:LoginComponent},
  {path:'logout',component:LogoutComponent,canActivate:[RouteguardService]},
  {path:'showallemployees',component:ShowallemployeesComponent,canActivate:[RouteguardService]},
  {path:'logout/login',component:LoginComponent},
  {path:'**',component:ErrorComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
