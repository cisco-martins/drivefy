package com.seduc2.drivefy.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
public class Veiculo {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String modelo;

    private String tipoveiculo;

    private String marca;

    private Cambio cambio;

    private int dataFabricacao;

    private double quilometragem;

    private String cor;

    private StatusRevisao revisao;

    private boolean blindado;

    private String observacoes;


    public Veiculo() {}

    public Veiculo(String observacoes, boolean blindado, StatusRevisao revisao, String cor, double quilometragem, int dataFabricacao, Cambio cambio, String marca, String tipoveiculo, String modelo) {
        this.observacoes = observacoes;
        this.blindado = blindado;
        this.revisao = revisao;
        this.cor = cor;
        this.quilometragem = quilometragem;
        this.dataFabricacao = dataFabricacao;
        this.cambio = cambio;
        this.marca = marca;
        this.tipoveiculo = tipoveiculo;
        this.modelo = modelo;
    }

    public Veiculo(long id, String modelo, String tipoveiculo, String marca, Cambio cambio, int dataFabricacao, double quilometragem, String cor, StatusRevisao revisao, boolean blindado, String observacoes) {
        this.id = id;
        this.modelo = modelo;
        this.tipoveiculo = tipoveiculo;
        this.marca = marca;
        this.cambio = cambio;
        this.dataFabricacao = dataFabricacao;
        this.quilometragem = quilometragem;
        this.cor = cor;
        this.revisao = revisao;
        this.blindado = blindado;
        this.observacoes = observacoes;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoveiculo() {
        return tipoveiculo;
    }

    public void setTipoveiculo(String tipoveiculo) {
        this.tipoveiculo = tipoveiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Cambio getCambio() {
        return cambio;
    }

    public void setCambio(Cambio cambio) {
        this.cambio = cambio;
    }

    public int getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(int dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double kilometragem) {
        this.quilometragem = kilometragem;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public StatusRevisao getRevisao() {
        return revisao;
    }

    public void setRevisao(StatusRevisao revisao) {
        this.revisao = revisao;
    }

    public boolean isBlindado() {
        return blindado;
    }

    public void setBlindado(boolean blindado) {
        this.blindado = blindado;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }


}
