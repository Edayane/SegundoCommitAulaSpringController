package atividade1.example.atividade1.entity;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idade;
	private String nome;
	private Calendar dataNascimento;
	
	
	public Integer getIdade() {
		return idade;
		
	}
	
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	@Override
	public String toString() {
		return "Pessoa [idade=" + idade + ", nome=" + nome + ", dataNascimento=" + dataNascimento + "]";
	}

}
