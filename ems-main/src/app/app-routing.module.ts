import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateNewEmployeeComponent } from './create-new-employee/create-new-employee.component';

const routes: Routes = [{path:'create-new-employee',component:CreateNewEmployeeComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
