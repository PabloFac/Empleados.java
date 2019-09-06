/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application;

/**
 *
 * @author Técnica 2
 */
public class Empleado {
    
    // Nombre
    private String nombre = "Empleado";
    public String getNombre(){
        return this.nombre;
    }    
    public void setNombre(String value){
        this.nombre = value;
    }
        
    // Sueldo
    private Double sueldo = 0.0;    
    public Double getSueldo() {
        return sueldo;
    }
    public void setSueldo(Double Sueldo) {
        this.sueldo = Sueldo;
    }
    
    // Premio %
    private Double porcentajePremio = 0.0;    
    public Double getPorcentajePremio() {
        return porcentajePremio;
    }
    public void setPorcentajePremio(Double Premio) {
        this.porcentajePremio = Premio;
    }
        
    // Salario por familiar
    private Double salario = 0.0;
    public Double getSalarioPorFamiliar() {
        return salario;
    }
    public void setSalarioPorFamiliar(Double SalarioPorFamiliar) {
        this.salario = SalarioPorFamiliar;
    }
    
    // Premio
    public Double getPremio(){
        return ((this.getPorcentajePremio() * this.getSueldo()) / 100);
    }
    
    
    // Descuento
    public Double getDescuento(){
        return ((this.getSueldo() + this.getPremio()) * 0.2);
    }
    
    // Total a cobrar
    public Double getTotalACobrar(){
        return ((this.getSueldo() + this.getPremio() + this.getSalarioPorFamiliar()) - this.getDescuento());
    }


   
    
}
