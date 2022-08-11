package Vehiculos;

import java.sql.Timestamp;

public class Vehiculo {
    String tipo_vehiculo;
    String propietario;
    Timestamp fecha_de_adquisicion;
    String color;
    String marca;

    public Vehiculo(String tipo_vehiculo, String propietario, Timestamp fecha_de_adquisicion, String color, String marca) {
        this.tipo_vehiculo = tipo_vehiculo;
        this.propietario = propietario;
        this.fecha_de_adquisicion = fecha_de_adquisicion;
        this.color = color;
        this.marca = marca;
    }

    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public String getPropietario() {
        return propietario;
    }

    public Timestamp getFecha_de_adquisicion() {
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

    public void setFecha_de_adquisicion(Timestamp fecha_de_adquisicion) {
        this.fecha_de_adquisicion = fecha_de_adquisicion;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
