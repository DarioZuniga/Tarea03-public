package Practica01.demo.dao;

import Practica01.demo.domain.Datos;
import org.springframework.data.repository.CrudRepository;

public interface DatosDao extends CrudRepository<Datos, Long>{
    
}
