import {IStudent} from '../model/IStudent';
import {Injectable} from '@angular/core';
@Injectable({providedIn:'root'})
export class StudentDao {
 public static studens: IStudent[] = [
    {
      id: 1,
      name: 'Phạm Duy Thuận',
      adress: 'Quảng Nam',
      classRoom: 'C1021G1',
      mark: 9,
    },

    {
      id: 2,
      name: 'Nguyễn Công Phượng',
      adress: 'Nghệ An',
      classRoom: 'C1021G1',
      mark: 9,

    },

    {
      id: 3,
      name: 'Hoàng Đức Tịnh',
      adress: 'Huế',
      classRoom: 'C1021G1',
      mark: 3,


    },

    {
      id: 4,
      name: 'Nguyễn Văn Ngọc Đạt',
      adress: 'Quảng Trị',
      classRoom: 'C1021G1',
      mark: 8,

    },


    {
      id: 5,
      name: 'Phạm Duy Thuận',
      adress: 'Quảng Nam',
      classRoom: 'C1021G1',
      mark: 9,

    },


    {
      id: 6,
      name: 'Hồ Nhật Hiếu',
      adress: 'Hội An',
      classRoom: 'C1021G1',
      mark: 10,

    },


    {
      id: 7,
      name: 'Đặng Thị Linh',
      adress: 'Đà Nẵng',
      classRoom: 'C1021G1',
      mark: 8,

    },


    {
      id: 8,
      name: 'Nguyễn Anh Hoàng',
      adress: 'Bình Định',
      classRoom: 'C1021G1',
      mark: 6,

    },


    {
      id: 9,
      name: 'Nguyễn Thành Long',
      adress: 'Đà Nẵng',
      classRoom: 'C1021G1',
      mark: 8,
    },
    {
      id: 10,
      name: 'Lương Duy Bảo',
      adress: 'Đà Nẵng',
      classRoom: 'C1021G1',
      mark: 6,
    },
    ];

 getView(id : number){
   for (let item of StudentDao.studens){
     if (item.id == id){
       return item;
     }
   }

 }


}
