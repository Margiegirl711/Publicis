/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prodigios.planilla.planilla.serviceimp;

import com.prodigios.planilla.planilla.services.ValidateEmpleado;
import static java.util.Objects.nonNull;
import org.springframework.stereotype.Service;

/**
 *
 * @author Margie Orellano
 */
@Service
public class ValidateEmpleadoImpl implements ValidateEmpleado {

    @Override
    public boolean newEmpleado(int id, String nombre, float montoMensual, boolean activo) {
        if((nonNull(id))&&(id >0)){
            
            if((nonNull(montoMensual)) && (montoMensual >0) ){
                
                if(nonNull(nombre)&& (nombre.length()>0)){
                    
                    return true;
                }else{
                    
                }System.out.println("Empleado "+id+" el nombre no puede ser vacio");
                return false;
            }else{
                System.out.println("Empleado "+id+" el monto mensual no puede ser menor que cero");
                return false;
            }
            
        }else{
            System.out.println("Empleado "+id+"no puede ser nulo");
            return false;
        }
    
    }
    
}
