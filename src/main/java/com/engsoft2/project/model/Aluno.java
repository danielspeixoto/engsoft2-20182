package com.engsoft2.project.model;

import java.util.ArrayList;
import java.util.List;


public class Aluno {

	private String nome;
	private int idade;
	private long numeroMatricula;
	private int anoLetivo;
	private boolean permanencia;
	private ArrayList<Documento> documentos;
	private String endereco;
	private Responsavel responsavel;
	private String email;
	private Historico historico;
	private String path = "";
	private List<String> alunos;
	
	public Aluno() {
		
	}
	
	public List<String> getAlunos(){
		return alunos;
		
	}
	
	
}
