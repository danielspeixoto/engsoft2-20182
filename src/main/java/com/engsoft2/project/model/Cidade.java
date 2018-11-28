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
		//TODO recuperar nome da cidade
	}
	
	public List<String> getCidades(){
		return cidades;
	}
	
}
