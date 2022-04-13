import { Component, OnInit } from '@angular/core';
import {Todo} from "../todo";
import {FormControl} from "@angular/forms";
import {TodoserviceService} from "../service/todoservice.service";
let _id = 1;
@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.css']
})
export class TodoComponent implements OnInit {
 todos: Todo[];
 content = new FormControl();
  private _id: number;
  idCustomer: number;


  constructor(private todoserviceService: TodoserviceService) { }

  ngOnInit(): void {
    this.getAll();
  }

  toggleTodo(i: number) {
    this.todos[i].complete = !this.todos[i].complete;
  }

  change() {
    const value = this.content.value;
    if (value) {
      const todo: Todo = {
        id: this._id++,
        content: value,
        complete: false
      };
      this.todos.push(todo);
      this.content.reset();
    }
  }

  getAll(){
    this.todoserviceService.getAll().subscribe(value => {
      this.todos = value;
    })
  }

  delete(idCustomer){
    this.todoserviceService.delete(this.idCustomer).subscribe(value => {
      this.ngOnInit();
    })

  }
}
