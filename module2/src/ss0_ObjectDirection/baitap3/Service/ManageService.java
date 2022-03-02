package ss0_ObjectDirection.baitap3.Service;

import ss0_ObjectDirection.baitap3.Model.Manage;

public interface ManageService {
    void add(Manage manage);
    Manage[] all();
    void testGender(String gender);

}
