import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  public employees1=[];

  constructor(private dataService:DataService) { }

  ngOnInit(): void {
   this.employees1= this.dataService.getEmployees()
  }

}
