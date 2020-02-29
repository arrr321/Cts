import { Component, OnInit } from '@angular/core';
import {HttpClientModule} from '@angular/common/http'
import { DataService } from '../data.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  public cat: any;
  public subcat:any;
  public _img_url="http://rjtmobile.com/grocery/images/";
  public catagories=[];
  public catId;
 

  constructor(private dataService: DataService , private router:Router) { }

  ngOnInit(): void {


    this.dataService.getCat().subscribe(
      d=> this.cat=d.data
    )
    this.dataService.getSubCat().subscribe(
      d=> this.subcat=d.data
    )
    
    }

    onSelectCat(catagory){
      console.log(catagory.catId)
      this.router.navigate(['/products' , catagory.catId])
  }
  onSelectSubCategory(subId){

    console.log(subId);
    this.dataService.getProduct().subscribe(this.catId);


  }
}
