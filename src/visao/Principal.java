package visao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;

import controle.ConexaoDB;
import controle.ControleEmpresa;
import modelo.ModeloEmpresa;

public class Principal extends JFrame {
	JToolBar JTbarraDeMenu = new JToolBar(JToolBar.HORIZONTAL);
	
	JTable JTempresa = new JTable();
	JTable JTpc = new JTable();
	JTable JTmonitor = new JTable();
	JTable JTnobreak = new JTable();
	JTable JTteclado = new JTable();
	JTable JTmouse = new JTable();
	JTable JTpinpad = new JTable();
	JTable JTleitor = new JTable();
	JTable JTbalanca = new JTable();
	JTable JTgaveta = new JTable();
	JTable JTimpressora = new JTable();

	JButton JBempresa = new JButton();
	JButton JBPDV = new JButton();
	JButton JBpc = new JButton();
	JButton JBmonitor = new JButton();
	JButton JBnobreak = new JButton();
	JButton JBteclado = new JButton();
	JButton JBmouse = new JButton();
	JButton JBpinpad = new JButton();
	JButton JBleitor = new JButton();
	JButton JBbalanca = new JButton();
	JButton JBgaveta = new JButton();
	JButton JBimpressora = new JButton();

	JDialog JDempresa = new JDialog();
	JDialog JDPDV = new JDialog();
	JDialog JDpc = new JDialog();
	JDialog JDmonitor = new JDialog();
	JDialog JDnobreak = new JDialog();
	JDialog JDtecldo = new JDialog();
	JDialog JDmouse = new JDialog();
	JDialog JDpinpad = new JDialog();
	JDialog JDleitor = new JDialog();
	JDialog JDbalanca = new JDialog();
	JDialog JDgaveta = new JDialog();
	JDialog JDimpressora = new JDialog();

	JButton JBcaixa01 = new JButton();
	JButton JBcaixa02 = new JButton();
	JButton JBcaixa03 = new JButton();
	JButton JBcaixa04 = new JButton();
	JButton JBcaixa05 = new JButton();
	JButton JBcaixa06 = new JButton();
	JButton JBcaixa07 = new JButton();
	JButton JBcaixa08 = new JButton();
	JButton JBcaixa09 = new JButton();
	JButton JBcaixa10 = new JButton();
	JButton JBcaixa11 = new JButton();
	JButton JBcaixa12 = new JButton();
	JButton JBcaixa13 = new JButton();
	JButton JBcaixa14 = new JButton();
	JButton JBcaixa15 = new JButton();
	JButton JBcaixa16 = new JButton();
	JButton JBcaixa17 = new JButton();
	JButton JBcaixa18 = new JButton();
	JButton JBcaixa19 = new JButton();
	JButton JBcaixa20 = new JButton();
	JButton JBcaixa21 = new JButton();
	JButton JBcaixa22 = new JButton();
	JButton JBcaixa23 = new JButton();
	JButton JBcaixa24 = new JButton();
	JButton JBcaixa25 = new JButton();
	JButton JBcaixa26 = new JButton();
	JButton JBcaixa27 = new JButton();
	JButton JBcaixa28 = new JButton();
	JButton JBcaixa29 = new JButton();
	JButton JBcaixa30 = new JButton();
	JButton JBcaixa31 = new JButton();
	JButton JBcaixa32 = new JButton();
	JButton JBcaixa33 = new JButton();
	JButton JBcaixa34 = new JButton();
	JButton JBcaixa35 = new JButton();
	JButton JBcaixa36 = new JButton();
	JButton JBcaixa37 = new JButton();
	JButton JBcaixa38 = new JButton();
	JButton JBcaixa39 = new JButton();
	JButton JBcaixa40 = new JButton();

	JLabel JLempresa = new JLabel();
	JLabel JLpc = new JLabel();
	JLabel JLmonitor = new JLabel();
	JLabel JLnobreak = new JLabel();
	JLabel JLteclado = new JLabel();
	JLabel JLmouse = new JLabel();
	JLabel JLpinpad = new JLabel();
	JLabel JLleitor = new JLabel();
	JLabel JLbalanca = new JLabel();
	JLabel JLgaveta = new JLabel();
	JLabel JLimpressora = new JLabel();
	JLabel JLdataUltimaAlteracao = new JLabel();

	JComboBox<String> JCpc = new JComboBox<>();
	JComboBox<String> JCmonitor = new JComboBox<>();
	JComboBox<String> JCnobreak = new JComboBox<>();
	JComboBox<String> JCteclado = new JComboBox<>();
	JComboBox<String> JCmouse = new JComboBox<>();
	JComboBox<String> JCpinpad = new JComboBox<>();
	JComboBox<String> JCleitor = new JComboBox<>();
	JComboBox<String> JCbalanca = new JComboBox<>();
	JComboBox<String> JCgaveta = new JComboBox<>();
	JComboBox<String> JCimpressora = new JComboBox<>();

	// COMPONENTES DA TELA DE CADASTRO DAS EMPRESAS
	JLabel JLEcodigoCadastro = new JLabel();
	JLabel JLEcodigo = new JLabel();
	JLabel JLEnome = new JLabel();
	JLabel JLEcnpj = new JLabel();

	JTextField JTEcodigoCadastro = new JTextField();
	JTextField JTEcodigo = new JTextField();
	JTextField JTEnome = new JTextField();
	JTextField JTEcnpj = new JTextField();
	
	JButton JBEsalvar = new JButton();

	// COMPONENTES DA TELA DE CADASTRO DE PDV
	JLabel JLPcodigo = new JLabel();
	JLabel JLPpc = new JLabel();
	JLabel JLPmonitor = new JLabel();
	JLabel JLPnobreak = new JLabel();
	JLabel JLPteclado = new JLabel();
	JLabel JLPmouse = new JLabel();
	JLabel JLPpinpad = new JLabel();
	JLabel JLPleitor = new JLabel();
	JLabel JLPbalanca = new JLabel();
	JLabel JLPgaveta = new JLabel();
	JLabel JLPempresa = new JLabel();
	JLabel JLPimpressora = new JLabel();

	JComboBox<String> JCPcodigo = new JComboBox<>();
	JComboBox<String> JCPpc = new JComboBox<>();
	JComboBox<String> JCPmonitor = new JComboBox<>();
	JComboBox<String> JCPnobreak = new JComboBox<>();
	JComboBox<String> JCPteclado = new JComboBox<>();
	JComboBox<String> JCPmouse = new JComboBox<>();
	JComboBox<String> JCPpinpad = new JComboBox<>();
	JComboBox<String> JCPleitor = new JComboBox<>();
	JComboBox<String> JCPbalanca = new JComboBox<>();
	JComboBox<String> JCPgaveta = new JComboBox<>();
	JComboBox<String> JCPempresa = new JComboBox<>();
	JComboBox<String> JCPimpressora = new JComboBox<>();

	JButton JBPsalvar = new JButton();

	// COMPONENTES DA TELA DE CADASTRO DE PC
	JLabel JLPCcodigo = new JLabel();
	JLabel JLPCnome = new JLabel();
	JLabel JLPCnumeroDeSerie = new JLabel();
	JLabel JLPCprocessador = new JLabel();
	JLabel JLPCmemoria = new JLabel();
	JLabel JLPCsituaco = new JLabel();

	JTextField JTPCcodigo = new JTextField();
	JTextField JTPCnome = new JTextField();
	JTextField JTPCnumeroDeSerie = new JTextField();
	JTextField JTPCprocessador = new JTextField();
	JTextField JTPCmemoria = new JTextField();

	JComboBox<String> JCPCsituacao = new JComboBox<>();

	JButton JBPCsalvar = new JButton();

	// COMPONENTES DA TELA DE CADASTRO DE MONITOR
	JLabel JLMcodigo = new JLabel();
	JLabel JLMnome = new JLabel();
	JLabel JLMnumeroDeSerie = new JLabel();
	JLabel JLMpolegadas = new JLabel();
	JLabel JLMmarca = new JLabel();
	JLabel JLMsituacao = new JLabel();

