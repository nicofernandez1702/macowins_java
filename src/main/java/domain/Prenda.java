package domain;

import enums.TipoPrenda;

public class Prenda {
  private int valorBase;
  private Estado estado;
  private TipoPrenda tipo;

  public Prenda(TipoPrenda tipo,Estado estado,int valor){
    this.estado = estado;
    this.tipo = tipo;
    this.valorBase=valor;
  }

  public TipoPrenda getTipo() {
    return this.tipo;
  }

  public double precio(){
    return  estado.precioPorEstado(this.valorBase);
  }



}
