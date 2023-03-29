import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TweetDesignComponent } from './tweet-design.component';

describe('TweetDesignComponent', () => {
  let component: TweetDesignComponent;
  let fixture: ComponentFixture<TweetDesignComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TweetDesignComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TweetDesignComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
