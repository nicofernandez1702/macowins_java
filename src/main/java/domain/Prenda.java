package domain;

public class Prenda {
  private int valorBase;
  private Estado estado;
  private String tipo;

  public Prenda(String tipo,Estado estado,int valor){
    this.estado = estado;
    this.tipo = tipo;
    this.valorBase=valor;
  }

  public String getTipo() {
    return tipo;
  }

  public double precio(){
    return this.valorBase * estado.precioPorEstado(this.valorBase);
  }


}
