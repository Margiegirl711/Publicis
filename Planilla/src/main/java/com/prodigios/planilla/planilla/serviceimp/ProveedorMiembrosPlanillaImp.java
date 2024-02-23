package com.prodigios.planilla.planilla.serviceimp;

import java.util.ArrayList;
import java.util.List;

import com.prodigios.planilla.planilla.dto.Empleado;
import com.prodigios.planilla.planilla.services.ProveedorMiembrosPlanilla;
import com.prodigios.planilla.planilla.services.ValidateEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Margie Orellano
 */
@Service
public class ProveedorMiembrosPlanillaImp implements ProveedorMiembrosPlanilla{
    @Autowired
    private ValidateEmpleado validateEmpleado;
    @Override
    public List<Empleado> obtenerEmpleados() {
        // Aquí se simula la obtención de empleados de alguna fuente externa
        // En una implementación real, esta lista se obtendría de una base de datos, servicio web, etc.
        List<Empleado> empleados = new ArrayList<>();
        if(validateEmpleado.newEmpleado(1, "Empleado1", 1000.0f, true)){
            empleados.add(new Empleado(1, "Empleado1", 1000.0f, true));
        }
            
    
        if(validateEmpleado.newEmpleado(2, "Empleado2", -500.0f, true)){
            empleados.add(new Empleado(2, "Empleado2", -500.0f, true));
        }
            
        if(validateEmpleado.newEmpleado(3, "Empleado3", 700.0f, false)){
            empleados.add(new Empleado(3, "Empleado3", 700.0f, false));
        }
           
        
        if(validateEmpleado.newEmpleado(4, "", 700.0f, true)){
            empleados.add(new Empleado(4, "", 700.0f, true));
        }
        
        if(validateEmpleado.newEmpleado(5, "Empleado5", 700.0f, true)){
            empleados.add(new Empleado(5, "Empleado5", 700.0f, true));
        }
    
        return empleados;    }
}
