import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {IWork} from '../iwork';

@Injectable({
  providedIn: 'root'
})
export class DictionaryServiceService {

   baseURL = 'http://localhost:3000/word'


  constructor(private http : HttpClient) { }
// đinh dạng kiểu dữ liệu trả về
  getAll(): any{
    return this.http.get<IWork[]>(this.baseURL)
  }

  findById(id): Observable<IWork> {
    return this.http.get<IWork>(this.baseURL + '/' + id);
  }
}
