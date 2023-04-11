package domain;

public class Promocion implements Estado{

  private int valorPromocional;

  public Promocion(int valorProm){

    this.valorPromocional = valorProm;
  }

  public double precioPorEstado(int valorBase){
    return 1 - ( (double) this.valorPromocional / valorBase);

  }


}
