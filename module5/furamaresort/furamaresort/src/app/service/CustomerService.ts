import { Injectable } from '@angular/core';
import {Observable} from 'rxjs';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {ICustomer} from "../model/customer/ICustomer";

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(
    private http: HttpClient
  ) { }

  private baseURL = 'http://localhost:3000/customer';

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  };

  getAll(): Observable<ICustomer[]> {
    return this.http.get<ICustomer[]>(this.baseURL);
  }

  save(customer): Observable<ICustomer> {
    return this.http.post<ICustomer>(this.baseURL , JSON.stringify(customer))
  }

  findById(id): Observable<ICustomer> {
    return this.http.get<ICustomer>(this.baseURL + '/' + id).pipe();
  }


  delete(id) {
    return this.http.delete<ICustomer>(this.baseURL + '/' + id).pipe();
  }
}





















































// import {ICustomer} from "../model/customer/ICustomer";
// import {Injectable} from '@angular/core';
// @Injectable({providedIn:'root'})
// export class CustomerServiceImpl {
//  public static customer: ICustomer[] = [
//     {
//       id: 1,
//       nameCustomer: 'Phạm Duy Thuận',
//       birthday: '23-12-2003',
//       gender: 'Nam',
//       code: '2064006461245',
//       email: 'phamduythuan87@gmail.com',
//       phone: '0702509243',
//       address: 'Quảng Nam',
//       customerType: 'Platinum'
//     },
//
//     {
//       id: 2,
//       nameCustomer: 'Đặng Duy Linh',
//       birthday: '23-12-1993',
//       gender: 'Lưỡng Tính',
//       code: '206412379955',
//       email: 'đanguylinh@gmail.com',
//       phone: '0702123456',
//       address: 'Đà Nẵng',
//       customerType: 'Member'
//
//     },
//
//     {
//       id: 3,
//       nameCustomer: 'Phạm Duy Thuận',
//       birthday: '23-12-2003',
//       gender: 'Nam',
//       code: '2064006461245',
//       email: 'phamduythuan87@gmail.com',
//       phone: '0702509243',
//       address: 'Quảng Nam',
//       customerType: 'Platinum'
//
//     },
//
//
//     {
//       id: 4,
//       nameCustomer: 'Nguyễn Văn Mậm Đạt',
//       birthday: '1-5-2003',
//       gender: 'Nam',
//       code: '2064006461456',
//       email: 'datvan@gmail.com@gmail.com',
//       phone: '0345789277',
//       address: 'Quảng Nam',
//       customerType: 'Gold'
//
//     },
//
//
//     {
//       id: 5,
//       nameCustomer: 'Nguyễn Công Phượng',
//       birthday: '23-12-2003',
//       gender: 'Nam',
//       code: '2064006461245',
//       email: 'congphuong@gmail.com',
//       phone: '0702509243',
//       address: 'Nghệ An',
//       customerType: 'Diamond'
//
//     },
//
//
//     {
//       id: 6,
//       nameCustomer: 'Nguyễn Anh Hoàng',
//       birthday: '7-5-1996',
//       gender: 'Nam',
//       code: '206478945631',
//       email: 'anhhoang@gmail.com',
//       phone: '0702509243',
//       address: 'Quảng Nam',
//       customerType: 'Gold'
//
//     },
//
//
//     {
//       id: 7,
//       nameCustomer: 'Lê Thị Hiếu',
//       birthday: '16-2-1997',
//       gender: 'Nữ',
//       code: '2064006465695',
//       email: 'lethihieu@gmail.com',
//       phone: '0905053077',
//       address: 'Hội An',
//       customerType: 'Diamond'
//
//     },
//
//
//     {
//       id: 8,
//       nameCustomer: 'Phạm Duy Thuận',
//       birthday: '23-12-2003',
//       gender: 'Nam',
//       code: '2064006461245',
//       email: 'phamduythuan87@gmail.com',
//       phone: '0702509243',
//       address: 'Quảng Nam',
//       customerType: 'Gold'
//
//     },
//
//
//     {
//       id: 9,
//       nameCustomer: 'Phạm Duy Thuận',
//       birthday: '23-12-2003',
//       gender: 'Nam',
//       code: '2064006461245',
//       email: 'phamduythuan87@gmail.com',
//       phone: '0702509243',
//       address: 'Quảng Nam',
//       customerType: 'Silver'
//
//     },
//
//     {
//       id: 10,
//       nameCustomer: 'Lương Duy Bảo',
//       birthday: '24-6-1995',
//       gender: 'Nữ',
//       code: '2064006461245',
//       email: 'baongo@gmail.com',
//       phone: '0904563217',
//       address: 'Đà Nẵng',
//       customerType: 'Member'
//
//     },
//   ]
//
//   getView(id : number){
//     for (let item of CustomerServiceImpl.customer){
//       if (item.id == id){
//         return item;
//       }
//     }
//   }
//
//   // remove(remove: CustomerServiceImpl) {
//   //        CustomerServiceImpl.customer.splice()
//   // }
//   remove(customerRemove: ICustomer) {
//     CustomerServiceImpl.customer.splice(customerRemove.id-1,1);
//   }
// }
