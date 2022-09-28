import { HardcodedauthenticationserviceService } from './hardcodedauthenticationservice.service';
import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, RouterStateSnapshot,Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class RouteguardService implements CanActivate {

  constructor(private hardcodedauthenticationserviceService: HardcodedauthenticationserviceService,private router:Router) { }
  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot) {
    if(this.hardcodedauthenticationserviceService.isLoggedIn())
      return true;
    this.router.navigate(['error']);  
    return false;
    }
}
