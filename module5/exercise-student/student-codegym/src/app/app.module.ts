import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StudentListComponent } from './student-list/student-list.component';
import { NavarComponent } from './navar/navar.component';
import { FooterComponent } from './footer/footer.component';
import { DetalisComponent } from './detalis/detalis.component';

@NgModule({
  declarations: [
    AppComponent,
    StudentListComponent,
    NavarComponent,
    FooterComponent,
    DetalisComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
