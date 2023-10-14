import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClient } from '@angular/common/http';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmpInfoComponent } from './emp-info/emp-info.component';
import { FormsModule } from '@angular/forms';

import{HttpClientModule} from '@angular/common/http';
import { EmpDataComponent } from './emp-data/emp-data.component';

@NgModule({
  declarations: [
    AppComponent,
    EmpInfoComponent,
    EmpDataComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
