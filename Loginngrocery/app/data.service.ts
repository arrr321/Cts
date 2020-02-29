import { Injectable } from '@angular/core';
import{HttpClient} from'@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DataService {
  private _cat_Url="category";
 private baseurl="http://apolis-grocery.herokuapp.com/api/";
 private suburl="subcategory/1"
 private proUrl="products/id"

  constructor( private http:HttpClient) { }

  getCat(): Observable<any>{
    return this.http.get<any>(`${this.baseurl + this._cat_Url}`)

  }
  getSubCat(): Observable<any>{
    return this.http.get<any>(`${this.baseurl + this.suburl}`)

  }
  getProduct(): Observable<any>{
    return this.http.get<any>(`${this.baseurl + this.proUrl}`)
  }
}