import { Component, OnInit } from '@angular/core';
import {IEmployee} from "../../model/employee/IEmployee";
import {EmployeeServiceImpl} from "../../service/EmployeeServiceImpl";

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
 employee: IEmployee[] = EmployeeServiceImpl.employees;
  constructor() { }

  ngOnInit(): void {
  }

}
