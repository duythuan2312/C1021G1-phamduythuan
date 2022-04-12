import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {CustomerListComponent} from "./customer/customer-list.component";
import {FormComponent} from "./body/form.component";
import {EmployeeListComponent} from "./employee/employee-list/employee-list.component";
import {DetailsComponent} from "./details/details.component";


const routes: Routes = [
  {path: '', component:FormComponent},
  {path: 'employee', component:EmployeeListComponent},
  // {path: 'details/:id', component:DetailsComponent},
  {path: 'customer',component:CustomerListComponent}
  ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
