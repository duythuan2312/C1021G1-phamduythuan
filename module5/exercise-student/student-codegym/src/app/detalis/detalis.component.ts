import { Component, OnInit } from '@angular/core';
import {StudentDao} from '../Dao/StudentDao';
import {IStudent} from '../model/IStudent';
import {ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-detalis',
  templateUrl: './detalis.component.html',
  styleUrls: ['./detalis.component.css']
})
export class DetalisComponent implements OnInit {
     student: IStudent;
     id: number;

  constructor(private studentdao : StudentDao,private route: ActivatedRoute) {
    this.id = Number(this.route.snapshot.paramMap.get('id'));
       console.log(this.id)
  }

  ngOnInit(): void {
    this.student = this.studentdao.getView(this.id);
  }

  getMark(value: any) {
    this.student.mark = value;
  }
}
