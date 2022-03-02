package reponssitory.implService;

import model.service.Service;

import java.util.List;

public interface ReponssitoryService {
    List<Service> selectAll();
    void insertService(Service service);

 }
