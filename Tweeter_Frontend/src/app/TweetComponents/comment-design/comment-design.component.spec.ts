import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CommentDesignComponent } from './comment-design.component';

describe('CommentDesignComponent', () => {
  let component: CommentDesignComponent;
  let fixture: ComponentFixture<CommentDesignComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CommentDesignComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CommentDesignComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
