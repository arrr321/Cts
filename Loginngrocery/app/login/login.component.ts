import { Component, OnInit } from '@angular/core';
import{FormBuilder,FormGroup,Validator, Validators} from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {


  public userForm: FormGroup;

  constructor( private builder:FormBuilder) { }

  ngOnInit(): void {
    this.createForm()
  }

  createForm(){

    this.userForm = this.builder.group({

      'email':[null , Validators.required],
      'password':[null , [Validators.required , Validators.minLength(8), Validators.maxLength(15)]]
});
  }

  onSubmit(data){
    console.log(data)
  }
  
 
}
