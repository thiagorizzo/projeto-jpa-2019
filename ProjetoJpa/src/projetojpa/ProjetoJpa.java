/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetojpa;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import projetojpa.models.Produto;
import projetojpa.repository.IProdutoRepository;
import projetojpa.repository.ProdutoRepository;

/**
 *
 * @author Rizzo
 */
public class ProjetoJpa {

    public static void main(String[] args) {
            IProdutoRepository produtoRepository = new ProdutoRepository();
        
        try {
            List<Produto> produtos = produtoRepository.getAll();
            for(Produto produto : produtos)
            {
                System.out.println(produto.getNome());
            }
        } catch (Exception ex) {
            Logger.getLogger(ProjetoJpa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
