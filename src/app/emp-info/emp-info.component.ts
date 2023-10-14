// import { HttpClient, HttpClientModule, HttpHeaders } from '@angular/common/http';
import { Component } from '@angular/core';
import { EmpServiceService } from '../emp-service.service';

@Component({
  selector: 'app-emp-info',
  templateUrl: './emp-info.component.html',
  styleUrls: ['./emp-info.component.css']
})
export class EmpInfoComponent {

  empName:string='';
  designation:string='';
  dept:string='';
  salary:string='';

  url:any='/emp/addEmployee';

  constructor(private empservice:EmpServiceService)
  {

  }

  display()
  {
    console.log(this.empName)
  }

  // header:any=new HttpHeaders({
  //   'Content-Type': 'application/json'
  // })

  // register()
  // {

  //   let postUser={

  //     "empName":this.empName,
  //     "salary":this.salary,
  //     "designation":this.designation,
  //     "deptName":this.dept
  //   };

  //   this.http.post("http://localhost:8080/emp/addEmployee",postUser,this.header).subscribe((data:any)=>{

  //   alert("done")
  //   })

  
   
    

      onSubmit()
{

 let postUser={

    'empName':this.empName,
    
     "salary":this.salary,
   "designation":this.designation,
    "deptName":this.dept
  };
  this.empservice.postRequest(this.url,postUser).subscribe((_data:any)=>{

    alert("done");
    });


}
}
