package service.implEmployee;

import model.employee.Possition;
import reponssitory.implEmployee.PossitionReponssitory;

import java.util.List;

public class PossitionServiceImpl implements PossitionService{
    PossitionReponssitory possitionReponssitory = new PossitionReponssitory();
    @Override
    public List<Possition> finAll() {
        return  possitionReponssitory.selectAll();
    }
}
