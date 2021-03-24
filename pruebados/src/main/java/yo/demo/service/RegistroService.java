package yo.demo.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import yo.demo.model.RegistroModel;
import yo.demo.repository.RegistroRepository;

@RestController
@RequestMapping("/registro")
@CrossOrigin(origins = "*")
public class RegistroService {
    @Autowired
    private RegistroRepository repo;
    private final Gson gson;

    RegistroService() {
        this.gson = new GsonBuilder().setPrettyPrinting().create();
    }

    @PostMapping({"","/"})
    ResponseEntity<String> sumarOperandos(@RequestBody String request){
        RegistroModel registro = gson.fromJson(request,RegistroModel.class);
        int resultado = registro.getOperando1() + registro.getOperando2();
        registro.setResultado(resultado);
        //System.out.println("prueba1");

        repo.save(registro);

        return new ResponseEntity<>(gson.toJson(registro), HttpStatus.OK);

    }
}
