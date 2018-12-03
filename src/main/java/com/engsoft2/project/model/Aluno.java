package com.engsoft2.project.model;

import java.util.ArrayList;
import java.util.List;


public class Aluno {

	private String nome;
	private int idade;
	private long numeroMatricula;
	private int anoLetivo;
	private int permanencia;
	private ArrayList<Documento> documentos;
	private Escola escola;
	private String endereco, matricula, responsavelNome, serie, telefone;
	private Responsavel responsavel;
	private String email;
	private Historico historico;
	private String path = "";
	private List<String> alunos = new ArrayList<String>();
	private List<String> alunosMatricula = new ArrayList<String>();
	
	public Aluno(String matricula) {
		this.matricula = matricula;
		gerarListaDeAlunos();
		procurarRegistro();
	}
	
	public int getPermanencia() {
		return permanencia;
	}

	public void setPermanencia(int permanencia) {
		this.permanencia = permanencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getResponsavelNome() {
		return responsavelNome;
	}

	public void setResponsavelNome(String responsavelNome) {
		this.responsavelNome = responsavelNome;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	private void gerarListaDeAlunos() {
		alunos.add("Fulano da Silva");
		alunosMatricula.add("12345678");
	}
	
	private void procurarRegistro() {
		int iterador = 0;
		while(alunosMatricula.get(iterador) != null && 
			  !alunosMatricula.get(iterador).equals(matricula)) {
			iterador++;
		}
		if(alunosMatricula.get(iterador) != null) {
			this.escola = new Escola(matricula);
			this.nome = "Fulano da Silva";
			this.responsavelNome = "Cicrano da Silva";
			this.telefone = "(71) 99946-0910";
			this.serie = "1º Ano A";
			this.permanencia = 0;
		}
	}
	
	public ArrayList<String> getEscolaInformacoes(){
		ArrayList<String> informacoes = new ArrayList<String>();
		informacoes.add(this.escola.getNome());
		informacoes.add(this.escola.getCidade());
		informacoes.add(this.escola.getBairro());
		
		return informacoes;
	}
	
	public List<String> getAlunos(){
		return alunos;
		
	}
	
	public String getEscolaNome() {
		return this.escola.getNome();
	}
	
	public String getStatusNome() {
		String retorno="";
		System.out.println("Status numero = "+permanencia);
		switch (permanencia) {
		case 0:
			retorno = "Permanência não confirmada";
			break;
		case 1:
			retorno = "Transferência em análise";
			break;
		case 2:
			retorno = "Matrícula confirmada";
			break;
		default:
			retorno = "Status não encontrado";
			break;
		}
		return retorno;
	}
	
}
