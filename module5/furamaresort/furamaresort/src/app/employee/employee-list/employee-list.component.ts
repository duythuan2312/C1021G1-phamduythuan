import { Component, OnInit } from '@angular/core';
import {IEmployee} from "../../model/employee/IEmployee";
import {EmployeeServiceImpl} from "../../service/EmployeeServiceImpl";

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
 employees: IEmployee[];
  constructor(private employeeService: EmployeeServiceImpl) { }

  ngOnInit(): void {
    this.getAll();
  }
  getAll(){
    this.employeeService.getAll().subscribe(value => {
      this.employees = value;
    })
  }

}
