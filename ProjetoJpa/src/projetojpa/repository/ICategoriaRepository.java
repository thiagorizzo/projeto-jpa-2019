 package projetojpa.repository;

import java.util.List;
import projetojpa.models.Categoria;

public interface ICategoriaRepository {
    public Categoria getByCodigo(int codigo)  throws Exception ;
    public List<Categoria> getAll() throws Exception ;
}
