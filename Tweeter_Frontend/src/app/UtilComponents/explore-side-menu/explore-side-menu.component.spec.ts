import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ExploreSideMenuComponent } from './explore-side-menu.component';

describe('ExploreSideMenuComponent', () => {
  let component: ExploreSideMenuComponent;
  let fixture: ComponentFixture<ExploreSideMenuComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ExploreSideMenuComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ExploreSideMenuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
