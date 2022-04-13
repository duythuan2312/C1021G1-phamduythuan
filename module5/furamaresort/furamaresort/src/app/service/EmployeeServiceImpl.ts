import {IEmployee} from "../model/employee/IEmployee";
import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
@Injectable({
  providedIn: 'root'
})
export  class EmployeeServiceImpl {


  constructor(private httpClient: HttpClient) {
  }
  URL_API : 'http://localhost:3000/employee'


  getAll():Observable<IEmployee[]>{
    return  this.httpClient.get<IEmployee[]>(this.URL_API);
  }

}


