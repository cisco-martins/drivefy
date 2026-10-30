package com.seduc2.drivefy.service;

import com.seduc2.drivefy.entity.Veiculo;
import com.seduc2.drivefy.repository.VeiculoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VeiculoService{
    private final VeiculoRepository repository;

    public VeiculoService(VeiculoRepository repository) {
        this.repository = repository;
    }

    public List<Veiculo> mostrarVeiculo(){
        List<Veiculo> veiculosList = new ArrayList<>();
        return veiculosList = repository.findAll();
    }

    public void cadastrarVeiculo(Veiculo animation){
        Veiculo veiculo = new Veiculo();
        veiculo.setModelo(animation.getModelo());
        veiculo.setTipoveiculo(animation.getTipoveiculo());
        veiculo.setMarca(animation.getMarca());
        veiculo.setCambio(animation.getCambio());
        veiculo.setDataFabricacao(animation.getDataFabricacao());
        veiculo.setQuilometragem(animation.getQuilometragem());
        veiculo.setCor(animation.getCor());
        veiculo.setRevisao(animation.getRevisao());
        veiculo.setBlindado(animation.isBlindado());
        veiculo.setObservacoes(animation.getObservacoes());
        repository.save(veiculo);
    }

}

