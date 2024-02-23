package com.prodigios.planilla.planilla.serviceimp;


import java.util.List;

import org.springframework.stereotype.Service;

import com.prodigios.planilla.planilla.dto.Empleado;
import com.prodigios.planilla.planilla.services.ProcesadorPlanillas;
import com.prodigios.planilla.planilla.services.ProveedorMiembrosPlanilla;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Margie Orellano
 */
@Service
public class ProcesadorPlanillasImp implements ProcesadorPlanillas{
 
    @Autowired
    private ProveedorMiembrosPlanilla proveedorMiembrosPlanilla;
    @Override
    public float obtenerMontoTotalPlanilla() {
        List<Empleado> empleados = proveedorMiembrosPlanilla.obtenerEmpleados();
        float montoTotal = 0;
        for (Empleado empleado : empleados) {
            if (empleado.isActivo()) {
                if (empleado.getMontoMensual() > 0) {
                    montoTotal += empleado.getMontoMensual();
                }
                
            }
        }
        System.out.println("Monto total "+montoTotal);
        return montoTotal;
    }
}
