package service.implEmployee;

import model.employee.Division;
import reponssitory.implEmployee.DivisionReponsitory;

import java.util.List;

public class DivisionServiceImpl implements DivisionService{
    DivisionReponsitory divisionReponsitory = new DivisionReponsitory();
    @Override
    public List<Division> finAll() {
        return divisionReponsitory.selectAll();
    }
}
