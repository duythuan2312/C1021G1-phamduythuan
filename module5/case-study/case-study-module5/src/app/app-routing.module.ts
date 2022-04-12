import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {BodyComponent} from './body/body.component';
import {CustomerListComponent} from './customer-list/customer-list.component';
import {CreateCustomerComponent} from './create-customer/create-customer.component';


const routes: Routes = [
  {path: '' , component : BodyComponent},
  {path: 'customer' , component: CustomerListComponent},
  {path: 'create-customer' , component: CreateCustomerComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
