import { Component, OnInit } from '@angular/core';
import {IStudent} from '../model/IStudent';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {

  student: IStudent = {
    id: 1,
    name: 'Phạm Duy Thuận',
    adress: 'Quảng Nam',
    classRoom: 'C1021G1',
    mark: 10,
    image: 'https://cdn.lazi.vn/storage/uploads/users/avatar/1575377212_timthumb.png'
  };



  constructor() { }

  ngOnInit(): void {
  }


  getMark(value: any) {
    this.student.mark = value;
  }
}
