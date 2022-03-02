package ss0_ObjectDirection.baitap3.Service;

import ss0_ObjectDirection.baitap3.Model.Manage;

public class ManageServiceImp implements ManageService {
    private static Manage[] managenew = new Manage[2];
    static {
        managenew[0] = new Manage(1,"Pham Duy Thuận","Nam","Quảng nam","23/12/2003","Công nghệ thông tin",100,30,1000);
    }
    @Override
    public void add(Manage manage) {
    Manage[] manages = new Manage[managenew.length + 1];
    manages[manages.length - 1] = manage;
    for (int index = 0 ; index < managenew.length ; index++){
        manages[index] = managenew[index];
    }
    managenew = manages;
    }
    @Override
    public Manage[] all() {
        return managenew;
    }

    @Override
    public void testGender(String gender) {
        int count= 0;
       for (int i = 0 ; i < managenew.length ; i++){
           if (managenew[i].getGenDer().equals(gender)){
               count++;
           }
       }
        System.out.println(count);

    }


}
