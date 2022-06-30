
package Practica01.demo.services;

import Practica01.demo.domain.Cliente;

import java.util.List;


public interface ClienteService {
    
    public List<Cliente> getClientes();
    public void save(Cliente cliente);
    public void delete( Cliente cliente);

    /**
     *
     * @param cliente
     * @return
     */
    public Cliente getCliente(Cliente cliente);
}
