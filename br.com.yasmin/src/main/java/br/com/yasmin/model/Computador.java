package br.com.yasmin.model;

import javax.persistence.Entity;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class Computador {
	
	private int id;
	private String cor;
	private String marca;
	private String responsável;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getResponsável() {
		return responsável;
	}
	public void setResponsável(String responsável) {
		this.responsável = responsável;
	}
	
	public void informacoesComputador () {
		System.out.println("ID: "+this.getId());
		System.out.println("COR: "+this.getCor());
		System.out.println("Marca:"+this.getMarca ());
		System.out.println("Responsável:"+this.getResponsável ());
	}
	
	
}
