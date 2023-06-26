import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { KoComponent } from './ko/ko.component';


const routes: Routes = [
  {path: 'ko', component: KoComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
