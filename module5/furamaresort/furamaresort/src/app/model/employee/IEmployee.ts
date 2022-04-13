import {IDivision} from "./IDivision";
import {IEducation} from "./IEducation";
import {IPosition} from "./IPosition";

export interface IEmployee {
  id: number;
  name: string;
  birthday: string;
  code: string;
  phone: string;
  email: string;
  salary: string;
  division: IDivision;
  position: IPosition;
  education: IEducation

}
