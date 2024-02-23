package com.prodigios.planilla.planilla;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.prodigios.planilla.planilla.services.ProcesadorPlanillas;

@SpringBootTest
class PlanillaApplicationTests {

    @Autowired
    private ProcesadorPlanillas procesadorPlanillas;
    @Test 
    void obtenerMontoTotalPlanilla_EmpleadosActivos() {
       
        float montoTotal = procesadorPlanillas.obtenerMontoTotalPlanilla();

        assertEquals(1700.0f, montoTotal);
    }

 

}
