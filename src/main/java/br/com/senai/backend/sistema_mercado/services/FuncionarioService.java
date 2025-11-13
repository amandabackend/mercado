package br.com.senai.backend.sistema_mercado.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FuncionarioService {
    
}
@Autowired
private  MercadoriaRepositoy FuncionarioRepositoy;

public Mercadoria cadastrar (Funcionario funcionario){
return FuncionarioRepositoy.save(mercadoria);
}
public Mercadoria recuperarPorId (Integer Id){
return FuncionariaRepository.findById(Id).get();




}
}





















