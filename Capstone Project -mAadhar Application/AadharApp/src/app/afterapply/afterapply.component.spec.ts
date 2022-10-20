import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AfterapplyComponent } from './afterapply.component';

describe('AfterapplyComponent', () => {
  let component: AfterapplyComponent;
  let fixture: ComponentFixture<AfterapplyComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AfterapplyComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AfterapplyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
