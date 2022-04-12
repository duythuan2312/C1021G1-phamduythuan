import { Injectable } from '@angular/core';
import {Observable} from 'rxjs';
import {ICustomerType} from '../model/ICustomerType';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CustomerTypeService {

  API_CUSTOMER_TYPE = 'http://localhost:8080/api/customer-type'

  constructor(private httpClient : HttpClient) { }

  getAllCustomerType(): Observable<ICustomerType[]>{
    return this.httpClient.get<ICustomerType[]>(this.API_CUSTOMER_TYPE);
  }
}