	JTextField JTMcodigo = new JTextField();
	JTextField JTMnome = new JTextField();
	JTextField JTMnumeroDeSerie = new JTextField();
	JTextField JTMpolegadas = new JTextField();
	JTextField JTMmarca = new JTextField();

	JComboBox<String> JCMsituacao = new JComboBox<>();

	JButton JBMsalvar = new JButton();

	// COMPONENTES DA TELA DE CADASTRO DE NOBREAK
	JLabel JLNcodigo = new JLabel();
	JLabel JLNnome = new JLabel();
	JLabel JLNnumeroDeSerie = new JLabel();
	JLabel JLNva = new JLabel();
	JLabel JLNmarca = new JLabel();
	JLabel JLNsituacao = new JLabel();

	JTextField JTNcodigo = new JTextField();
	JTextField JTNnome = new JTextField();
	JTextField JTNnumeroDeSerie = new JTextField();
	JTextField JTNva = new JTextField();
	JTextField JTNmarca = new JTextField();

	JComboBox<String> JCNsituacao = new JComboBox<>();

	JButton JBNsalvar = new JButton();

	// COMPONENTES DA TELA DE CADASTRO DE TECLADO
	JLabel JLTcodigo = new JLabel();
	JLabel JLTsituacao = new JLabel();
	JLabel JLTnome = new JLabel();
	JLabel JLTnumeroDeSerie = new JLabel();
	JLabel JLTtipo = new JLabel();
	JLabel JLTmarca = new JLabel();

	JTextField JTTcodigo = new JTextField();
	JTextField JTTnome = new JTextField();
	JTextField JTTnumeroDeSerie = new JTextField();
	JTextField JTTmarca = new JTextField();

	JComboBox<String> JCTsituacao = new JComboBox<>();
	JComboBox<String> JCTtipo = new JComboBox<>();

	JButton JBTsalvar = new JButton();

	// COMPONENTES DA TELA DE CADASTRO DE MOUSE
	JLabel JLMOcodigo = new JLabel();
	JLabel JLMOsituacao = new JLabel();
	JLabel JLMOnome = new JLabel();
	JLabel JLMOnumeroDeSerie = new JLabel();
	JLabel JLMOtipo = new JLabel();
	JLabel JLMOmarca = new JLabel();

	JTextField JTMOcodigo = new JTextField();
	JTextField JTMOnome = new JTextField();
	JTextField JTMOnumeroDeSerie = new JTextField();
	JTextField JTMOmarca = new JTextField();

	JComboBox<String> JCMOsituacao = new JComboBox<>();
	JComboBox<String> JCMOtipo = new JComboBox<>();

	JButton JBMOsalvar = new JButton();

	// COMPONENTES DA TELA DE CADASTRO DE BALANÇA
	JLabel JLBcodigo = new JLabel();
	JLabel JLBsituacao = new JLabel();
	JLabel JLBnome = new JLabel();
	JLabel JLBnumeroDeSerie = new JLabel();
	JLabel JLBtipo = new JLabel();
	JLabel JLBmarca = new JLabel();
	JLabel JLBmodelo = new JLabel();

	JTextField JTBcodigo = new JTextField();
	JTextField JTBnome = new JTextField();
	JTextField JTBnumeroDeSerie = new JTextField();
	JTextField JTBmarca = new JTextField();
	JTextField JTBmodelo = new JTextField();

	JComboBox<String> JCBsituacao = new JComboBox<>();
	JComboBox<String> JCBtipo = new JComboBox<>();

	JButton JBBsalvar = new JButton();

	// COMPONENTES DA TELA DE CADASTRO DE GAVETA
	JLabel JLGcodigo = new JLabel();
	JLabel JLGsituacao = new JLabel();
	JLabel JLGnome = new JLabel();
	JLabel JLGnumeroDeSerie = new JLabel();
	JLabel JLGmarca = new JLabel();
	JLabel JLGmodelo = new JLabel();

	JTextField JTGcodigo = new JTextField();
	JTextField JTGnome = new JTextField();
	JTextField JTGnumeroDeSerie = new JTextField();
	JTextField JTGmarca = new JTextField();
	JTextField JTGmodelo = new JTextField();

	JComboBox<String> JCGsituacao = new JComboBox<>();

	JButton JBGsalvar = new JButton();

	// COMPONENTES DA TELA DE CADASTRO DE PIN PAD
	JLabel JLPPcodigo = new JLabel();
	JLabel JLPPsituacao = new JLabel();
	JLabel JLPPnome = new JLabel();
	JLabel JLPPnumeroDeSerie = new JLabel();
	JLabel JLPPtipo = new JLabel();
	JLabel JLPPmarca = new JLabel();
	JLabel JLPPmodelo = new JLabel();

	JTextField JTPPcodigo = new JTextField();
	JTextField JTPPnome = new JTextField();
	JTextField JTPPnumeroDeSerie = new JTextField();
	JTextField JTPPmarca = new JTextField();
	JTextField JTPPmodelo = new JTextField();

	JComboBox<String> JCPPsituacao = new JComboBox<>();
	JComboBox<String> JCPPtipo = new JComboBox<>();

	JButton JBPPsalvar = new JButton();

	// COMPONENTES DA TELA DE CADASTRO DE LEITOR
	JLabel JLLcodigo = new JLabel();
	JLabel JLLsituacao = new JLabel();
	JLabel JLLnome = new JLabel();
	JLabel JLLnumeroDeSerie = new JLabel();
	JLabel JLLtipo = new JLabel();
	JLabel JLLmarca = new JLabel();
	JLabel JLLmodelo = new JLabel();

	JTextField JTLcodigo = new JTextField();
	JTextField JTLnome = new JTextField();
	JTextField JTLnumeroDeSerie = new JTextField();
	JTextField JTLmarca = new JTextField();
	JTextField JTLmodelo = new JTextField();

	JComboBox<String> JCLsituacao = new JComboBox<>();
	JComboBox<String> JCLtipo = new JComboBox<>();

	JButton JBLsalvar = new JButton();

	// COMPONENTES DA TELA DE CADASTRO DE IMPRESSORA
	JLabel JLIcodigo = new JLabel();
	JLabel JLIsituacao = new JLabel();
	JLabel JLInome = new JLabel();
	JLabel JLInumeroDeSerie = new JLabel();
	JLabel JLItipo = new JLabel();
	JLabel JLImarca = new JLabel();
	JLabel JLImodelo = new JLabel();

	JTextField JTIcodigo = new JTextField();
	JTextField JTInome = new JTextField();
	JTextField JTInumeroDeSerie = new JTextField();
	JTextField JTImarca = new JTextField();
	JTextField JTImodelo = new JTextField();

	JComboBox<String> JCIsituacao = new JComboBox<>();
	JComboBox<String> JCItipo = new JComboBox<>();

	JButton JBIsalvar = new JButton();

	JPanel painel01 = new JPanel();
	JPanel painel02 = new JPanel();
	JPanel painel03 = new JPanel();

	ConexaoDB conexaoDBEmpresa = new ConexaoDB();
	ConexaoDB conexaoDBPDV = new ConexaoDB();
	ConexaoDB conexaoDBpc = new ConexaoDB();
	ConexaoDB conexaoDBmonitor = new ConexaoDB();
	ConexaoDB conexaoDBnobreak = new ConexaoDB();
	ConexaoDB conexaoDBteclado = new ConexaoDB();
	ConexaoDB conexaoDBmouse = new ConexaoDB();
	ConexaoDB conexaoDBpinpad = new ConexaoDB();
	ConexaoDB conexaoDBleitor = new ConexaoDB();
	ConexaoDB conexaoDBgaveta = new ConexaoDB();
	ConexaoDB conexaoDBimpressora = new ConexaoDB();
	
	
	ModeloEmpresa modeloEmpresa = new ModeloEmpresa();
	ControleEmpresa controleEmpresa = new ControleEmpresa();
	
