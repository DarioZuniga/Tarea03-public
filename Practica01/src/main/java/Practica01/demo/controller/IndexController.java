package Practica01.demo.controller;

import Practica01.demo.domain.Estado;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import Practica01.demo.domain.Cliente;
import Practica01.demo.services.ClienteService;

@Controller
@Slf4j
public class IndexController {
    
    //Se crea en tiempo de ejecución si aún no se ha creado...
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora SI usa arquitectura MVC");
        var clientes = clienteService.getClientes();
        model.addAttribute("clientes",clientes);
        return "index";
    }
    
   
     @GetMapping("/nuevoCliente");
    public String nuevoCliente(Cliente cliente){
        return "modificarCliente";
    }
     @PostMapping("/guardarCliente");
     public String guardarCliente(Cliente cliente){
         clienteService.save(cliente);
         return "redirect:/";
     }
     
     @GetMapping("/modificarCliente/{idCliente}")
     public String modificarCliente(Cliente cliente, Model model){
         cliente = clienteService.getCliente(cliente);
         model.addAttribute("cliente",cliente);
         return "modificarCliente";
     }
     @GetMapping("/eliminarCliente/{idCliente")
     public String eliminarCliente(Cliente cliente){
     clienteService.delete(cliente);
     return "redirect:/";
     }
     
}
