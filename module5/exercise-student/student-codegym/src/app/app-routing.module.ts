import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {DetalisComponent} from './detalis/detalis.component';
import {StudentListComponent} from './student-list/student-list.component';


const routes: Routes = [
  {path: 'details/:id',component:DetalisComponent},
  {path: '',component:StudentListComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
