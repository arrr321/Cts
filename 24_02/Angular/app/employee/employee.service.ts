import { Injectable } from '@angular/core';
import {HttpClient , HttpHeaders } from '@angular/common/http';
import{FormsModule} from '@angular/forms'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private baseUrl = "http://localhost:3333/api/v1/employeedb"

  constructor(private http: HttpClient) { }


  getEmployees(): Observable<any>{
    return this.http.get<any>(this.baseUrl)

  }
  createEmployee(){

  }
  updateEmployee(){

  }
  deletEmployee(){


  }
}
