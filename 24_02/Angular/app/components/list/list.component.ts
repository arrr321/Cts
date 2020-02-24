import { Component, OnInit } from '@angular/core';
import { EmployeeService } from 'src/app/employee/employee.service';


@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  employees:any;

 

  constructor(private empService : EmployeeService) { }

  ngOnInit(): void {
  this.empService.getEmployees.
  
  }

}
