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

  API_BY_ID = 'http://localhost:8080/get/';

  API_EDIT = 'http://localhost:8080/edit/';




  constructor(private httpClient: HttpClient) {

  }



  getAll(): Observable<ICustomer[]>{
    return this.httpClient.get<ICustomer[]>(this.API_URL);
  }


  getById(idCustomer): Observable<ICustomer> {
    return this.httpClient.get<ICustomer>(this.API_BY_ID+idCustomer);
  }


  deleteCustomer(idCustomer):Observable<ICustomer>{
    console.log(idCustomer);
    return this.httpClient.delete<ICustomer>(this.API_DELETE+idCustomer).pipe();
  }

  edit(idCustomer,customer: ICustomer):Observable<ICustomer>{
    return this.httpClient.put<ICustomer>(this.API_EDIT+idCustomer,customer);
  }


  save(customer): Observable<ICustomer> {
    console.log(customer);
    const body = JSON.stringify(customer);
    console.log(body);
    return this.httpClient.post<ICustomer>(this.API_CREATE, customer);
  }


}
