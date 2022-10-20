import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AftercancelComponent } from './aftercancel.component';

describe('AftercancelComponent', () => {
  let component: AftercancelComponent;
  let fixture: ComponentFixture<AftercancelComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AftercancelComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AftercancelComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
