package controle;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ConexaoDB {
	
	public Statement stm;// Responsavel por preparar e realizar pesquisas no BD.
	public ResultSet rs;// Responsavel por armazenar o resultado de uma pesquisa
						// passada pelo Statiment.
	private String driver = "org.sqlite.JDBC"; // Driver de indentificação do
												// Banco de Dados.
	
	private String caminho = "jdbc:sqlite:dbpdv.db";
	private String usuario;
	private String senha;
	public Connection conn;// Responsável por realizar a conexão com o BD.

	public void conexao() {
		try {
			Class.forName("org.sqlite.JDBC");
			// System.setProperty("jdbc.Drivers", driver);
			conn = DriverManager.getConnection(caminho);
			JOptionPane.showMessageDialog(null, "Banco de dados conectado com sucesso!");
		} catch (SQLException | ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Erro de conexão! \n Erro: " + e.getMessage());
		}
	}

	public void executarSQL(String SQL) {
		try {
			conn.setHoldability(ResultSet.CLOSE_CURSORS_AT_COMMIT);
			stm = conn.createStatement(rs.TYPE_FORWARD_ONLY, rs.CONCUR_READ_ONLY);
		//	stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
			rs = stm.executeQuery(SQL);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao execulta SQL!\n Erro: " + e.getMessage());
		}
	}

	public void desconecta() {
		try {
			conn.close();
			JOptionPane.showMessageDialog(null, "Banco desconectado com sucesso!");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Não foi possível desconectar do banco!\n Erro: " + e.getMessage());
		}
	}

}

