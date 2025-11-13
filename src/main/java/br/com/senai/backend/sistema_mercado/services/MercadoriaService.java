package br.com.senai.backend.sistema_mercado.services;

import org.springframework.stereotype.Service;

import br.com.senai.backend.sistema_mercado.models.Mercadoria;
import br.com.senai.backend.sistema_mercado.repositories.MercadoriaRepositoy;

@Service
public class MercadoriaService {
    

@Autowired
private  MercadoriaRepositoy mercadoriaRepositoy;

public Mercadoria cadastrar (Mercadoria mercadoria){
return mercadoriaRepositoy.save(mercadoria);
}
public Mercadoria recuperarPorId (Integer Id) {
return mercadoriaRepository.findById(Id).get();
}



}






















