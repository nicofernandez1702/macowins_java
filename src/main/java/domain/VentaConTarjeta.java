package domain;

import java.util.List;

public class VentaConTarjeta extends Venta{
  private int coeficiente;
  private int cuotas;

  public VentaConTarjeta(int fecha,int coef,int cuotas){
    super(fecha);
    this.coeficiente = coef;
    this.cuotas = cuotas;
  }

  @Override
  public double precioVenta() {
    return super.precioVenta() + this.recargo(this.prendas);
  }

  public double recargo(List<Prenda> p){
    return cuotas * coeficiente * p.stream().mapToDouble(pr->pr.precio()*0.1).sum();
  }
}
