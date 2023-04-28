package domain;

import java.util.ArrayList;
import java.util.List;

public class Venta {

  private int fecha;
  List<Prenda> prendas =new ArrayList<>();


  public Venta(int fecha) {
    this.fecha = fecha;
  }

  public int getFecha(){
    return fecha;
  }

  public int cantPrendas(){
    return prendas.size();
  }

  public double precioVenta(){

    return prendas.stream().mapToDouble(p->p.precio()).sum();
  }


}
