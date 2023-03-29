import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ComposetweetComponent } from './composetweet.component';

describe('ComposetweetComponent', () => {
  let component: ComposetweetComponent;
  let fixture: ComponentFixture<ComposetweetComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ComposetweetComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ComposetweetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
