package com.mycompany.consesonaria.logica;

import com.mycompany.consesonaria.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlpesis = new ControladoraPersistencia();

    public void agregarautomovil(String modelo, String marca, String motor, String color, String patente, int cantPuerta) {
        
        automovil Auto = new automovil();
        Auto.setModelo(modelo);
        Auto.setMarca(marca);
        Auto.setMotor(motor);
        Auto.setColor(color);
        Auto.setPatente(patente);
        Auto.setCantPuerta(cantPuerta);
        
        controlpesis.agregarautomovil(Auto);
    }

    public List<automovil> traerautos() {
        
        return controlpesis.traerAutos();
        
    }

    public void borrarAuto(int IdAuto) {
        controlpesis.borrarAuto(IdAuto);
    }
    
    
}
