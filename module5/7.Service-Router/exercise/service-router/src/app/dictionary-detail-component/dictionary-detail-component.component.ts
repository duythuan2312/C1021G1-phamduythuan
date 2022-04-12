import { Component, OnInit } from '@angular/core';
import {DictionaryServiceService} from '../service/dictionary-service.service';
import {ActivatedRoute} from '@angular/router';
import {IWork} from '../iwork';

@Component({
  selector: 'app-dictionary-detail-component',
  templateUrl: './dictionary-detail-component.component.html',
  styleUrls: ['./dictionary-detail-component.component.css']
})
export class DictionaryDetailComponentComponent implements OnInit {
  word: IWork;
    id: number;
  constructor(private dictionaryServiceService: DictionaryServiceService,private route: ActivatedRoute) {

  }

  ngOnInit(): void {
    this.id = Number(this.route.snapshot.paramMap.get('id'))
    this.getIfo();
  }
 getIfo(){
    this.dictionaryServiceService.findById(this.id).subscribe((data) =>{
      this.word = data;
      console.log(data)
    })
 }

  getAll(){
    this.dictionaryServiceService.getAll();
  }

}
