package service.implService;

import model.service.Service;

import java.util.List;

public interface ServiceImplSv {
    List<Service> serviceAll();
    void createService(Service service);
}
