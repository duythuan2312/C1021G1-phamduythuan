import { Component, OnInit } from '@angular/core';
import {ICustomer} from "../model/customer/ICustomer";
// import {CustomerServiceImpl} from "../service/CustomerServiceImpl";
import {ActivatedRoute} from "@angular/router";
import {CustomerService} from "../service/CustomerService";
import {FormBuilder, FormGroup} from "@angular/forms";


@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {

  customer: ICustomer[];
 fromValue: FormGroup;
  constructor(private customerService: CustomerService) {
  }

  ngOnInit(): void {
    this.customerService.getAll().subscribe(value =>{
      this.customer = value;
      console.log(value);
    })
    // @ts-ignore
    this.fromValue = new FormGroup(this.ngOnInit(),
      {
        id: [''],
        nameCustomer: [''],
        birthday: [''],
        gender: [''],
        code: [''],
        phone: [''],
        email: [''],
        address: [''],
        customerType: ['']
      }
    )

  }
  //
  // getCustomer(customerList: ICustomer) {
  //   this.customerRemove = customerList;
  //
  // }


  // delete(customerRemove: ICustomer) {
  //   this.customerService.remove(customerRemove);
  // }
}
