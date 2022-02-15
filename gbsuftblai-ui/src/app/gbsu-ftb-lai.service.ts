import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class GbsuFtbLaiService {


  private REST_API_SERVER = "http://localhost:8080/gbsu-ftb-lai/";

  constructor(private httpClient: HttpClient) { }

  public convertir(inputNumber:string) : any {
    return this.httpClient.get(this.REST_API_SERVER + encodeURIComponent(inputNumber));
  }

}
