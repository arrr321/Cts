import { Component } from '@angular/core';
import { DatePipe } from '@angular/common';

@Component({
  selector: 'app-root',
  
  templateUrl: './app.component.html'
,
  styles:[`
      .text-success{
        color:blue!important;
      }
      .text-danger{
        color:success;
      }
      .text-underline{
        text-decoration:underline;
      }
      .bg{
        background-color: red;
    }
`


  ]
  
})

export class AppComponent {

  public currentDate = new Date

  amt="Life of PIe"
  name2="Hello Man"
  firstName="Mark";
  lastName="Henry";

//   onButton(event){
// console.log("event.type")

//   }
//   title = 'Myproject';
//   name="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";
//   path="data:image/png;base64,"
//   isdis=false;
classSuccess="text-success"
hasError=false;
hasLine=true
day='Sun'
dayy=5
logging(num:Boolean): Boolean{
  return num;
}
names=["my", "name", "hello"]
name1="hello"
messg = {

  'text-success':this.hasError,
  'text-danger':this.hasError,
  'text-underline':this.hasLine
}
special=
{
  'color':'grey',
  'font-style':'italic'
}

employees=[];
constructor(){
this.employees=[
  { empId:'1' , empName: 'Abc' , empAge:'30'},
  { empId:'2' , empName: 'Abcd' , empAge:'40'},
  { empId:'3' , empName: 'Abcde' , empAge:'50'}

]
}
hey:any;
onButtonClick(hey){
  console.log(hey);



}
trackByEmpid(employee,index){
return employee.empId;
}

myName={
  firstName1:"Mark",
  lastName2:"Henry",
  email:"hey@mail.com"


}
printdata( value){
  console.log(value)
}

}
