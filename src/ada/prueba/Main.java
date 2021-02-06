package ada.prueba;

import java.util.ArrayList;
import java.util.List;

/*
Datos de color:
Math.round(montoTotal); // redondea al número entero más cercano
Math.ceil(montoTotal); // redondea para arriba
Math.floor(montoTotal); // redondea para abajo
          15.3 ->
round 15
ceil 16
floor 15
          8.7
round 9
ceil 9
floor 8
 */
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

        //---------------------++++++ NUEVA FACTURA ++++++-------------------------------

        Factura b = new Factura();

        Item j= new Item(1, "aguila mini torta", 2, 90.0);
        Item k= new Item(2, "jorgelin blanco", 2, 80.0);
        Item l= new Item(3, "oreo triple", 2, 95.0);
        Item m= new Item(1, "cofler block", 3, 100.0);

        b.agregarItem(j);
        b.agregarItem(k);
        b.agregarItem(l);
        b.agregarItem(m);

        facturas.add(b);

        b.setDescuento(0.0);
        System.out.println("El total de la 2da factura es: $"+b.consultarMontoFinal());

        Double montoTotalVendido= 0.0;
        for (Factura factura: facturas) { // para cada factura en facturas
            Double montoFactura= factura.consultarMontoFinal();
            montoTotalVendido = montoTotalVendido + montoFactura; // 0 + lo que haya en montofactura
            System.out.println("Factura en $" +montoFactura);  // imprime en pantalla cada factura a medida que reinicia el for
        }
        System.out.println("El total vendido es $"+montoTotalVendido); // suma de totales


    }
}
