import {Component, OnInit} from '@angular/core';
import {CustomerTypeService} from '../service/customer-type.service';
import {ICustomerType} from '../model/ICustomerType';
import {CustomerServiceService} from '../service/customer-service.service';
import {ActivatedRoute, Router} from '@angular/router';
import {FormControl, FormGroup, NgForm, Validators} from '@angular/forms';
import {ICustomer} from '../model/ICustomer';
import {MatSnackBar} from '@angular/material/snack-bar';

@Component({
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css']
})
export class CreateCustomerComponent implements OnInit {
  customerTypeList: ICustomerType[];
  customerForm: FormGroup;
  REGEX_ID_CARD = '[0-9]{12}';
  REGEX_SDT = '(09|03|07)[0-9]{8}';
  newCustomer: ICustomer = {};

  constructor(private customerTypeService: CustomerTypeService,
              private activatedRoute: ActivatedRoute,
              private  customerService : CustomerServiceService,
              private router: Router,
              private matSnackBar: MatSnackBar) {
  }

  ngOnInit(): void {
    this.getAllCustomerType();
    this.createForm();
    this.save();
  }


  createForm() {
    this.customerForm = new FormGroup({
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

  getAllCustomerType() {
    this.customerTypeService.getAllCustomerType().subscribe((value => {
      this.customerTypeList = value;
      console.log(value);
    }));
  }

  save() {
    if (this.customerForm.valid){
      this.newCustomer.name = this.customerForm.get('name').value;
      this.newCustomer.dayOfBirth = this.customerForm.get('dayOfBirth').value;
      this.newCustomer.gender = this.customerForm.get('gender').value == 1 ? true : false;
      this.newCustomer.idCard = this.customerForm.get('idCard').value;
      this.newCustomer.phone = this.customerForm.get('phone').value;
      this.newCustomer.email = this.customerForm.get('email').value;
      this.newCustomer.address = this.customerForm.get('address').value;
      for (let i = 0 ; i < this.customerTypeList.length ; i++){
        if (this.customerTypeList[i].customerTypeId == this.customerForm.get('customerType').value ){
          this.newCustomer.customerType = this.customerTypeList[i];
          console.log('sadasdasdasdsad');
        }
      }
      return this.customerService.save(this.newCustomer).subscribe(value =>{
         this.router.navigateByUrl('/customer');
      });
    }


    console.log(this.newCustomer);

  }

  openSnackBar(message: string, action: string) {
    this.matSnackBar.open(message, action);
  }
}
