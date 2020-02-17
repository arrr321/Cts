import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {


  public employees1=[];

  constructor(private dataService:DataService) { }

  ngOnInit(): void {
    this.employees1= this.dataService.getEmployees();
  }

}
