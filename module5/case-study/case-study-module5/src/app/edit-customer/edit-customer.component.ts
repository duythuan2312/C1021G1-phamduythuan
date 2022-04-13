import { Component, OnInit } from '@angular/core';
import {ICustomer} from '../model/ICustomer';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {CustomerServiceService} from '../service/customer-service.service';

@Component({
  selector: 'app-edit-customer',
  templateUrl: './edit-customer.component.html',
  styleUrls: ['./edit-customer.component.css']
})
export class EditCustomerComponent implements OnInit {

  customerList : ICustomer[];
  editForm: FormGroup;
  REGEX_ID_CARD = '[0-9]{12}';
  REGEX_SDT = '(09|03|07)[0-9]{8}';
  constructor(private customerService: CustomerServiceService) { }
  cusomer: ICustomer;
  idCustomer: number;
  ngOnInit(): void {
    this.getAll();
    this.editCustomer();

  }

  getAll(){
    this.customerService.getAll().subscribe(data =>{
      this.customerList = data;
    })
  }

  editCustomer() {
    this.editForm = new FormGroup({
      customerId: new FormControl(),
      name: new FormControl('', Validators.required),
      dayOfBirth: new FormControl('', Validators.required),
      gender: new FormControl('', Validators.required),
      idCard: new FormControl('', [Validators.required, Validators.pattern(this.REGEX_ID_CARD)]),
      phone: new FormControl('', [Validators.required, Validators.pattern(this.REGEX_SDT)]),
      email: new FormControl('', [Validators.required, Validators.email]),
      address: new FormControl('', Validators.required),
      customerType: new FormControl('', Validators.required)
    });
  }

  edit(idCustomer){
    this.customerService.edit(this.idCustomer,this.cusomer).subscribe(data =>{
      this.cusomer = data;
      this.getAll();
    })
  }

}
