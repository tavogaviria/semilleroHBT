import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CreacionPersonasComponent } from './nucleo/capa/main/creacion-personas/creacion-personas.component'
const routes: Routes = [
	{
	    path: 'personas-crear',
	    component: CreacionPersonasComponent
  	},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }