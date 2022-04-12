import {Component, OnInit} from '@angular/core';
import {ICustomer} from '../model/ICustomer';
import {CustomerServiceService} from '../service/customer-service.service';
import {ActivatedRoute, Route} from '@angular/router';
import {FormControl, FormGroup} from '@angular/forms';
import {ICustomerType} from '../model/ICustomerType';
import {CustomerTypeService} from '../service/customer-type.service';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  customerList: ICustomer[];
  customerDto: ICustomer = null;
  customerForm: FormGroup;
  idCustomer: number;


  constructor(private customerService: CustomerServiceService, private activatedRoute: ActivatedRoute) {
  }

  ngOnInit(): void {
    this.getAll();
  }


  getAll() {
    this.customerService.getAll().subscribe((value) => {
      this.customerList = value;
      console.log(value);
    });
  }

  getInfo(id: number) {
    this.customerService.getById(id).subscribe((data) => {
      this.customerDto = data;
    });
  }



  delete(idCustomer) {
    this.customerService.delete(this.idCustomer).subscribe(result => {
      this.customerDto = result;
      this.getAll();
      console.log('5655996');
    });
  }
}
