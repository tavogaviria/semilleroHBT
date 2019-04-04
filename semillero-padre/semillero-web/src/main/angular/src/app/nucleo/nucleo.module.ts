import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { EncabezadoComponent } from './capa/encabezado/encabezado.component';
import { MainComponent } from './capa/main/main.component';
import { PiepaginaComponent } from './capa/piepagina/piepagina.component';
import { CapaComponent } from './capa/capa.component';
import { CreacionPersonasComponent } from './main/creacion-personas/creacion-personas.component';

@NgModule({
  declarations: [EncabezadoComponent, MainComponent, PiepaginaComponent, CapaComponent, CreacionPersonasComponent],
  imports: [
    CommonModule
  ],
  exports: [CapaComponent]
})
export class NucleoModule { }
