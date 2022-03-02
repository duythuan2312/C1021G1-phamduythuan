package service.implService;

import model.service.RentType;
import reponssitory.implService.RentTypeReponssitory;

import java.util.List;

public class RentTypeImpl implements RentTypeService{
    RentTypeReponssitory reponssitory = new RentTypeReponssitory();
    @Override
    public List<RentType> selectAll() {
        List<RentType> rentTypeList = reponssitory.selectAll();
        return rentTypeList;
    }
}
