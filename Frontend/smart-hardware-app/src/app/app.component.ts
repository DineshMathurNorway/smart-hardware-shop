import { Component } from '@angular/core';
import { observable, Observable } from 'rxjs';
import { Product } from './product';
import { ProductService } from './product.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Smart hardware shop';

  public products$: Observable<Product[]> | undefined;
  public checkoutList: Product[] = new Array<Product>();

  constructor(private productService: ProductService) {
  }

  addProduct(product: Product) {
    this.checkoutList.push(product);
  }
  removeProduct(index: number) {
    this.checkoutList.splice(index, 1);
  }
  removeAll() {
    this.checkoutList = [];
  }
  searchTextChanged(event: any){
    this.products$ = this.productService.getProducts(event.target.value);
  }

  ngOnInit() {
    this.products$ = this.productService.getProducts("");
  }
}
