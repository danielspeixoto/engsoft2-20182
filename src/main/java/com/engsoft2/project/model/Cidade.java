package com.engsoft2.project.model;

import java.util.ArrayList;
import java.util.List;

/*Classe responsavel por armazenar as cidades
 * 
 * @author Enrique Wicks, Mateus Barbosa e Mateus Carvalho
 * */
public class Cidade {
	
	private String caminho="";
	private List<String> cidades = new ArrayList<String>();
	
	public Cidade() {
		ManipulaArquivo manipulador = new ManipulaArquivo(caminho);
		cidades.add("Salvador");
		cidades.add("Feira de Santana");
		cidades.add("Camaçari");
	}
	
	public List<String> getCidades(){
		return cidades;
	}
	
}
