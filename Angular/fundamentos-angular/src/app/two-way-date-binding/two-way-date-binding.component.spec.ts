import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TwoWayDateBindingComponent } from './two-way-date-binding.component';

describe('TwoWayDateBindingComponent', () => {
  let component: TwoWayDateBindingComponent;
  let fixture: ComponentFixture<TwoWayDateBindingComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TwoWayDateBindingComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TwoWayDateBindingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
