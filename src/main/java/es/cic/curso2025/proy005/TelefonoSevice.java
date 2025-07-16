package es.cic.curso2025.proy005;

import org.springframework.stereotype.Service;

@Service
public class TelefonoSevice {

    private long contador = 0;

    public long create(Telefono telefono) {
        
        return ++contador; 
    }

}
