import { Injectable } from '@angular/core';
import { Product } from './product';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  private url = 'http://localhost:8080/products';

  constructor(private http: HttpClient) { }
  getProducts(search: string): Observable<Product[]>{
    return this.http.get<Product[]>(this.url + "/?search=" + search);
  }
}
