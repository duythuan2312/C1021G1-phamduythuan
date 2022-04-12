import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-register-component',
  templateUrl: './register-component.component.html',
  styleUrls: ['./register-component.component.css']
})
export class RegisterComponentComponent implements OnInit {
  createRegistration: FormGroup;
   passwork: string;

  constructor() { }

  ngOnInit(): void {
    this.createRegistration = new FormGroup({
      email: new FormControl('', [Validators.email, Validators.required]),
      passwork: new FormControl('', [Validators.required, Validators.minLength(6)]),
      confirmPassword: new FormControl('', [Validators.required, Validators.pattern(this.passwork)]),
      country: new FormControl('', Validators.required),
      age: new FormControl('', [Validators.required, Validators.min(18)]),
      gender: new FormControl('', Validators.required),
      phone: new FormControl('', [Validators.required, Validators.pattern(/(84|03|05|07|08|09)[0-9]{8}/)])
    });
  }




  onSubmit() {
    console.log(this.createRegistration.value);
  }
}
