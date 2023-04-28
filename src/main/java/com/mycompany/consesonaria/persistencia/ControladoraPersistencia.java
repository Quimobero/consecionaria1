package com.mycompany.consesonaria.persistencia;

import com.mycompany.consesonaria.logica.automovil;
import com.mycompany.consesonaria.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    automovilJpaController autojpa = new automovilJpaController();

    public void agregarautomovil(automovil Auto) {
       autojpa.create(Auto);
    }

    public List<automovil> traerAutos() {
        return autojpa.findautomovilEntities();
    }

    public void borrarAuto(int IdAuto) {
        try {
            autojpa.destroy(IdAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
