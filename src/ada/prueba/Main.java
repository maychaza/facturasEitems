package ada.prueba;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // se pide una lista de facturas
        List<Factura> facturas = new ArrayList<>();

        // construyo una nueva factura:
        Factura a = new Factura();

      //consultar lista de items
        List<Item> items= a.getItems();

        //detallo la informacion del producto *ya definida en el constructor*
        Item i = new Item(01,"pack de coca",10, 100.0);
        Item g = new Item(02,"papas lays",5, 50.0);
        Item e = new Item(03,"sorbetes",10, 25.0);


        //------ agrego esa informacion a la factura "a":-------
        a.agregarItem(i);
        a.agregarItem(g);
        a.agregarItem(e);

        // agrego factura a la lista
        facturas.add(a);

        // llamo al descuento y se lo paso por parametro
        a.setDescuento(0.05);

        //consulto el monto y lo muestro en pantalla

        System.out.println("el monto total es: $"+a.consultarMontoFinal());








    }
}
