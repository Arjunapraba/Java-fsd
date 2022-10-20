import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AfterduplicateComponent } from './afterduplicate.component';

describe('AfterduplicateComponent', () => {
  let component: AfterduplicateComponent;
  let fixture: ComponentFixture<AfterduplicateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AfterduplicateComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AfterduplicateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
