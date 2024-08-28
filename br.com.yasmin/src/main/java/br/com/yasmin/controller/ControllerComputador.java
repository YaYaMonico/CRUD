package br.com.yasmin.controller;

import javax.persistence.Entity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.yasmin.model.Computador;

@Controller
@RequestMapping ("/computadores")
public class ControllerComputador {
	
@GetMapping (value = "/novocomputador")
public String novoComputador(Model model) {
	model.addAttribute("computador", new Computador());
	return "novocomputador";
}

	
@PostMapping("/salvar")
public String salvar(@ModelAttribute Computador computador, Model model) {
	computador.informacoesComputador();
	model.addAttribute("computador", new Computador());
	return "novocomputador"; 
}
}
