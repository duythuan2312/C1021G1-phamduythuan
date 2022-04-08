import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-register-component',
  templateUrl: './register-component.component.html',
  styleUrls: ['./register-component.component.css']
})
export class RegisterComponentComponent implements OnInit {
  createRegistration: FormGroup;

  constructor() { }

  ngOnInit(): void {
    this.createRegistration = new FormGroup({
      email: new FormControl("", Validators.required),
      passwork: new FormControl("",Validators.required),
      country: new FormControl("",Validators.required),
      age: new FormControl("",Validators.min(18)),
      gender: new FormControl(),
      phone: new FormControl("",Validators.pattern(" /^\\+84\\d{9,10}$/")),
    });
  }

  onSubmit() {
    console.log(this.createRegistration.value);
  }
}
