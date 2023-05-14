/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appopp;

/**
 *
 * @author javie
 */
public class Protein {

    String nombre;
    Double aminoacidos;
    Boolean carbohidratos;
    String sabor;

    public Protein() {
    }

    public Protein(String nombre, Double aminoacidos, Boolean carbohidratos, String sabor) {
        this.nombre = nombre;
        this.aminoacidos = aminoacidos;
        this.carbohidratos = carbohidratos;
        this.sabor = sabor;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getAminoacidos() {
        return aminoacidos;
    }

    public Boolean getCarbohidratos() {
        return carbohidratos;
    }

    public String getSabor() {
        return sabor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAminoacidos(Double aminoacidos) {
        this.aminoacidos = aminoacidos;
    }

    public void setCarbohidratos(Boolean carbohidratos) {
        this.carbohidratos = carbohidratos;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

}
