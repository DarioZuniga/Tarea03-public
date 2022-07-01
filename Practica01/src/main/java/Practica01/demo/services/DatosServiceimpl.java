
package Practica01.demo.services;


import Practica01.demo.domain.Datos;

import java.util.List;
import jdk.jfr.TransitionTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import Practica01.demo.dao.DatosDao;












@Service
public class DatosServiceimpl implements DatosService{

    @Autowired
    private DatosDao clienteDao;
    
    /**
     *
     * @return
     */
    @Override
    @Transitional(readOnly =true)
    
//    public List<Cliente> getClientes() {
//        return(List<Cliente>)clienteDao.findAll();
//    
    
    
    public List<Datos> getClientes() {
        return(List<Datos>)clienteDao.findAll();
    }
 @Override
    @Transactional
    public void save(Datos dato) {
        clienteDao.save(dato);
        
    }
 @Override
    public void delete(Datos dato) {
        clienteDao.delete(dato);

    }
@Transitional(readOnly=true)





 @Override
    public Datos getCliente(Datos dato) {
        return Datos.findById(dato.getCodigoPostal()).orElse(null);
    }
    
    
    
}
