import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Todo} from "../todo";

@Injectable({
  providedIn: 'root'
})
export class TodoserviceService {
API_URL = 'http://localhost:3000/todo'

  constructor(private httpClient : HttpClient) { }

  getAll():Observable<Todo[]>{
    return this.httpClient.get<Todo[]>(this.API_URL);
  }

  delete(idCustomer):Observable<Todo>{
  return this.httpClient.delete<Todo>(this.API_URL + idCustomer);
  }
}
