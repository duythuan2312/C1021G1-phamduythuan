import {ICustomerType} from "./ICustomerType";

export interface ICustomer {
  customerId: number;
  name: string;
  dayOfBirth: string;
  gender: boolean;
  idCard: string;
  phone: string;
  email: string;
  address: string;
  customerType: ICustomerType;



}
