package atividade1.example.atividade1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import atividade1.example.atividade1.entity.Pessoa;
import atividade1.example.atividade1.repository.PessoaRepository;

@Controller
public class ControllerFormulario {
	@Autowired
	PessoaRepository pessoaRepository;

	@GetMapping("/formulario")
	public String form(Pessoa pessoa) {
		return "formulario";
	}
	
	@GetMapping("/")
	public String home() {
		System.out.println("aqui");
		return "index";
	}
	
	@PostMapping
	public String create(Pessoa pessoa, RedirectAttributes redirectAtributes) {
		System.out.println(pessoa);
		pessoaRepository.save(pessoa);
		redirectAtributes.addFlashAttribute("casa", pessoa.getNome()+ "pessoa cadastrada");
		return "redirect:/formulario";
	}
}
