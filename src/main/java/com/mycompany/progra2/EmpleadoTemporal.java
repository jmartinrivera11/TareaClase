/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progra2;

import java.util.Calendar;

/**
 *
 * @author danie
 */
public class EmpleadoTemporal extends EmpleadoComun{
    
    private Calendar finContrato;
    
    public EmpleadoTemporal(int code, String name) {
        super(code, name, 15000);
        this.finContrato = Calendar.getInstance();
    }
    
    public void setFinContrato(int año, int mes, int dia) {
        this.finContrato.set(año, mes, dia);
    }
    
    @Override
    public double pagar() {
        Calendar hoy = Calendar.getInstance();
        if(hoy.before(finContrato))
            return super.pagar();
        return 0;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Fin Contrato: " + finContrato.getTime();
    }
}
