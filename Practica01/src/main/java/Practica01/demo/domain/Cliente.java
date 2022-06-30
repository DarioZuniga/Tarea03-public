package Practica01.demo.domain;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="estado")
public class Cliente implements Serializable {
    
    //Para utilizarlo en la generación de la llave primaria autoincremental
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoPostal;
            
    String nombreEstado;
    String capital;
    int poblacion;
    int cantidadCostas;

    public Cliente() {  //Constructor default
    }

    public Cliente(String nombreEstado, String capital, int poblacion, int cantidadCostas) {
        this.nombreEstado = nombreEstado;
        this.capital = capital;
        this.poblacion = poblacion;
        this.cantidadCostas = cantidadCostas;
    }
}
