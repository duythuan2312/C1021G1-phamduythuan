package service.implEmployee;

import model.employee.Education;
import reponssitory.implEmployee.EducationReponssitory;

import java.util.List;

public class EducationServiceImpl implements EducationService{
    EducationReponssitory educationReponssitory = new EducationReponssitory();

    @Override
    public List<Education> finAll() {
        return educationReponssitory.selectAll();
    }
}
