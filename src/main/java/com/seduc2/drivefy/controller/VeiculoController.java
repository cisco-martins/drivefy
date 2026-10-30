package com.seduc2.drivefy.controller;

import com.seduc2.drivefy.entity.Veiculo;
import com.seduc2.drivefy.service.VeiculoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/veiculos")
public class VeiculoController {

    private final VeiculoService service;

    public VeiculoController(VeiculoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Veiculo> mostrarVeiculo(){
        return service.mostrarVeiculo();
    }

    @PostMapping
    public void criarVeiculo(@RequestBody Veiculo v ){
        service.cadastrarVeiculo(v);
    }

}
