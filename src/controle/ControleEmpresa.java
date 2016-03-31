package controle;

import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import modelo.ModeloEmpresa;

public class ControleEmpresa {

	ConexaoDB conexaoDB = new ConexaoDB();

	public void Salvar(ModeloEmpresa mod) {
		conexaoDB.conexao();
		try {
			PreparedStatement preparedeSTT = conexaoDB.conn
					.prepareStatement("insert into cadastro_empresa (numero_empresa,nome_empresa,cnpj) values (?,?,?)");
			preparedeSTT.setInt(2, mod.getNumero());
			preparedeSTT.setString(3, mod.getNome());
			preparedeSTT.setString(4, mod.getCnpj());
			preparedeSTT.execute();
			JOptionPane.showMessageDialog(null, "Usuário salvo com sucesso!");

			conexaoDB.desconecta();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
		}

	}
}
