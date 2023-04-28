package domain;

import java.util.ArrayList;
import java.util.List;

public class Local {

  private List<Venta> ventas = new ArrayList<>();

  public void vender(Venta venta){
    ventas.add(venta);
  }

  public double obtenerGanancias(int fecha){
    return ventas.stream().filter(v->v.getFecha() == fecha).mapToDouble(v->v.precioVenta()).sum();
  }
}

