import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {ProductService} from '../../service/product.service';
import {CategoryService} from "../../service/category.service";
import {Category} from "../../model/category";
import {Product} from "../../model/product";
import {Router} from "@angular/router";

@Component({
  selector: 'app-product-create',
  templateUrl: './product-create.component.html',
  styleUrls: ['./product-create.component.css']
})
export class ProductCreateComponent implements OnInit {
  productForm: FormGroup;
  categoriesList: Category[];
  newProduct: Product;

  constructor(private productService: ProductService,
              private categoryService: CategoryService,
              private router: Router) {
  }

  ngOnInit() {
    this.getAll();
    this.productForm = new FormGroup({
      id: new FormControl('',Validators.required),
      name: new FormControl('',Validators.required),
      price: new FormControl('',Validators.required),
      category: new FormControl('',Validators.required),
      description: new FormControl('',Validators.required),
    });
  }


  getAll() {
    return this.categoryService.getAll().subscribe(value => {
      this.categoriesList = value;
    })
  }


  submit() {
    const product = this.productForm.value;
    this.productService.addProduct(product).subscribe(value => {
      console.log(product);
    });
    this.productForm.reset();
    this.router.navigateByUrl("/product/list")
  }
}
