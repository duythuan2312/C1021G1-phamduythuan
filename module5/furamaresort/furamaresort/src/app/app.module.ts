import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormComponent } from './body/form.component';
import { CustomerListComponent } from './customer/customer-list.component';
import { NavarComponent } from './navar/navar.component';
import { FooterComponent } from './footer/footer.component';
import { EmployeeListComponent } from './employee/employee-list/employee-list.component';
import { EditComponent } from './edit/edit.component';

@NgModule({
  declarations: [
    AppComponent,
    FormComponent,
    CustomerListComponent,
    NavarComponent,
    FooterComponent,
    EmployeeListComponent,
    EditComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
