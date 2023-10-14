import { HttpClient, HttpClientModule, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EmpServiceService {

  baseurl:any="http://localhost:8080";

  constructor(private http:HttpClient) { }

  // postUser(user:user)
  // {

  // }
header:any=new HttpHeaders(
  {
    'Content-Type': 'application/json'
  }

)

postRequest(url:string,param:{}){

  this.baseurl=this.baseurl+url;

  return this.http.post(this.baseurl,param,{ headers: this.header })

}

}
