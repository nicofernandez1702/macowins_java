package domain;

public class Promocion implements Estado{

  private int valorPromocional;

  public Promocion(int valorProm){

    this.valorPromocional = valorProm;
  }

  public double precioPorEstado(int valorBase){
    return valorBase -  this.valorPromocional ;

  }


}
