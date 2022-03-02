//package ss0_ObjectDirection.baitap2.Service;
//
//import ss0_ObjectDirection.baitap2.Model.List;
//import ss101_Dethi.model.Phone;
//
//public class ListServiceImp implements ListService{
//    private static List<List>[] listnew = new List<Phone>[2];
//    static {
//        listnew[0] = new List<Phone>(2,"Nguyễn Thanh Phèo","1/3/1993","Nam","C1021G1",10);
//        listnew[1] = new List<Phone>(1,"Lê Thị Nở","2/6/1995","Nữ","C1021G1",10);
//
//    }
//
//
//    @Override
//    public void add(List<Phone> list) {
//        List<Phone>[] newList  = new List<Phone>[listnew.length+1];
//        newList[newList.length-1] = list;
//
//        for (int i = 0 ; i < listnew.length ; i++){
//            newList[i] = listnew[i];
//        }
//        listnew = newList;
//    }
//
//    @Override
//    public void delete(int mssv) {
//        for (int i = 0 ; i < listnew.length ;i++ ){
//            if (listnew[i].getMssv() == mssv ){
//                listnew[i] = null;
//            }
//        }
//
//    }
//
//    @Override
//    public List<Phone>[] All() {
//        return listnew;
//    }
//
//    @Override
//    public void remove(int index) {
//        listnew[index - 1] = null;
//    }
//
//    @Override
//    public void seach(String msSv) {
//      for (int i = 0 ; i < listnew.length ; i++){
//          if (check(msSv) == true){
//              if (listnew[i].getName().contains(msSv) ){
//                  System.out.println(listnew[i]);
//              }
//          }else {
//              if (listnew[i].getMssv() == Integer.parseInt(msSv)){
//                  System.out.println(listnew[i]);
//              }
//          }
//      }
//
//    }
//
//       public boolean check(String msSv){
//        for (int i = 0 ; i < msSv.length() ; i++){
//            if (Character.isLetter(msSv.charAt(i))){
//                return true;
//            }
//        }
//        return false;
//}
//}
