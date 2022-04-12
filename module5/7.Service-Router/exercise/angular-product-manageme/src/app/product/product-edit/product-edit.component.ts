import {Component, OnInit} from '@angular/core';
import {ProductService} from '../../service/product.service';
import {Product} from '../../model/product';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-edit.component.html',
  styleUrls: ['./product-edit.component.css']
})
export class ProductEditComponent implements OnInit {
  products: Product[] = [];
  editForm: FormGroup;
  id: number;

  constructor(private productService: ProductService,private router: Router,private  activatedRoute: ActivatedRoute) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = +paramMap.get('id');
      const product = this.getProduct(this.id);
      this.editForm = new FormGroup({
        id: new FormControl(product.id),
        name: new FormControl(product.name),
        price: new FormControl(product.price),
        description: new FormControl(product.description),
      });
    });
  }

  ngOnInit() {

  }


  editProduct(id: number) {
    const productNew = this.editForm.value;
    this.productService.edit(id,productNew);
    this.router.navigateByUrl('');
  }

  private getProduct(id: number) {
    return this.productService.findById(id)
  }


}
