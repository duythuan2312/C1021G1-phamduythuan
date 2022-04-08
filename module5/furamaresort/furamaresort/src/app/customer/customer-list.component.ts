import { Component, OnInit } from '@angular/core';
import {ICustomer} from "../model/customer/ICustomer";
// import {CustomerServiceImpl} from "../service/CustomerServiceImpl";
import {ActivatedRoute} from "@angular/router";
import {CustomerService} from "../service/CustomerService";


@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {

  customer: CustomerService;
   customerRemove: ICustomer;

  constructor(private customerService: CustomerService) {
    this.customerService.getAll();
  }

  ngOnInit(): void {

  }

  getCustomer(customerList: ICustomer) {
    this.customerRemove = customerList;

  }


  // delete(customerRemove: ICustomer) {
  //   this.customerService.remove(customerRemove);
  // }
}
