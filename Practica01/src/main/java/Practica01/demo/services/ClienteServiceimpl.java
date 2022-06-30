
package Practica01.demo.services;

import Practica01.demo.dao.ClienteDao;

import Practica01.demo.domain.Cliente;

import java.util.List;
import jdk.jfr.TransitionTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteServiceimpl implements ClienteService{

    @Autowired
    private ClienteDao clienteDao;
    
    /**
     *
     * @return
     */
    @Override
    @Transitional(readOnly=true)
    
    public List<Cliente> getClientes() {
        return(List<Cliente>)clienteDao.findAll();
    }
 @Override
    @Transactional
    public void save(Cliente cliente) {
        clienteDao.save(cliente);
        
    }
 @Override
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);

    }
@Transitional(readOnly=true)

 @Override
    public Cliente getCliente(Cliente cliente) {
        return Cliente.findById(cliente.getCodigoPostal()).orElse(null);
    }
    
    
    
}
