import { Component, OnInit } from '@angular/core';
import {IStudent} from '../model/IStudent';
import {StudentDao} from '../Dao/StudentDao';

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
  };
  students: IStudent[] = StudentDao.studens;

colorRow = '';

  constructor() { }

  ngOnInit(): void {
  }


  getMark(value: any) {
    this.student.mark = value;
  }

  chageColor(value: string) {
    this.colorRow = value;

  }


}
