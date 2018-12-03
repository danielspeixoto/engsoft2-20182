package com.engsoft2.project.model;

import java.util.ArrayList;

public class Escola {

	private String bairro, nome, cidade;
	private ArrayList<Aluno> alunos;
	private int capacidade;
	private ArrayList<Vaga> vagas;
	private ArrayList<Zona> zonas;
	private Infraestrutura infra;
	
	public Escola(String matricula) {
		bairro = "Barbalho";
		nome = "Escola Suzanna Imabassahay";
		cidade = "Salvador";
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
}
