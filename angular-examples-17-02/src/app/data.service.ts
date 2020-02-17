import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor() { }

  getEmployees(){

    return[
    {"eid":1 ,"ename":"bachy","esalary":100000,"egender":"M" },
    {"eid":2 ,"ename":"bachy1","esalary":1000,"egender":"M"  },
    {"eid":3 ,"ename":"bachy2","esalary":100,"egender":"F"  },
    {"eid":34,"ename":"bach2","esalary":105630,"egender":"M"  }
    ]
  }
}
