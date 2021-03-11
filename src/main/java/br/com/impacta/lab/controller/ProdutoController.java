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


}