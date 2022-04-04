import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
  num1 = 0;
  num2 = 0;
  oparetor = '';
  result = 0;

  operatorSum(){
    this.oparetor = '+';
  }

  operatorSubtraction(){
    this.oparetor = '-';
  }

  operatorMultiplication(){
    this.oparetor = '*';
  }

  operatorDivision(){
    this.oparetor = '/';
  }

  calculator(){
    switch (this.oparetor) {
      case '+':
        this.result = this.num1 + this.num2;
        break;
      case '-':
        this.result = this.num1 - this.num2;
        break;
      case '*':
        this.result = this.num1 * this.num2;
        break;
      case '/':
        this.result = this.num1 / this.num2;
        break;

    }
  }

  constructor() { }

  ngOnInit(): void {
  }

}
