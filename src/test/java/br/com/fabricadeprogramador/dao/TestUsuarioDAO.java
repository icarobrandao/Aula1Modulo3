package br.com.fabricadeprogramador.dao;

import br.com.fabricaprogramador.entidade.Usuario;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		testarSalvarUsuarioDAO();
	}
	
	public static void testarSalvarUsuarioDAO(){
		Usuario usuario = new Usuario();
		usuario.setNome("maria");
		usuario.setLogin("mar");
		usuario.setSenha("123");
		
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.salvar(usuario);
		System.out.println("Salvo com sucesso!");
		
	}

}
