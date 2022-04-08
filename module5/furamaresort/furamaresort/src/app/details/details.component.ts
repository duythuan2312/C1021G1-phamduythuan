import { Component, OnInit } from '@angular/core';
import {ICustomer} from "../model/customer/ICustomer";


@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.css']
})
export class DetailsComponent implements OnInit {
  customer:ICustomer;
  id: number;

  ngOnInit(): void {
  }


  // constructor(private customerServiceImpl: CustomerServiceImpl, private route: ActivatedRoute) {
  //   this.id = Number(this.route.snapshot.paramMap.get('id'));
  //   console.log(this.id);
  // }
  //
  // ngOnInit(): void {
  //   this.customer = this.customerServiceImpl.getView(this.id);
  // }

}
