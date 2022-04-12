import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {BodyComponent} from "./body/body.component";
import {ListCustomerComponent} from "./list-customer/list-customer.component";

const routes: Routes = [
  {path: '', component:BodyComponent},
  {path: 'customer', component:ListCustomerComponent}
  ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
