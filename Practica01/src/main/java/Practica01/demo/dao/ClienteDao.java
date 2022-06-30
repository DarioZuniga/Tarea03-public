package Practica01.demo.dao;

import Practica01.demo.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente, Long>{
    
}
