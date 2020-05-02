package persistence;

import java.util.ArrayList;
import java.util.List;

import entity.Usuario;

public class UsuarioDao extends Dao {

	public void create(Usuario u) throws Exception   {
		open();
		stmt = con.prepareStatement("insert into usuario values(null,?,?,?)");
		stmt.setString(1, u.getNome());
		stmt.setString(2, u.getEmail());
		stmt.setString(3, u.getSenha());
		stmt.execute();
		close();		
	}
	
	public List<Usuario> findAll() throws Exception {
		open();
		stmt = con.prepareStatement("select * from usuario");
		rs = stmt.executeQuery();
		List<Usuario> usuarios = new ArrayList<>();
		while(rs.next()) {
			Usuario u = new Usuario(rs.getInt("id"), rs.getString("nome"), rs.getString("email"), rs.getString("senha"));
			usuarios.add(u);
		}
		close();
		return usuarios;		
	}
	
	public Usuario findById(Integer id) throws Exception {
		open();
		stmt = con.prepareStatement("select * from usuario where id = ?");
		stmt.setLong(1, id);
		rs = stmt.executeQuery();
		Usuario usuario = null;
		if(rs.next()) {
			usuario = new Usuario(rs.getInt("id"), rs.getString("nome"), rs.getString("email"), rs.getString("senha"));
		}
		close();
		return usuario;
	}
	
	public boolean alterar(Usuario u, Integer id) throws Exception {
		open();
		stmt = con.prepareStatement("update usuario set nome = ?, email = ? where id = ?");
		stmt.setString(1, u.getNome());
		stmt.setString(2, u.getEmail());
		stmt.setLong(3, id);
		stmt.execute();
		close();
		return true;
	}
	
	public boolean excluir(Integer id) throws Exception {
		open();
		stmt = con.prepareStatement("delete from usuario where id = ?");
		stmt.setInt(1, id);
		stmt.execute();
		close();
		return true;
	}
}
