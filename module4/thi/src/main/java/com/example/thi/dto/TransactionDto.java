package com.example.thi.dto;

import com.example.thi.model.Customer;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TransactionDto implements Validator {

    private Long id;
    @Pattern(regexp = "^(MGD)(-)[0-9]{4}$" ,message = "Hãy Nhập Đúng Định Dạng VD:MGD_3456")
    private String codeTransaction;
    private String dateTransaction;
    @NotBlank(message = "Hãy Là Người Dùng Thông Minh")
    private String typeOfService;
    @Min(value = 500000,message = "Đơn giá phải lớn hơn 5 xị")
    @NotNull
    private Double price;
    @NotNull
    private double area;
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public TransactionDto() {
    }

    public TransactionDto(Long id, String codeTransaction, String dateTransaction, String typeOfService, double price, double area) {
        this.id = id;
        this.codeTransaction = codeTransaction;
        this.dateTransaction = dateTransaction;
        this.typeOfService = typeOfService;
        this.price = price;
        this.area = area;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeTransaction() {
        return codeTransaction;
    }

    public void setCodeTransaction(String codeTransaction) {
        this.codeTransaction = codeTransaction;
    }

    public String getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(String dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
      TransactionDto transactionDto = (TransactionDto) target;
      String date = transactionDto.dateTransaction;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date transactionDate = simpleDateFormat.parse(date);
            Date currentDate = new Date(System.currentTimeMillis());
            long dateSecond = transactionDate.getTime() - currentDate.getTime();
            if (dateSecond < (-24*60*60*1000)){
                errors.rejectValue("dateTransaction","","Ngày Phải Lớn Hơn Ngày Hiện Tại");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
