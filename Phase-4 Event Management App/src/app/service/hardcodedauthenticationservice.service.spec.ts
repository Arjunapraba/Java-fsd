import { TestBed } from '@angular/core/testing';

import { HardcodedauthenticationserviceService } from './hardcodedauthenticationservice.service';

describe('HardcodedauthenticationserviceService', () => {
  let service: HardcodedauthenticationserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(HardcodedauthenticationserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
