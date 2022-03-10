package com.example.exercise.validate;

import com.example.exercise.model.Customer;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Component
public class BookSavingsDto implements Validator {
   @NotBlank
   @Size(min = 5,max = 45)
    private String nameCustomer;
   @NotBlank
    private String date;
   @NotBlank
    private String period;
    private double depositBook;


    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public double getDepositBook() {
        return depositBook;
    }

    public void setDepositBook(double depositBook) {
        this.depositBook = depositBook;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
     BookSavingsDto bookSavingsDto = (BookSavingsDto) target;
     if ("".equals(bookSavingsDto.nameCustomer)){
         errors.rejectValue("nameCustomer","","Hãy là người dùng thông minh ");
     }
    }
}
