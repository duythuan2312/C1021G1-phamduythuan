import { Component, OnInit } from '@angular/core';
import {ICustomer} from "../model/ICustomer";
import {CustomerServiceService} from "../service/customer-service.service";

@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListCustomerComponent implements OnInit {
     customer : ICustomer[] | undefined;

  constructor(private customerService: CustomerServiceService) {}

  ngOnInit(): void {
    this.customerService.getAll().subscribe((value: ICustomer[] | undefined) => {
      this.customer = value;
      console.log(value);
    })
  }

}
