import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';
import{ActivatedRoute} from '@angular/router'

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
  public products:any;
  public catId;
  public subcategory;

  constructor(private dataService:DataService , private route:ActivatedRoute) {
    
    this.catId=this.route.snapshot.paramMap.get('id');
  }

  ngOnInit(): void {
    this.dataService.getProduct().subscribe(
      d=>this.products=d.data
    )
  }
  addtoCart(product){

    if(localStorage.Basket == undefined){
    const cartItems =[];
    cartItems.push(product)
    localStorage.Basket = JSON.stringify(cartItems)
    }
    else{const products =JSON.parse(localStorage.Basket);
          products.push(product);
          localStorage.Basket=JSON.stringify(products);
    }
  }

  




  }


