package Practica01.demo.controller;


import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import Practica01.demo.domain.Datos;
import Practica01.demo.services.DatosService;

@Controller
@Slf4j
public class IndexController {
    
    //Se crea en tiempo de ejecución si aún no se ha creado...
    @Autowired
    private DatosService DatosService;

    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora SI usa arquitectura MVC");
        var clientes = DatosService.getDatos();
        model.addAttribute("dato",dato);
        return "index";
    }
    
   
     @GetMapping("/nuevoDato");
    public String nuevoCliente(Datos datos){
        return "modificarCliente";
    }
     @PostMapping("/guardarDato");
     public String guardarCliente(Datos datos){
         DatosService.save(datos);
         return "redirect:/";
     }
     
     @GetMapping("/modificarDato/{codigoPostal}")
     public String modificarCliente(Datos datos, Model model){
         datos = DatosService.getDatos(datos);
         model.addAttribute("cliente",datos);
         return "modificarCliente";
     }
     @GetMapping("/eliminarCliente/{codigoPostal}")
     public String eliminarCliente(Datos cliente){
     DatosService.delete(cliente);
     return "redirect:/";
     }
     
}
