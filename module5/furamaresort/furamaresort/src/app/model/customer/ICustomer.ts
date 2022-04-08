import {ICustomerType} from "./ICustomerType";

export interface ICustomer {
  id: number;
  nameCustomer: string;
  birthday: string;
  gender: string;
  code: string;
  phone: string;
  email: string;
  address: string;
  customerType: ICustomerType;


}
