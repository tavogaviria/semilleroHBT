import { Component, OnInit } from '@angular/core';

import { personaDTO } from './modelo/personaDTO';

@Component({
  selector: 'app-apoyo',
  templateUrl: './apoyo.component.html'
})
export class ApoyoComponent implements OnInit {

  persona: personaDTO;

  public personas: personaDTO[];

  public mostrarFormulario: boolean;

  constructor() { }

  ngOnInit() {
    //inicializamos los datos de la persona para borrar lo que tenga en memoria
    this.persona = {
      id: '0',
      nombre: "",
      apellido: "",
      tipoIdentificacion: "",
      numeroIdentificacion: "",
      fechaNacimiento: "",
      mayorEdad: false,
      sexo: "",
      telefono: "",
      edad: 0,
      esComprador: false,
      esVendedor: false
    };

    this.personas = [];
    this.mostrarFormulario = true;

  }

  /**
   * funcion para mostrar el formulario de ingreso
   */
  public mostrar() {
    this.mostrarFormulario = true;
  }

  /**
   * funcion para ocultar el formulario de ingreso
   */
  public ocultar() {
    this.mostrarFormulario = false;
  }

  /**
   * guardar los datos de la persona en el arreglo
   */
  public guardar() {
    this.personas.push(this.persona);
    console.log('guardar()' + this.persona.nombre);
  }

  /**
   * borrar los datos de la persona en el arreglo
   */
  private borrar(persona) {
    this.personas.splice(persona);
    console.log('Eliminado' + this.persona.nombre);
  }

}
