package service.implService;

import model.service.ServiceType;
import reponssitory.implService.ServiceTypeReponssitory;

import java.util.List;

public class ServiceTypeImpl implements ServiceTypeS{
    ServiceTypeReponssitory serviceTypeReponssitory = new ServiceTypeReponssitory();
    @Override
    public List<ServiceType> selectAll() {
        List<ServiceType> serviceTypeList = serviceTypeReponssitory.selectAll();
        return serviceTypeList;
    }
}
