package ada.prueba;

public class Item {
    private Integer nro;
    private String detalle;
    private Integer cantidad;
    private Double precioUnit;
    private Double precioSub;

    public Item(Integer nro, String detalle, Integer cantidad, Double precioUnit) {
        this.nro = nro;
        this.detalle = detalle;
        this.cantidad = cantidad;
        this.precioUnit = precioUnit;
    } // no detallo nada mas, porque el resto conviene llevarlo a un metodo

    public Integer getNro() {
        return nro;
    }

    public void setNro(Integer nro) {
        this.nro = nro;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioUnit() {
        return precioUnit;
    }

    public void setPrecioUnit(Double precioUnit) {
        this.precioUnit = precioUnit;
    }

    public Double getPrecioSub() {
        return cantidad*precioUnit;
    }

   }
