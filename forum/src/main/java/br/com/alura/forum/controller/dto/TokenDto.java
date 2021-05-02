package br.com.alura.forum.controller.dto;

public class TokenDto {

	private String token;
	private String tipo;

	public TokenDto(String token, String Tipo) {
		this.token = token;
		tipo = Tipo;
	}

	public String getToken() {
		return token;
	}

	public String getTipo() {
		return tipo;
	}

}
