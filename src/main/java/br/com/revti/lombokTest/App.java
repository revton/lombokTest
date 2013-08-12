package br.com.revti.lombokTest;

import br.com.revti.lombokTest.model.Usuario;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Usuario usuario = new Usuario();
    	usuario.setUsuario("revton");
    	usuario.setSenha("13245");
    	System.out.println(usuario);
    }
}
