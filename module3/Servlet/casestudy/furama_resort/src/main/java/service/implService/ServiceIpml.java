package service.implService;

import model.service.Service;
import reponssitory.implService.ServiceReponssitory;

import java.util.List;

public class ServiceIpml implements ServiceImplSv{
  public   ServiceReponssitory serviceReponssitory = new ServiceReponssitory();

    @Override
    public List<Service> serviceAll() {
        List<Service> serviceList = serviceReponssitory.selectAll();
        return serviceList;
    }

    @Override
    public void createService(Service service) {
        serviceReponssitory.insertService(service);
    }
}
