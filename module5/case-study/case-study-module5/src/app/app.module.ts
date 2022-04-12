import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavarComponent } from './navar/navar.component';
import { BodyComponent } from './body/body.component';
import { FooterComponent } from './footer/footer.component';
import {CustomerListComponent} from './customer-list/customer-list.component';
import {HttpClientModule} from '@angular/common/http';
import { CreateCustomerComponent } from './create-customer/create-customer.component';
import {ReactiveFormsModule} from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
 CustomerListComponent,
    NavarComponent,
    BodyComponent,
    FooterComponent,
    CreateCustomerComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
