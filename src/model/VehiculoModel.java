package model;

public class VehiculoModel {

    int id_vehiculo;
    String tipo_vehiculo;
    String propietario;
    String fecha_de_adquisicion;
    String color;
    String marca;

    public VehiculoModel(){}

    public VehiculoModel(int id_vehiculo, String tipo_vehiculo, String propietario, String fecha_de_adquisicion, String color, String marca) {
        this.id_vehiculo = id_vehiculo;
        this.tipo_vehiculo = tipo_vehiculo;
        this.propietario = propietario;
        this.fecha_de_adquisicion = fecha_de_adquisicion;
        this.color = color;
        this.marca = marca;
    }

    public int getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(int id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public String getPropietario() {
        return propietario;
    }

    public String getFecha_de_adquisicion() {
        return fecha_de_adquisicion;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public void setTipo_vehiculo(String tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void setFecha_de_adquisicion(String fecha_de_adquisicion) {
        this.fecha_de_adquisicion = fecha_de_adquisicion;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
