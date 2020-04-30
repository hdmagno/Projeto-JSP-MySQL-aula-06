package persistence;

import java.util.ArrayList;
import java.util.List;

import entity.Produto;

public class ProdutoDao extends Dao {

	public void create(Produto p) throws Exception {
		open();
		stmt = con.prepareStatement("insert into produto values(null,?,?,?)");
		stmt.setString(1, p.getNome());
		stmt.setDouble(2, p.getPreco());
		stmt.setString(3, p.getImagem());
		stmt.execute();
		close();
	}

	public List<Produto> findAll() throws Exception {
		open();		
		stmt = con.prepareStatement("select * from produto");
		rs = stmt.executeQuery();
		List<Produto> lista = new ArrayList<>();
		while (rs.next()) {
			Produto p = new Produto();
			p.setId(rs.getLong("id"));
			p.setNome(rs.getString("nome"));
			p.setPreco(rs.getDouble("preco"));
			p.setImagem(rs.getString("imagem"));
			lista.add(p);
		}
		close();
		return lista;
	}
}
