package pe.edu.upc.organicmarketbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.organicmarketbackend.entities.Orden;
import pe.edu.upc.organicmarketbackend.entities.ResultadoOrden;
import pe.edu.upc.organicmarketbackend.serviceinterfaces.IOrdenService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orden")
public class OrdenController {

    @Autowired
    private IOrdenService oService;

    @PostMapping
    public void registrar(@RequestBody Orden o) {
        oService.insert(o);
    }

    @GetMapping
    public List<Orden> listar() {
        return oService.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        oService.delete(id);
    }

    @PutMapping
    public void actualizar(@RequestBody Orden o)  {
        oService.insert(o);
    }

    @PostMapping("/buscar")
    public List<Orden> buscar(@RequestBody Orden o){
        return null;
        //return oService.search(o.getIdOrden());
        }

    @GetMapping("/id")
    public Optional<Orden> listarId(@PathVariable("id")Integer id){return oService.listarId(id);}

    @GetMapping("/buscarFecha")
    public List<Orden> buscarFechaCompra() { return oService.buscarFechaCompra();}
    @GetMapping("/cantidades")
    public List<ResultadoOrden> buscarCantidadOrdenAgricultor(){ return oService.buscarCantidadOrdenAgricultor();}
}




