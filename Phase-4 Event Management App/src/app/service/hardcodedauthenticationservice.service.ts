import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class HardcodedauthenticationserviceService {

  constructor() { }

  authenticate(username:string,password:string){
    if(username==='Arjun' && password==='xyz123')
    {
      sessionStorage.setItem('authenticateuser',username)
      return true;
    }
    return false;
  }

  isLoggedIn(){
    let user= sessionStorage.getItem('authenticateuser');
    return !(user==null);
  }

  logout(){
    sessionStorage.removeItem('authenticateuser');
  }
}
