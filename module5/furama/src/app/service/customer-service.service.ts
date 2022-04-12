import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {ICustomer} from "../model/ICustomer";
// @ts-ignore
import {Observable} from "rxjs/dist/types";
@Injectable({
  providedIn: 'root'
})
export class CustomerServiceService {
   API_URL = 'http://localhost:8080/api';

  constructor(private httpClient: HttpClient) {

  }
  getAll(): Observable<ICustomer[]>{
    return this.httpClient.get<ICustomer[]>(this.API_URL);
  }
}
