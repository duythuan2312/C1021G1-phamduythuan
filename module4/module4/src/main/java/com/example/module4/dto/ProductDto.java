package com.example.module4.dto;

import com.example.module4.model.ProductType;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class ProductDto implements Validator {

    private Long id;
    @Size(min = 5,max = 50,message = "Tên sản phẩm phải là 5 đến 50 ký tự")
    private String nameProduct;
    @Min(value = 100000,message = "Giá phải bắt đầu từ 100000")
    private Double price;
    @NotBlank(message = "Không được để trống")
    private String status;
    private ProductType productType;


    public ProductDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        ProductDto productDto = (ProductDto) target;
        if ("".equals(productDto.getNameProduct())){
            errors.rejectValue("nameProduct","","Không được để trống VD:Iphone14");
        }
        if ("".equals(productDto.getPrice())){
            errors.rejectValue("price","","Không được để trống VD:1000000");
        }
    }
}
