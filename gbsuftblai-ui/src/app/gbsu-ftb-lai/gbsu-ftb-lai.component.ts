import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { GbsuFtbLaiService } from '../gbsu-ftb-lai.service';
import { Result } from '../model/result';

@Component({
  selector: 'app-gbsu-ftb-lai',
  templateUrl: './gbsu-ftb-lai.component.html'
})
export class GbsuFtbLaiComponent implements OnInit, OnDestroy {

  oldResArray: Array<NumberConverted> = []

  constructor(private gbsuFtbLaiService: GbsuFtbLaiService) { }

  ngOnInit(): void {
  }

  ngOnDestroy(): void {
  }

  convertNumber(inputNumber: number): void {
    this.gbsuFtbLaiService.convertir(inputNumber.toString()).subscribe((res: Result)=>{
      this.oldResArray.push({numberToConvert:inputNumber,result: res.result});
      
  });
  }

}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}
  