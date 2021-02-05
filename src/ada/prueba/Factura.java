package ada.prueba;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    private List<Item> items;
    private Double montoTotal;
    private Double descuento;

    public Factura() {
        items= new ArrayList<>();
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Double consultarMontoSinDto() {
        montoTotal= 00.0;
        for (Item i: items) {  //for each: para cada Item i en items, sumar todos los subtotales
            montoTotal = montoTotal + i.getPrecioSub();
        }
        return montoTotal;
    }

    public Double consultarMontoFinal() {
        montoTotal= consultarMontoSinDto(); //lo traigo del metodo de arriba
        montoTotal = montoTotal *1.21; // agrego el IVA
        if (descuento>0){ //valido que el dto no sea cero
            montoTotal= montoTotal - (montoTotal* descuento); //ej: total= 50 - (50-5)
        }
        return montoTotal;
    }

 // esto está acá xq le pido los items a la factura!!!!
    public void agregarItem(Item i) {
        items.add(i);


    }
}
