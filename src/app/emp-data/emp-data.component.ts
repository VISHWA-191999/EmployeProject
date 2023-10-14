import { Component } from '@angular/core';
import { EmpServiceService } from '../emp-service.service';

@Component({
  selector: 'app-emp-data',
  templateUrl: './emp-data.component.html',
  styleUrls: ['./emp-data.component.css']
})
export class EmpDataComponent {

  eName:string='';
  email:string='';
  phNo:string='';
  dob:string='';
  doj:string='';

   
  

  constructor(private empDataService:EmpServiceService)
  {

  }

  // postDatas={

  //   "name":this.eName,
  //   "email":this.email,
  //   "dob":this.dob,
  //   "doj":this.doj,
  //    "phoneNo":this.phNo
  // }



  datasubmit()
  {
   
    let postData={

      "name":this.eName,
      "email":this.email,
      "dob":this.dob,
      "doj":this.doj,
       "phoneNo":this.phNo

      // "phoneNo":parseInt(this.phNo,10)


    };

    // const jsonObject=JSON.parse(postData)
   // contact=JSON.parseInt(this.phNo,10);

    this.empDataService.postRequest("/emp/addEmpData",postData).subscribe((data:any)=>
    {
      alert("Data added");
    } )

  }


}
