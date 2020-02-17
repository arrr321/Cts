import { Component, OnInit, Input, Output , EventEmitter} from '@angular/core';


@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  @Output()
  public ChildEvent = new EventEmitter();

  OnButtonClicked(){

    this.ChildEvent.emit("Data from child");
  }


  @Input()
  parentD;
  @Input()
  first;
  @Input()
  last;
  @Input()
  obj;

  constructor() { }

  ngOnInit(): void {
  }

}
