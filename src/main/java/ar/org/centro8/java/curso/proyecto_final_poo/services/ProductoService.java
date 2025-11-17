package ar.org.centro8.java.curso.proyecto_final_poo.services;

import org.springframework.stereotype.Service;

import ar.org.centro8.java.curso.proyecto_final_poo.model.entity.Producto;
import ar.org.centro8.java.curso.proyecto_final_poo.model.repository.ProductoRepository;

import java.util.List;

@Service
public class ProductoService {
    private final ProductoRepository repo;
    public ProductoService(ProductoRepository repo) { this.repo = repo; }

    public List<Producto> listar(){ return null; }
    public Producto buscar(int id){ return null; }
    public void guardar(Producto p){  }
    public void actualizar(Producto p){  }
    public void eliminar(int id){  }
}
