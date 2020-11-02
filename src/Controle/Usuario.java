package Controle;

import java.util.Date;

public class Usuario {
	private String nome;
	private Date dataHoraLogin;
	private int numero;

	public Usuario(String nome) {
		this.nome = nome;
		this.dataHoraLogin = new Date();
	}
	
	public Usuario(int numero) {
		this.numero = numero;
	}
    // get's e set's
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}

	public Date getDataHoraLogin() {return dataHoraLogin;}
	public void setDataHoraLogin(Date dataHoraLogin) {
		this.dataHoraLogin = dataHoraLogin;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
}
