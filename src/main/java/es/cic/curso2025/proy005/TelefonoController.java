package es.cic.curso2025.proy005;

import java.util.List;
import java.util.ArrayList; // Importación añadida

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/telefono")
public class TelefonoController {

    private int contador = 0;

    public long create (@RequestBody Telefono telefono){

        return ++contador; 

    }


    @GetMapping
    public List<Telefono> get() {

        // contador++;

        List<Telefono> resultado = new ArrayList<>();

        Telefono telefono1 = new Telefono();
        telefono1.setId(1L);
        telefono1.setNumero("123456789");
        telefono1.setTipoContrato(1);
        telefono1.setTitular("Juan Perez");

        resultado.add(telefono1);

        Telefono telefono2 = new Telefono();
        telefono2.setId(2L); // Id diferente
        telefono2.setNumero("987654321");
        telefono2.setTipoContrato(2);
        telefono2.setTitular("Maria Lopez");

        resultado.add(telefono2);

        return resultado;
    }

    @GetMapping("/{id}")
    public List<Telefono> get(@PathVariable long id) {
        

        Telefono telefono1 = new Telefono();
        telefono1.setId(1L);
        telefono1.setNumero("123456789");
        telefono1.setTipoContrato(1);
        telefono1.setTitular("Juan Perez");

        return List.of(telefono1); 
    }

    @PutMapping
    public void update(Telefono telefono) {
        throw new UnsupportedOperationException();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {  

    }
}
