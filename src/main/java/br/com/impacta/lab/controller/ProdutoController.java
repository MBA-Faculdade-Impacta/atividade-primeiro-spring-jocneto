package br.com.impacta.lab.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Restcontroller
@RequestMapping("/produtos")
public class ProdutoController{

private static List<Produto> bancoDeDados = new ArrayList<>();

@PostMapping
public ResponseEntity<Produto> criarProduto(@RequestBody Produto produto){

bancoDeDados.add(produto);

  //return ResponseEntity.created().build();

  return ResponseEntity.ok(produto);
}

@GetMapping
public ResponseEntity<?> buscarProdutos(){
  return ResponseEntity.ok(bancoDeDados);
}

@PutMapping("/{id}")
public ResponseEntity<?> alterarProduto(@PathVariable("id") int id, @REquestBody Produto produto) {


  for (int contador = 0; contador < bancoDeDados.size(); contador++){
    Produto produto = bancoDeDados.get(contador);
    if (produto.getCodigo() == id)  {
      produto.setDescricao(newProduto.getDescricao());
      produto.setValor(newProduto.getValor());
      //break
    }
  }

  //return ResponseEntity.ok(produto);
  return ResponseEntity.notFound().build();
}

@DeleteMapping("/{id}")
public ResponseEntity<?> deletarProduto(@PathVariable int id ){

for (int contador = 0; contador < bancoDeDados.size(); contador++){
    Produto produto = bancoDeDados.get(contador);
    if (produto.getCodigo() == id) {
      bancoDeDados.remove(contador);
      return ResponseEntity.ok();
      //break
    }
    return ResponseEntity.notFound().build();
}
 
}