
package Practica01.demo.services;

import Practica01.demo.domain.Datos;

import java.util.List;


public interface DatosService {
    
    public List<Datos> getDatos();
    public void save(Datos dato);
    public void delete( Datos dato);

    /**
     *
     * @param cliente
     * @return
     */
    public Datos getDatos(Datos dato);
}
