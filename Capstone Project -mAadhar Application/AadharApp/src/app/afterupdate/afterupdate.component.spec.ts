import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AfterupdateComponent } from './afterupdate.component';

describe('AfterupdateComponent', () => {
  let component: AfterupdateComponent;
  let fixture: ComponentFixture<AfterupdateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AfterupdateComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AfterupdateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
