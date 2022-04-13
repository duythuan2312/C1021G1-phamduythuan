import {Component, OnInit} from '@angular/core';
import {ICustomer} from '../model/ICustomer';
import {CustomerServiceService} from '../service/customer-service.service';
import {ActivatedRoute, Route} from '@angular/router';



@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  customerList: ICustomer[];
  customerDto: ICustomer = null;
  idCustomer: number;
  p: number = 1;


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
    this.customerService.deleteCustomer(this.idCustomer).subscribe(data => {
      this.customerDto = data;
      this.ngOnInit();
    });

    this.customerService.getById(idCustomer).subscribe(data => {
      this.customerDto =data;
    })
  }

  getId(id : number) {
    this.idCustomer = id;
  }
}
