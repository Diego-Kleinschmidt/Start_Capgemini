import { Component, OnInit } from '@angular/core';
import { Celular } from '../types/Celular';


@Component({
  selector: 'app-renderizando-lista',
  templateUrl: './renderizando-lista.component.html',
  styleUrls: ['./renderizando-lista.component.css']
})
export class RenderizandoListaComponent  {
  celulares: Celular[] = [
    {id: 1, nome: "Celular XL", descricao: "Um celular grande", esgotado: false},
    {id: 2, nome: "Celular Normal", esgotado: false},
    {id: 3, nome: "Celular mini", descricao: "Um celular pequeno", esgotado: true}

  ]

}