	public Principal() {

		// TELA DE CADASTRO DAS EMPRESAS
		JLEcodigoCadastro.setText("Nº Cadastro:");
		JLEcodigoCadastro.setBounds(20, 20, 120, 30);
		JDempresa.add(JLEcodigoCadastro);

		JLEcodigo.setText("Código:");
		JLEcodigo.setBounds(20, 60, 120, 30);
		JDempresa.add(JLEcodigo);

		JLEnome.setText("Nome:");
		JLEnome.setBounds(20, 100, 120, 30);
		JDempresa.add(JLEnome);

		JLEcnpj.setText("CNPJ:");
		JLEcnpj.setBounds(20, 140, 120, 30);
		JDempresa.add(JLEcnpj);

		JTEcodigoCadastro.setBounds(120, 20, 90, 30);
		JDempresa.add(JTEcodigoCadastro);

		JTEcodigo.setBounds(120, 60, 90, 30);
		JDempresa.add(JTEcodigo);

		JTEnome.setBounds(120, 100, 450, 30);
		JDempresa.add(JTEnome);

		JTEcnpj.setBounds(120, 140, 200, 30);
		JDempresa.add(JTEcnpj);
		
		JBEsalvar.setText("Salvar");
		JBEsalvar.setBounds(255, 420, 90, 30);
		JBEsalvar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBEsalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modeloEmpresa.setNumero(Integer.parseInt(JTEcodigoCadastro.getText()));
				modeloEmpresa.setNome(JTEnome.getText());
				modeloEmpresa.setCnpj(JTEcnpj.getText());
				controleEmpresa.Salvar(modeloEmpresa);
			}
		});
		JDempresa.add(JBEsalvar);

		JDempresa.setTitle("CADASTRO DE EMPRESAS");
		JDempresa.setLayout(null);
		JDempresa.setSize(600, 500);
		JDempresa.setModal(true);
		JDempresa.setResizable(false);
		JDempresa.setLocationRelativeTo(null);

		// TELA DE CADASTRO DOS PDVs
		JLPcodigo.setText("CAIXA:");
		JLPcodigo.setBounds(20, 20, 70, 30);
		JDPDV.add(JLPcodigo);

		JLPempresa.setText("EMPRESA:");
		JLPempresa.setBounds(300, 20, 70, 30);
		JDPDV.add(JLPempresa);

		JLPmonitor.setText("Monitor:");
		JLPmonitor.setBounds(20, 70, 70, 30);
		JDPDV.add(JLPmonitor);

		JLPnobreak.setText("Nobreak:");
		JLPnobreak.setBounds(20, 120, 70, 30);
		JDPDV.add(JLPnobreak);

		JLPteclado.setText("Teclado:");
		JLPteclado.setBounds(20, 170, 70, 30);
		JDPDV.add(JLPteclado);

		JLPmouse.setText("Mouse:");
		JLPmouse.setBounds(20, 220, 70, 30);
		JDPDV.add(JLPmouse);

		JLPpinpad.setText("Pin Pad:");
		JLPpinpad.setBounds(20, 270, 70, 30);
		JDPDV.add(JLPpinpad);

		JLPleitor.setText("Leitor:");
		JLPleitor.setBounds(20, 320, 70, 30);
		JDPDV.add(JLPleitor);

		JLPbalanca.setText("Balança:");
		JLPbalanca.setBounds(20, 370, 70, 30);
		JDPDV.add(JLPbalanca);

		JLPgaveta.setText("Gaveta:");
		JLPgaveta.setBounds(20, 420, 70, 30);
		JDPDV.add(JLPgaveta);

		JLPimpressora.setText("Impressora:");
		JLPimpressora.setBounds(20, 470, 70, 30);
		JDPDV.add(JLPimpressora);

		JCPcodigo.setBounds(100, 20, 150, 30);
		JDPDV.add(JCPcodigo);

		JCPempresa.setBounds(400, 20, 150, 30);
		JDPDV.add(JCPempresa);

		JCPmonitor.setBounds(100, 70, 300, 30);
		JDPDV.add(JCPmonitor);

		JCPnobreak.setBounds(100, 120, 300, 30);
		JDPDV.add(JCPnobreak);

		JCPteclado.setBounds(100, 170, 300, 30);
		JDPDV.add(JCPteclado);

		JCPmouse.setBounds(100, 220, 300, 30);
		JDPDV.add(JCPmouse);

		JCPpinpad.setBounds(100, 270, 300, 30);
		JDPDV.add(JCPpinpad);

		JCPleitor.setBounds(100, 320, 300, 30);
		JDPDV.add(JCPleitor);

		JCPbalanca.setBounds(100, 370, 300, 30);
		JDPDV.add(JCPbalanca);

		JCPgaveta.setBounds(100, 420, 300, 30);
		JDPDV.add(JCPgaveta);

		JCPimpressora.setBounds(100, 470, 300, 30);
		JDPDV.add(JCPimpressora);

		JBPsalvar.setText("Salvar");
		JBPsalvar.setBounds(255, 520, 90, 30);
		JDPDV.add(JBPsalvar);

		JDPDV.setTitle("CADASTRO DE PDV");
		JDPDV.setLayout(null);
		JDPDV.setSize(600, 600);
		JDPDV.setModal(true);
		JDPDV.setResizable(false);
		JDPDV.setLocationRelativeTo(null);

		// TELA DE CADASTRO DOS PC
		JLPCcodigo.setText("Código:");
		JLPCcodigo.setBounds(20, 20, 70, 30);
		JDpc.add(JLPCcodigo);

		JLPCsituaco.setText("Situação:");
		JLPCsituaco.setBounds(300, 20, 70, 30);
		JDpc.add(JLPCsituaco);

		JLPCnome.setText("Nome:");
		JLPCnome.setBounds(20, 70, 70, 30);
		JDpc.add(JLPCnome);

		JLPCnumeroDeSerie.setText("Nº Série:");
		JLPCnumeroDeSerie.setBounds(20, 120, 70, 30);
		JDpc.add(JLPCnumeroDeSerie);

		JLPCprocessador.setText("Processador:");
		JLPCprocessador.setBounds(20, 170, 100, 30);
		JDpc.add(JLPCprocessador);

		JLPCmemoria.setText("Memoria:");
		JLPCmemoria.setBounds(300, 170, 70, 30);
		JDpc.add(JLPCmemoria);

		JTPCcodigo.setBounds(100, 20, 90, 30);
		JDpc.add(JTPCcodigo);

		JCPCsituacao.setBounds(390, 20, 150, 30);
		JDpc.add(JCPCsituacao);

		JTPCnome.setBounds(100, 70, 300, 30);
		JDpc.add(JTPCnome);

		JTPCnumeroDeSerie.setBounds(100, 120, 200, 30);
		JDpc.add(JTPCnumeroDeSerie);

		JTPCprocessador.setBounds(100, 170, 100, 30);
		JDpc.add(JTPCprocessador);

		JTPCmemoria.setBounds(390, 170, 50, 30);
		JDpc.add(JTPCmemoria);

		JBPCsalvar.setText("Salvar");
		JBPCsalvar.setBounds(255, 430, 90, 30);
		JDpc.add(JBPCsalvar);

		JDpc.setTitle("CADASTRO DE PC");
		JDpc.setLayout(null);
		JDpc.setSize(600, 500);
		JDpc.setModal(true);
		JDpc.setResizable(false);
		JDpc.setLocationRelativeTo(null);

		// TELA DE CADASTRO DE MONITOR
		JLMcodigo.setText("Código:");
		JLMcodigo.setBounds(20, 20, 70, 30);
		JDmonitor.add(JLMcodigo);

		JLMsituacao.setText("Situação:");
		JLMsituacao.setBounds(300, 20, 70, 30);
		JDmonitor.add(JLMsituacao);

		JLMnome.setText("Nome:");
		JLMnome.setBounds(20, 70, 70, 30);
		JDmonitor.add(JLMnome);

		JLMnumeroDeSerie.setText("Nº Série:");
		JLMnumeroDeSerie.setBounds(20, 120, 70, 30);
		JDmonitor.add(JLMnumeroDeSerie);

		JLMpolegadas.setText("Polegadas:");
		JLMpolegadas.setBounds(20, 170, 100, 30);
		JDmonitor.add(JLMpolegadas);

		JLMmarca.setText("Marca:");
		JLMmarca.setBounds(300, 170, 70, 30);
		JDmonitor.add(JLMmarca);

		JTMcodigo.setBounds(100, 20, 90, 30);
		JDmonitor.add(JTMcodigo);

		JCMsituacao.setBounds(390, 20, 150, 30);
		JDmonitor.add(JCMsituacao);

		JTMnome.setBounds(100, 70, 300, 30);
		JDmonitor.add(JTMnome);

		JTMnumeroDeSerie.setBounds(100, 120, 200, 30);
		JDmonitor.add(JTMnumeroDeSerie);

		JTMpolegadas.setBounds(100, 170, 50, 30);
		JDmonitor.add(JTMpolegadas);

		JTMmarca.setBounds(390, 170, 150, 30);
		JDmonitor.add(JTMmarca);

		JBMsalvar.setText("Salvar");
		JBMsalvar.setBounds(255, 430, 90, 30);
		JDmonitor.add(JBMsalvar);

		JDmonitor.setTitle("CADASTRO DE MONITOR");
		JDmonitor.setLayout(null);
		JDmonitor.setSize(600, 500);
		JDmonitor.setModal(true);
		JDmonitor.setResizable(false);
		JDmonitor.setLocationRelativeTo(null);

		// TELA DE CADASTRO DE NOBREAK
		JLNcodigo.setText("Código:");
		JLNcodigo.setBounds(20, 20, 100, 30);
		JDnobreak.add(JLNcodigo);

		JLNsituacao.setText("Situação:");
		JLNsituacao.setBounds(300, 20, 70, 30);
		JDnobreak.add(JLNsituacao);

		JLNnome.setText("Nome:");
		JLNnome.setBounds(20, 70, 70, 30);
		JDnobreak.add(JLNnome);

		JLNnumeroDeSerie.setText("Nº Série:");
		JLNnumeroDeSerie.setBounds(20, 120, 70, 30);
		JDnobreak.add(JLNnumeroDeSerie);

		JLNva.setText("VA:");
		JLNva.setBounds(20, 170, 70, 30);
		JDnobreak.add(JLNva);

		JLNmarca.setText("Marca:");
		JLNmarca.setBounds(300, 170, 70, 30);
		JDnobreak.add(JLNmarca);

		JTNcodigo.setBounds(100, 20, 90, 30);
		JDnobreak.add(JTNcodigo);

		JCNsituacao.setBounds(390, 20, 150, 30);
		JDnobreak.add(JCNsituacao);

		JTNnome.setBounds(100, 70, 300, 30);
		JDnobreak.add(JTNnome);

		JTNnumeroDeSerie.setBounds(100, 120, 200, 30);
		JDnobreak.add(JTNnumeroDeSerie);

		JTNva.setBounds(100, 170, 50, 30);
		JDnobreak.add(JTNva);

		JTNmarca.setBounds(390, 170, 150, 30);
		JDnobreak.add(JTNmarca);

		JBNsalvar.setText("Salvar");
		JBNsalvar.setBounds(255, 430, 90, 30);
		JDnobreak.add(JBNsalvar);

		JDnobreak.setTitle("CADASTRO DE NOBREAK");
		JDnobreak.setLayout(null);
		JDnobreak.setSize(600, 500);
		JDnobreak.setModal(true);
		JDnobreak.setResizable(false);
		JDnobreak.setLocationRelativeTo(null);

		// TELA DE CADASTRO DE TECLADO
		JLTcodigo.setText("Código:");
		JLTcodigo.setBounds(20, 20, 70, 30);
		JDtecldo.add(JLTcodigo);

		JLTsituacao.setText("Situação:");
		JLTsituacao.setBounds(300, 20, 70, 30);
		JDtecldo.add(JLTsituacao);

		JLTnome.setText("Nome:");
		JLTnome.setBounds(20, 70, 70, 30);
		JDtecldo.add(JLTnome);

		JLTnumeroDeSerie.setText("Nº Série:");
		JLTnumeroDeSerie.setBounds(20, 120, 70, 30);
		JDtecldo.add(JLTnumeroDeSerie);

		JLTtipo.setText("Conexão:");
		JLTtipo.setBounds(20, 170, 70, 30);
		JDtecldo.add(JLTtipo);

		JLTmarca.setText("Marca:");
		JLTmarca.setBounds(300, 170, 70, 30);
		JDtecldo.add(JLTmarca);

		JTTcodigo.setBounds(100, 20, 90, 30);
		JDtecldo.add(JTTcodigo);

		JCTsituacao.setBounds(390, 20, 150, 30);
		JDtecldo.add(JCTsituacao);

		JTTnome.setBounds(100, 70, 300, 30);
		JDtecldo.add(JTTnome);

		JTTnumeroDeSerie.setBounds(100, 120, 200, 30);
		JDtecldo.add(JTTnumeroDeSerie);

		JCTtipo.setBounds(100, 170, 50, 30);
		JDtecldo.add(JCTtipo);

		JTTmarca.setBounds(390, 170, 200, 30);
		JDtecldo.add(JTTmarca);

		JBTsalvar.setText("Salvar");
		JBTsalvar.setBounds(255, 430, 90, 30);
		JDtecldo.add(JBTsalvar);

		JDtecldo.setTitle("CADASTRO DE TECLADO");
		JDtecldo.setLayout(null);
		JDtecldo.setSize(600, 500);
		JDtecldo.setModal(true);
		JDtecldo.setResizable(false);
		JDtecldo.setLocationRelativeTo(null);

		// TELA DE CADASTRO DE MOUSE
		JLMOcodigo.setText("Código:");
		JLMOcodigo.setBounds(20, 20, 70, 30);
		JDmouse.add(JLMOcodigo);

		JLMOsituacao.setText("Situação:");
		JLMOsituacao.setBounds(300, 20, 70, 30);
		JDmouse.add(JLMOsituacao);

		JLMOnome.setText("Nome:");
		JLMOnome.setBounds(20, 70, 70, 30);
		JDmouse.add(JLMOnome);

		JLMOnumeroDeSerie.setText("Nº Série:");
		JLMOnumeroDeSerie.setBounds(20, 120, 70, 30);
		JDmouse.add(JLMOnumeroDeSerie);

		JLMOtipo.setText("Conexão:");
		JLMOtipo.setBounds(20, 170, 70, 30);
		JDmouse.add(JLMOtipo);

		JLMOmarca.setText("Marca:");
		JLMOmarca.setBounds(300, 170, 70, 30);
		JDmouse.add(JLMOmarca);

		JTMOcodigo.setBounds(100, 20, 90, 30);
		JDmouse.add(JTMOcodigo);

		JCMOsituacao.setBounds(390, 20, 150, 30);
		JDmouse.add(JCMOsituacao);

		JTMOnome.setBounds(100, 70, 300, 30);
		JDmouse.add(JTMOnome);

		JTMOnumeroDeSerie.setBounds(100, 120, 200, 30);
		JDmouse.add(JTMOnumeroDeSerie);

		JCMOtipo.setBounds(100, 170, 50, 30);
		JDmouse.add(JCMOtipo);

		JTMOmarca.setBounds(390, 170, 200, 30);
		JDmouse.add(JTMOmarca);

		JBMOsalvar.setText("Salvar");
		JBMOsalvar.setBounds(255, 430, 90, 30);
		JDmouse.add(JBMOsalvar);

		JDmouse.setTitle("CADASTRO DE MOUSE");
		JDmouse.setLayout(null);
		JDmouse.setSize(600, 500);
		JDmouse.setModal(true);
		JDmouse.setResizable(false);
		JDmouse.setLocationRelativeTo(null);

		// TELA DE CADASTRO DE BALANÇA
		JLBcodigo.setText("Código:");
		JLBcodigo.setBounds(20, 20, 70, 30);
		JDbalanca.add(JLBcodigo);

		JLBsituacao.setText("Situação:");
		JLBsituacao.setBounds(300, 20, 70, 30);
		JDbalanca.add(JLBsituacao);

		JLBnome.setText("Nome:");
		JLBnome.setBounds(20, 70, 70, 30);
		JDbalanca.add(JLBnome);

		JLBnumeroDeSerie.setText("Nº Série:");
		JLBnumeroDeSerie.setBounds(20, 120, 70, 30);
		JDbalanca.add(JLBnumeroDeSerie);

		JLBtipo.setText("Conexão:");
		JLBtipo.setBounds(20, 170, 70, 30);
		JDbalanca.add(JLBtipo);

		JLBmarca.setText("Marca:");
		JLBmarca.setBounds(20, 220, 70, 30);
		JDbalanca.add(JLBmarca);

		JLBmodelo.setText("Modelo:");
		JLBmodelo.setBounds(320, 220, 70, 30);
		JDbalanca.add(JLBmodelo);

		JTBcodigo.setBounds(100, 20, 90, 30);
		JDbalanca.add(JTBcodigo);

		JCBsituacao.setBounds(390, 20, 150, 30);
		JDbalanca.add(JCBsituacao);

		JTBnome.setBounds(100, 70, 300, 30);
		JDbalanca.add(JTBnome);

		JTBnumeroDeSerie.setBounds(100, 120, 200, 30);
		JDbalanca.add(JTBnumeroDeSerie);

		JCBtipo.setBounds(100, 170, 50, 30);
		JDbalanca.add(JCBtipo);

		JTBmarca.setBounds(100, 220, 150, 30);
		JDbalanca.add(JTBmarca);

		JTBmodelo.setBounds(390, 220, 150, 30);
		JDbalanca.add(JTBmodelo);

		JBBsalvar.setText("Salvar");
		JBBsalvar.setBounds(255, 430, 90, 30);
		JDbalanca.add(JBBsalvar);

		JDbalanca.setTitle("CADASTRO DE BALANÇA");
		JDbalanca.setLayout(null);
		JDbalanca.setSize(600, 500);
		JDbalanca.setModal(true);
		JDbalanca.setResizable(false);
		JDbalanca.setLocationRelativeTo(null);

		// TELA DE CADASTRO DE GAVETA
		JLGcodigo.setText("Código:");
		JLGcodigo.setBounds(20, 20, 70, 30);
		JDgaveta.add(JLGcodigo);

		JLGsituacao.setText("Situação:");
		JLGsituacao.setBounds(300, 20, 70, 30);
		JDgaveta.add(JLGsituacao);

		JLGnome.setText("Nome:");
		JLGnome.setBounds(20, 70, 70, 30);
		JDgaveta.add(JLGnome);

		JLGnumeroDeSerie.setText("Nº Série:");
		JLGnumeroDeSerie.setBounds(20, 120, 70, 30);
		JDgaveta.add(JLGnumeroDeSerie);

		JLGmarca.setText("Marca:");
		JLGmarca.setBounds(20, 170, 70, 30);
		JDgaveta.add(JLGmarca);

		JLGmodelo.setText("Modelo:");
		JLGmodelo.setBounds(320, 170, 70, 30);
		JDgaveta.add(JLGmodelo);

		JTGcodigo.setBounds(100, 20, 90, 30);
		JDgaveta.add(JTGcodigo);

		JCGsituacao.setBounds(390, 20, 150, 30);
		JDgaveta.add(JCGsituacao);

		JTGnome.setBounds(100, 70, 300, 30);
		JDgaveta.add(JTGnome);

		JTGnumeroDeSerie.setBounds(100, 120, 200, 30);
		JDgaveta.add(JTGnumeroDeSerie);

		JTGmarca.setBounds(100, 170, 150, 30);
		JDgaveta.add(JTGmarca);

		JTGmodelo.setBounds(390, 170, 150, 30);
		JDgaveta.add(JTGmodelo);

		JBGsalvar.setText("Salvar");
		JBGsalvar.setBounds(255, 430, 90, 30);
		JDgaveta.add(JBGsalvar);

		JDgaveta.setTitle("CADASTRO DE GAVETA");
		JDgaveta.setLayout(null);
		JDgaveta.setSize(600, 500);
		JDgaveta.setModal(true);
		JDgaveta.setResizable(false);
		JDgaveta.setLocationRelativeTo(null);

		// TELA DE CADASTRO DE PIN PAD
		JLPPcodigo.setText("Código:");
		JLPPcodigo.setBounds(20, 20, 70, 30);
		JDpinpad.add(JLPPcodigo);

		JLPPsituacao.setText("Situação:");
		JLPPsituacao.setBounds(300, 20, 70, 30);
		JDpinpad.add(JLPPsituacao);

		JLPPnome.setText("Nome:");
		JLPPnome.setBounds(20, 70, 70, 30);
		JDpinpad.add(JLPPnome);

		JLPPnumeroDeSerie.setText("Nº Série:");
		JLPPnumeroDeSerie.setBounds(20, 120, 70, 30);
		JDpinpad.add(JLPPnumeroDeSerie);

		JLPPtipo.setText("Conexão:");
		JLPPtipo.setBounds(20, 170, 70, 30);
		JDpinpad.add(JLPPtipo);

		JLPPmarca.setText("Marca:");
		JLPPmarca.setBounds(20, 220, 70, 30);
		JDpinpad.add(JLPPmarca);

		JLPPmodelo.setText("Modelo:");
		JLPPmodelo.setBounds(300, 220, 70, 30);
		JDpinpad.add(JLPPmodelo);

		JTPPcodigo.setBounds(100, 20, 90, 30);
		JDpinpad.add(JTPPcodigo);

		JCPPsituacao.setBounds(390, 20, 150, 30);
		JDpinpad.add(JCPPsituacao);

		JTPPnome.setBounds(100, 70, 300, 30);
		JDpinpad.add(JTPPnome);

		JTPPnumeroDeSerie.setBounds(100, 120, 200, 30);
		JDpinpad.add(JTPPnumeroDeSerie);

		JCPPtipo.setBounds(100, 170, 100, 30);
		JDpinpad.add(JCPPtipo);

		JTPPmarca.setBounds(100, 220, 150, 30);
		JDpinpad.add(JTPPmarca);

		JTPPmodelo.setBounds(390, 220, 150, 30);
		JDpinpad.add(JTPPmodelo);

		JBPPsalvar.setText("Salvar");
		JBPPsalvar.setBounds(255, 430, 90, 30);
		JDpinpad.add(JBPPsalvar);

		JDpinpad.setTitle("CADASTRO DE PIN PAD");
		JDpinpad.setLayout(null);
		JDpinpad.setSize(600, 500);
		JDpinpad.setModal(true);
		JDpinpad.setResizable(false);
		JDpinpad.setLocationRelativeTo(null);

		// TELA DE CADASTRO DE LEITOR
		JLLcodigo.setText("Código:");
		JLLcodigo.setBounds(20, 20, 70, 30);
		JDleitor.add(JLLcodigo);

		JLLsituacao.setText("Situação:");
		JLLsituacao.setBounds(300, 20, 70, 30);
		JDleitor.add(JLLsituacao);

		JLLnome.setText("Nome:");
		JLLnome.setBounds(20, 70, 70, 30);
		JDleitor.add(JLLnome);

		JLLnumeroDeSerie.setText("Nº Série:");
		JLLnumeroDeSerie.setBounds(20, 120, 70, 30);
		JDleitor.add(JLLnumeroDeSerie);

		JLLtipo.setText("Conexão:");
		JLLtipo.setBounds(20, 170, 70, 30);
		JDleitor.add(JLLtipo);

		JLLmarca.setText("Marca:");
		JLLmarca.setBounds(20, 220, 70, 30);
		JDleitor.add(JLLmarca);

		JLLmodelo.setText("Modelo:");
		JLLmodelo.setBounds(300, 220, 70, 30);
		JDleitor.add(JLLmodelo);

		JTLcodigo.setBounds(100, 20, 90, 30);
		JDleitor.add(JTLcodigo);

		JCLsituacao.setBounds(390, 20, 150, 30);
		JDleitor.add(JCLsituacao);

		JTLnome.setBounds(100, 70, 300, 30);
		JDleitor.add(JTLnome);

		JTLnumeroDeSerie.setBounds(100, 120, 200, 30);
		JDleitor.add(JTLnumeroDeSerie);

		JCLtipo.setBounds(100, 170, 100, 30);
		JDleitor.add(JCLtipo);

		JTLmarca.setBounds(100, 220, 150, 30);
		JDleitor.add(JTLmarca);

		JTLmodelo.setBounds(390, 220, 150, 30);
		JDleitor.add(JTLmodelo);

		JBLsalvar.setText("Salvar");
		JBLsalvar.setBounds(255, 430, 90, 30);
		JDleitor.add(JBLsalvar);

		JDleitor.setTitle("CADASTRO DE LEITOR");
		JDleitor.setLayout(null);
		JDleitor.setSize(600, 500);
		JDleitor.setModal(true);
		JDleitor.setResizable(false);
		JDleitor.setLocationRelativeTo(null);
		
		// TELA DE CADASTRO DE IMPRESSORA
		JLIcodigo.setText("Código:");
		JLIcodigo.setBounds(20, 20, 70, 30);
		JDimpressora.add(JLIcodigo);

		JLIsituacao.setText("Situação:");
		JLIsituacao.setBounds(300, 20, 70, 30);
		JDimpressora.add(JLIsituacao);

		JLInome.setText("Nome:");
		JLInome.setBounds(20, 70, 70, 30);
		JDimpressora.add(JLInome);

		JLInumeroDeSerie.setText("Nº Série:");
		JLInumeroDeSerie.setBounds(20, 120, 70, 30);
		JDimpressora.add(JLInumeroDeSerie);

		JLItipo.setText("Conexão:");
		JLItipo.setBounds(20, 170, 70, 30);
		JDimpressora.add(JLItipo);

		JLImarca.setText("Marca:");
		JLImarca.setBounds(20, 220, 70, 30);
		JDimpressora.add(JLImarca);

		JLImodelo.setText("Modelo:");
		JLImodelo.setBounds(300, 220, 70, 30);
		JDimpressora.add(JLImodelo);

		JTIcodigo.setBounds(100, 20, 90, 30);
		JDimpressora.add(JTIcodigo);

		JCIsituacao.setBounds(390, 20, 150, 30);
		JDimpressora.add(JCIsituacao);

		JTInome.setBounds(100, 70, 300, 30);
		JDimpressora.add(JTInome);

		JTInumeroDeSerie.setBounds(100, 120, 200, 30);
		JDimpressora.add(JTInumeroDeSerie);

		JCItipo.setBounds(100, 170, 100, 30);
		JDimpressora.add(JCItipo);

		JTImarca.setBounds(100, 220, 150, 30);
		JDimpressora.add(JTImarca);

		JTImodelo.setBounds(390, 220, 150, 30);
		JDimpressora.add(JTImodelo);

		JBIsalvar.setText("Salvar");
		JBIsalvar.setBounds(255, 430, 90, 30);
		JDimpressora.add(JBIsalvar);

		JDimpressora.setTitle("CADASTRO DE IMPRESSORA");
		JDimpressora.setLayout(null);
		JDimpressora.setSize(600, 500);
		JDimpressora.setModal(true);
		JDimpressora.setResizable(false);
		JDimpressora.setLocationRelativeTo(null);

		JBempresa.setText("Empresa - F1");
		JBempresa.setMargin(new Insets(5, 5, 5, 5));
		JBempresa.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBempresa.setFocusable(false);
		JBempresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDempresa.setVisible(true);

			}
		});
		JTbarraDeMenu.add(JBempresa);

		JBPDV.setText("  PDV - F2  ");
		JBPDV.setMargin(new Insets(5, 5, 5, 5));
		JBPDV.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBPDV.setFocusable(false);
		JBPDV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDPDV.setVisible(true);

			}
		});
		JTbarraDeMenu.add(JBPDV);

		JBpc.setText("  PC - F3  ");
		JBpc.setMargin(new Insets(5, 5, 5, 5));
		JBpc.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBpc.setFocusable(false);
		JBpc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDpc.setVisible(true);

			}
		});
		JTbarraDeMenu.add(JBpc);

		JBmonitor.setText("Monitor - F4");
		JBmonitor.setMargin(new Insets(5, 5, 5, 5));
		JBmonitor.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBmonitor.setFocusable(false);
		JBmonitor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDmonitor.setVisible(true);

			}
		});
		JTbarraDeMenu.add(JBmonitor);

		JBnobreak.setText("Nobreak - F5");
		JBnobreak.setMargin(new Insets(5, 5, 5, 5));
		JBnobreak.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBnobreak.setFocusable(false);
		JBnobreak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDnobreak.setVisible(true);

			}
		});
		JTbarraDeMenu.add(JBnobreak);

		JBteclado.setText("Teclado - F6");
		JBteclado.setMargin(new Insets(5, 5, 5, 5));
		JBteclado.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBteclado.setFocusable(false);
		JBteclado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDtecldo.setVisible(true);

			}
		});
		JTbarraDeMenu.add(JBteclado);

		JBmouse.setText("Mouse - F7");
		JBmouse.setMargin(new Insets(5, 5, 5, 5));
		JBmouse.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBmouse.setFocusable(false);
		JBmouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDmouse.setVisible(true);

			}
		});
		JTbarraDeMenu.add(JBmouse);

		JBbalanca.setText("Balança - F8");
		JBbalanca.setMargin(new Insets(5, 5, 5, 5));
		JBbalanca.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBbalanca.setFocusable(false);
		JBbalanca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDbalanca.setVisible(true);

			}
		});
		JTbarraDeMenu.add(JBbalanca);

		JBgaveta.setText("Gaveta - F9");
		JBgaveta.setMargin(new Insets(5, 5, 5, 5));
		JBgaveta.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBgaveta.setFocusable(false);
		JBgaveta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDgaveta.setVisible(true);

			}
		});
		JTbarraDeMenu.add(JBgaveta);

		JBpinpad.setText("Pin Pad - F10");
		JBpinpad.setMargin(new Insets(5, 5, 5, 5));
		JBpinpad.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBpinpad.setFocusable(false);
		JBpinpad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDpinpad.setVisible(true);

			}
		});
		JTbarraDeMenu.add(JBpinpad);

		JBleitor.setText("Leitor - F11");
		JBleitor.setMargin(new Insets(5, 5, 5, 5));
		JBleitor.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBleitor.setFocusable(false);
		JBleitor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDleitor.setVisible(true);

			}
		});
		JTbarraDeMenu.add(JBleitor);

		JBimpressora.setText("Impressora - F12");
		JBimpressora.setMargin(new Insets(5, 5, 5, 5));
		JBimpressora.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBimpressora.setFocusable(false);
		JBimpressora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDimpressora.setVisible(true);

			}
		});
		JTbarraDeMenu.add(JBimpressora);

		add(JTbarraDeMenu, BorderLayout.NORTH);

		painel01.setLayout(null);
		painel01.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
		painel01.setBounds(10, 10, 700, 500);
		painel01.setVisible(true);
		add(painel01);

		JBcaixa01.setText("CAIXA01");
		JBcaixa01.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa01.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa01.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa01.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa01.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa01.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa01.setFocusable(false);
		JBcaixa01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa02.setText("CAIXA02");
		JBcaixa02.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa02.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa02.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa02.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa02.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa02.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa02.setFocusable(false);
		JBcaixa02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa03.setText("CAIXA03");
		JBcaixa03.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa03.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa03.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa03.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa03.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa03.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa03.setFocusable(false);
		JBcaixa03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa04.setText("CAIXA04");
		JBcaixa04.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa04.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa04.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa04.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa04.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa04.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa04.setFocusable(false);
		JBcaixa04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDempresa.setVisible(true);

			}
		});

		JBcaixa05.setText("CAIXA05");
		JBcaixa05.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa05.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa05.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa05.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa05.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa05.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa05.setFocusable(false);
		JBcaixa05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa06.setText("CAIXA06");
		JBcaixa06.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa06.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa06.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa06.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa06.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa06.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa06.setFocusable(false);
		JBcaixa06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa07.setText("CAIXA07");
		JBcaixa07.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa07.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa07.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa07.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa07.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa07.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa07.setFocusable(false);
		JBcaixa07.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa08.setText("CAIXA08");
		JBcaixa08.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa08.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa08.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa08.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa08.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa08.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa08.setFocusable(false);
		JBcaixa08.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa09.setText("CAIXA09");
		JBcaixa09.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa09.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa09.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa09.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa09.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa09.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa09.setFocusable(false);
		JBcaixa09.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa10.setText("CAIXA10");
		JBcaixa10.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa10.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa10.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa10.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa10.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa10.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa10.setFocusable(false);
		JBcaixa10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa11.setText("CAIXA11");
		JBcaixa11.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa11.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa11.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa11.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa11.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa11.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa11.setFocusable(false);
		JBcaixa11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa12.setText("CAIXA12");
		JBcaixa12.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa12.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa12.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa12.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa12.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa12.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa12.setFocusable(false);
		JBcaixa12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa13.setText("CAIXA13");
		JBcaixa13.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa13.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa13.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa13.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa13.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa13.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa13.setFocusable(false);
		JBcaixa13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa14.setText("CAIXA14");
		JBcaixa14.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa14.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa14.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa14.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa14.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa14.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa14.setFocusable(false);
		JBcaixa14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa15.setText("CAIXA15");
		JBcaixa15.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa15.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa15.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa15.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa15.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa15.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa15.setFocusable(false);
		JBcaixa15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa16.setText("CAIXA16");
		JBcaixa16.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa16.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa16.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa16.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa16.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa16.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa16.setFocusable(false);
		JBcaixa16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa17.setText("CAIXA17");
		JBcaixa17.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa17.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa17.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa17.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa17.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa17.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa17.setFocusable(false);
		JBcaixa17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa18.setText("CAIXA18");
		JBcaixa18.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa18.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa18.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa18.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa18.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa18.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa18.setFocusable(false);
		JBcaixa18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa19.setText("CAIXA19");
		JBcaixa19.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa19.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa19.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa19.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa19.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa19.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa19.setFocusable(false);
		JBcaixa19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa20.setText("CAIXA20");
		JBcaixa20.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa20.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa20.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa20.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa20.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa20.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa20.setFocusable(false);
		JBcaixa20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa21.setText("CAIXA21");
		JBcaixa21.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa21.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa21.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa21.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa21.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa21.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa21.setFocusable(false);
		JBcaixa21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa22.setText("CAIXA22");
		JBcaixa22.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa22.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa22.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa22.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa22.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa22.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa22.setFocusable(false);
		JBcaixa22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa23.setText("CAIXA23");
		JBcaixa23.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa23.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa23.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa23.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa23.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa23.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa23.setFocusable(false);
		JBcaixa23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa24.setText("CAIXA24");
		JBcaixa24.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa24.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa24.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa24.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa24.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa24.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa24.setFocusable(false);
		JBcaixa24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa25.setText("CAIXA25");
		JBcaixa25.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa25.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa25.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa25.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa25.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa25.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa25.setFocusable(false);
		JBcaixa25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa26.setText("CAIXA26");
		JBcaixa26.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa26.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa26.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa26.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa26.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa26.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa26.setFocusable(false);
		JBcaixa26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa27.setText("CAIXA27");
		JBcaixa27.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa27.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa27.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa27.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa27.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa27.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa27.setFocusable(false);
		JBcaixa27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa28.setText("CAIXA28");
		JBcaixa28.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa28.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa28.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa28.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa28.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa28.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa28.setFocusable(false);
		JBcaixa28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa29.setText("CAIXA29");
		JBcaixa29.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa29.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa29.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa29.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa29.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa29.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa29.setFocusable(false);
		JBcaixa29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa30.setText("CAIXA30");
		JBcaixa30.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa30.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa30.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa30.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa30.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa30.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa30.setFocusable(false);
		JBcaixa30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa31.setText("CAIXA31");
		JBcaixa31.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa31.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa31.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa31.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa31.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa31.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa31.setFocusable(false);
		JBcaixa31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa32.setText("CAIXA32");
		JBcaixa32.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa32.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa32.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa32.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa32.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa32.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa32.setFocusable(false);
		JBcaixa32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa33.setText("CAIXA33");
		JBcaixa33.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa33.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa33.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa33.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa33.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa33.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa33.setFocusable(false);
		JBcaixa33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa34.setText("CAIXA34");
		JBcaixa34.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa34.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa34.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa34.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa34.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa34.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa34.setFocusable(false);
		JBcaixa34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa35.setText("CAIXA35");
		JBcaixa35.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa35.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa35.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa35.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa35.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa35.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa35.setFocusable(false);
		JBcaixa35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa36.setText("CAIXA36");
		JBcaixa36.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa36.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa36.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa36.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa36.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa36.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa36.setFocusable(false);
		JBcaixa36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa37.setText("CAIXA37");
		JBcaixa37.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa37.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa37.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa37.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa37.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa37.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa37.setFocusable(false);
		JBcaixa37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa38.setText("CAIXA38");
		JBcaixa38.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa38.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa38.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa38.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa38.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa38.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa38.setFocusable(false);
		JBcaixa38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa39.setText("CAIXA39");
		JBcaixa39.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa39.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa39.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa39.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa39.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa39.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa39.setFocusable(false);
		JBcaixa39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JBcaixa40.setText("CAIXA40");
		JBcaixa40.setMargin(new Insets(5, 5, 5, 5));
		JBcaixa40.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JBcaixa40.setHorizontalTextPosition(SwingConstants.CENTER);
		JBcaixa40.setIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa40.setRolloverIcon(new ImageIcon(getClass().getResource("/imagens/pasta aberta.png")));
		JBcaixa40.setPressedIcon(new ImageIcon(getClass().getResource("/imagens/pasta.png")));
		JBcaixa40.setFocusable(false);
		JBcaixa40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		painel02.setLayout(new GridLayout(4, 10));
		painel02.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
		painel02.setBounds(10, 10, 1345, 380);
		painel02.setVisible(true);
		painel02.add(JBcaixa01);
		painel02.add(JBcaixa02);
		painel02.add(JBcaixa03);
		painel02.add(JBcaixa04);
		painel02.add(JBcaixa05);
		painel02.add(JBcaixa06);
		painel02.add(JBcaixa07);
		painel02.add(JBcaixa08);
		painel02.add(JBcaixa09);
		painel02.add(JBcaixa10);
		painel02.add(JBcaixa11);
		painel02.add(JBcaixa12);
		painel02.add(JBcaixa13);
		painel02.add(JBcaixa14);
		painel02.add(JBcaixa15);
		painel02.add(JBcaixa16);
		painel02.add(JBcaixa17);
		painel02.add(JBcaixa18);
		painel02.add(JBcaixa19);
		painel02.add(JBcaixa20);
		painel02.add(JBcaixa21);
		painel02.add(JBcaixa22);
		painel02.add(JBcaixa23);
		painel02.add(JBcaixa24);
		painel02.add(JBcaixa25);
		painel02.add(JBcaixa26);
		painel02.add(JBcaixa27);
		painel02.add(JBcaixa28);
		painel02.add(JBcaixa29);
		painel02.add(JBcaixa30);
		painel02.add(JBcaixa31);
		painel02.add(JBcaixa32);
		painel02.add(JBcaixa33);
		painel02.add(JBcaixa34);
		painel02.add(JBcaixa35);
		painel02.add(JBcaixa36);
		painel02.add(JBcaixa37);
		painel02.add(JBcaixa38);
		painel02.add(JBcaixa39);
		painel02.add(JBcaixa40);
		painel01.add(painel02);

		painel03.setLayout(null);
		painel03.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
		painel03.setBounds(10, 400, 1345, 300);
		painel03.setVisible(true);
		painel01.add(painel03);

		JLempresa.setText("Empresa:");
		JLempresa.setBounds(10, 5, 55, 40);
		painel03.add(JLempresa);

		JLpc.setText("PC:");
		JLpc.setBounds(10, 60, 40, 40);
		painel03.add(JLpc);

		JLmonitor.setText("Monitor:");
		JLmonitor.setBounds(10, 120, 70, 40);
		painel03.add(JLmonitor);

		JLnobreak.setText("Nobreak:");
		JLnobreak.setBounds(10, 180, 70, 40);
		painel03.add(JLnobreak);

		JLteclado.setText("Teclado:");
		JLteclado.setBounds(340, 60, 70, 40);
		painel03.add(JLteclado);

		JLmouse.setText("Mouse:");
		JLmouse.setBounds(340, 120, 70, 40);
		painel03.add(JLmouse);

		JLpinpad.setText("Pin Pad:");
		JLpinpad.setBounds(340, 180, 70, 40);
		painel03.add(JLpinpad);

		JLleitor.setText("Leitor:");
		JLleitor.setBounds(700, 60, 70, 40);
		painel03.add(JLleitor);

		JLbalanca.setText("Balança:");
		JLbalanca.setBounds(700, 120, 70, 40);
		painel03.add(JLbalanca);

		JLgaveta.setText("Gaveta:");
		JLgaveta.setBounds(700, 180, 70, 40);
		painel03.add(JLgaveta);

		JLimpressora.setText("Impressora:");
		JLimpressora.setBounds(1050, 60, 70, 40);
		painel03.add(JLimpressora);

		JCpc.setBounds(70, 65, 200, 30);
		painel03.add(JCpc);

		JCmonitor.setBounds(70, 125, 200, 30);
		painel03.add(JCmonitor);

		JCnobreak.setBounds(70, 185, 200, 30);
		painel03.add(JCnobreak);

		JCteclado.setBounds(410, 65, 200, 30);
		painel03.add(JCteclado);

		JCmouse.setBounds(410, 125, 200, 30);
		painel03.add(JCmouse);

		JCpinpad.setBounds(410, 185, 200, 30);
		painel03.add(JCpinpad);

		JCleitor.setBounds(770, 65, 200, 30);
		painel03.add(JCleitor);

		JCbalanca.setBounds(770, 125, 200, 30);
		painel03.add(JCbalanca);

		JCgaveta.setBounds(770, 185, 200, 30);
		painel03.add(JCgaveta);

		JCimpressora.setBounds(1135, 65, 200, 30);
		painel03.add(JCimpressora);
		
		JScrollPane JSempresa = new JScrollPane(JTempresa);
		JSempresa.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		JSempresa.setBounds(10, 200, 580, 210);
		JSempresa.setVisible(true);
		JDempresa.add(JSempresa);
		
		JScrollPane JSpc = new JScrollPane(JTpc);
		JSpc.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		JSpc.setBounds(10, 210, 580, 210);
		JSpc.setVisible(true);
		JDpc.add(JSpc);
		
		JScrollPane JSmonitor = new JScrollPane(JTmonitor);
		JSmonitor.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		JSmonitor.setBounds(10, 210, 580, 210);
		JSmonitor.setVisible(true);
		JDmonitor.add(JSmonitor);
		
		JScrollPane JSnobreak = new JScrollPane(JTnobreak);
		JSnobreak.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		JSnobreak.setBounds(10, 210, 580, 210);
		JSnobreak.setVisible(true);
		JDnobreak.add(JSnobreak);
		
		JScrollPane JSteclado = new JScrollPane(JTteclado);
		JSteclado.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		JSteclado.setBounds(10, 210, 580, 210);
		JSteclado.setVisible(true);
		JDtecldo.add(JSteclado);
		
		JScrollPane JSmouse = new JScrollPane(JTmouse);
		JSmouse.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		JSmouse.setBounds(10, 210, 580, 210);
		JSmouse.setVisible(true);
		JDmouse.add(JSmouse);
		
		JScrollPane JSpinpad = new JScrollPane(JTpinpad);
		JSpinpad.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		JSpinpad.setBounds(10, 260, 580, 150);
		JSpinpad.setVisible(true);
		JDpinpad.add(JSpinpad);
		
		JScrollPane JSleitor = new JScrollPane(JTleitor);
		JSleitor.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		JSleitor.setBounds(10, 260, 580, 150);
		JSleitor.setVisible(true);
		JDleitor.add(JSleitor);
		
		JScrollPane JSgaveta = new JScrollPane(JTgaveta);
		JSgaveta.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		JSgaveta.setBounds(10, 210, 580, 210);
		JSgaveta.setVisible(true);
		JDgaveta.add(JSgaveta);
		
		JScrollPane JSbalanca = new JScrollPane(JTbalanca);
		JSbalanca.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		JSbalanca.setBounds(10, 260, 580, 150);
		JSbalanca.setVisible(true);
		JDbalanca.add(JSbalanca);
		
		JScrollPane JSimpressora = new JScrollPane(JTimpressora);
		JSimpressora.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		JSimpressora.setBounds(10, 260, 580, 150);
		JSimpressora.setVisible(true);
		JDimpressora.add(JSimpressora);
		

		setTitle("SISTEMA PDV");
		// setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
	}
	
	public void ListarTabela(String SQL) {
		ArrayList dados = new ArrayList();
		String[] colunas = new String[] { "CÓDIGO", "NUMERO", "NOME", "CNPJ" };
		conexaoDBEmpresa.executarSQL(SQL);
		try {
			// conexaoBD.rs.first();
			do {
				dados.add(new Object[] { conexaoDBEmpresa.rs.getInt("idempresa"), conexaoDBEmpresa.rs.getInt("codigo_empresa"),
						conexaoDBEmpresa.rs.getString("nome_empresa"), conexaoDBEmpresa.rs.getString("cnpj_empresa")});
			} while (conexaoDBEmpresa.rs.next());

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Tabela erro" + e.getMessage());
		}
	//	ModeloTabela modelo = new ModeloTabela(dados, colunas);
//		JTempresa.setModel(modelo);
		JTempresa.setRowHeight(30);// Responsável por almentar o espaso entre as
								// linhas
		JTempresa.getColumnModel().getColumn(0).setPreferredWidth(70);
		JTempresa.getColumnModel().getColumn(0).setResizable(false);
		JTempresa.getColumnModel().getColumn(1).setPreferredWidth(150);
		JTempresa.getColumnModel().getColumn(1).setResizable(!false);
		JTempresa.getColumnModel().getColumn(2).setPreferredWidth(180);
		JTempresa.getColumnModel().getColumn(2).setResizable(false);
		JTempresa.getColumnModel().getColumn(3).setPreferredWidth(425);
		JTempresa.getColumnModel().getColumn(3).setResizable(false);
		JTempresa.getTableHeader().setReorderingAllowed(false);
		JTempresa.setAutoResizeMode(JTempresa.AUTO_RESIZE_ALL_COLUMNS);
		JTempresa.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	}

	public static void main(String[] args) {
		new Principal();

	}

}
