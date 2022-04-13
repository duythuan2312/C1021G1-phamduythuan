import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {CategoryService} from '../../service/category.service';
import {Category} from "../../model/category";
import {Router} from "@angular/router";

@Component({
  selector: 'app-category-create',
  templateUrl: './category-create.component.html',
  styleUrls: ['./category-create.component.css']
})
export class CategoryCreateComponent implements OnInit {
  categoryForm: FormGroup = new FormGroup({
    id: new FormControl(),
    name: new FormControl(),
  });
  categoryList: Category[];
  constructor(private categoryService: CategoryService,private router: Router) {
  }

  ngOnInit() {
    this.getAll();
  }
  getAll(){
    this.categoryService.getAll().subscribe(value => {
      this.categoryList = value;
    })
  }

  submit() {
    const category = this.categoryForm.value;
    this.categoryService.saveCategory(category).subscribe(()=>{
      this.categoryForm.reset();
      this.ngOnInit();
      this.router.navigateByUrl('/')
    },error => {
      console.log(error)
    });

  }

}
