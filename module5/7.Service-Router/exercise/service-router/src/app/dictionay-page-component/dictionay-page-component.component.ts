import {Component, OnInit} from '@angular/core';
import {IWork} from '../iwork';
import {FormGroup} from '@angular/forms';
import {DictionaryServiceService} from '../service/dictionary-service.service';

@Component({
  selector: 'app-dictionay-page-component',
  templateUrl: './dictionay-page-component.component.html',
  styleUrls: ['./dictionay-page-component.component.css']
})
export class DictionayPageComponentComponent implements OnInit {

  word: IWork[];

  constructor(private dictionaryServiceService: DictionaryServiceService) {
  }

  ngOnInit(): void {
    this.dictionaryServiceService.getAll().subscribe((value) => {
      this.word = value;
    })
  }



}
