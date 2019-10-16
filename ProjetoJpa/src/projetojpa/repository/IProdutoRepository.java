 package projetojpa.repository;

import java.util.List;
import projetojpa.models.Produto;

public interface IProdutoRepository {
    public Produto getByCodigo(int codigo)  throws Exception ;
    public void update(Produto produto) throws Exception ;
    public List<Produto> getAll() throws Exception ;
}
