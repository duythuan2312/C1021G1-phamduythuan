import { Injectable } from '@angular/core';
import {ICustomer} from '../model/ICustomer';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerServiceService {

  API_URL = 'http://localhost:8080/list';

  API_DELETE = 'http://localhost:8080/customer/';

  API_CREATE = 'http://localhost:8080/create-customer';

  API_BYID = 'http://localhost:8080/get/';

  API_EDIT = 'http://localhost:8080/edit/';




  constructor(private httpClient: HttpClient) {

  }



  getAll(): Observable<ICustomer[]>{
    return this.httpClient.get<ICustomer[]>(this.API_URL);
  }


  getById(idCustomer): Observable<ICustomer> {
    return this.httpClient.get<ICustomer>(this.API_BYID+idCustomer);
  }


  delete(customerId: number): Observable<ICustomer> {
    return this.httpClient.get<ICustomer>(this.API_DELETE+`${customerId}`);
  }

  edit(idCustomer):Observable<ICustomer>{
    return this.httpClient.get<ICustomer>(this.API_EDIT+idCustomer);
  }


  save(customer): Observable<ICustomer> {
    console.log(customer);
    // const body = JSON.stringify(customer);
    // console.log(body);
    return this.httpClient.post<ICustomer>(this.API_CREATE, customer);
  }


}
