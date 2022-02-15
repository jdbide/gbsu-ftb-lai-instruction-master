import { Component, EventEmitter, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-gbsu-ftb-lai-form',
  templateUrl: './gbsu-ftb-lai-form.component.html'
})
export class GbsuFtbLaiFormComponent implements OnInit {

  @Output() submitNumberOutput = new EventEmitter<String>();


  inputNumber : string;

  constructor() {
  }

  ngOnInit(): void {
  }

  submitNumber(): void {


    if(this.isNumber(this.inputNumber)){
      this.submitNumberOutput.emit(this.inputNumber);
    } else {
      alert(this.inputNumber + " is not a number ! ");
    }
    this.inputNumber = "";
  
}

 isNumber(value: string | number): boolean
{
   return ((value != null) &&
           (value !== '') &&
           !isNaN(Number(value.toString())));
}

}


