import { Component, OnInit } from '@angular/core';
import {User} from '../models/user.model'


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  interests=[
    'grocery' , 'food'
  ];

  public userData = new User('joe' , 'doe@mail.com' ,'72937289','' ,'male' , true)

  constructor() { }

  ngOnInit(): void {

  }
  onFormSubmit(){
    console.log(this.userData);
  }

}
