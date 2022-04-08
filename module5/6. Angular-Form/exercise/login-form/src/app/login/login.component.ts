import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
     login: FormGroup;
  constructor() { }

  ngOnInit(): void {
    this.login = new FormGroup({
      email: new FormControl('' , [Validators.email , Validators.required]),
      passworks: new FormControl('' , [Validators.min(6) , Validators.required])
    });
  }

  loginPage() {
    console.log(this.login.value);
  }
}
