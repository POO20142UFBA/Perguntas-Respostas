package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;

import java.awt.GridLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import modelo.Arquivo;
import modelo.Pergunta;
import modelo.Resposta;

import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;


public class TelaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */

	/**
	 * 		OBJETOS DO MENU
	 */
		
		private JPanel contentPane;
		private JMenuBar menuBar = new JMenuBar();
		private JMenu mnArquivo = new JMenu("Arquivo");
		private JMenuItem mntmSair = new JMenuItem("Sair");
		private JMenu mnAjuda = new JMenu("Ajuda");
		private JMenuItem mntmVerso = new JMenuItem("Vers\u00E3o");
		private JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		
	/**
	 * 		FIM DOS OBJETOS DO MENU
	 */

	/**
	 * 		OBJETOS DA ABA "CRIAR PERGUNTA"
	 */
		
		private final JPanel cp_pnCriarPergunta = new JPanel();
		private final JLabel cp_lblPergunta = new JLabel("Pergunta:");
		private final JTextArea cp_textAreaPergunta = new JTextArea();
		private final JLabel cp_lblAltCorreta = new JLabel("Alternativa Correta");
		private final JTextArea cp_textAreaAltCorreta = new JTextArea();
		private final JLabel cp_lblAltFalsa1 = new JLabel("Alternativa Falsa 1");
		private final JTextArea cp_textAreaAltFalsa1 = new JTextArea();
		private final JLabel cp_lblAltFalsa2 = new JLabel("Alternativa Falsa 2");
		private final JTextArea cp_textAreaAltFalsa2 = new JTextArea();
		private final JLabel cp_lblAltFalsa3 = new JLabel("Alternativa Falsa 3");
		private final JTextArea cp_textAreaAltFalsa3 = new JTextArea();
		private final JLabel cp_lblAltFalsa4 = new JLabel("Alternativa Falsa 4");
		private final JTextArea cp_textAreaAltFalsa4 = new JTextArea();
		private final JButton cp_btnSalvarPergunta = new JButton("Salvar");
		private final JScrollPane cp_sptextAreaAltCorreta = new JScrollPane();
		private final JScrollPane cp_spTextAreaPergunta = new JScrollPane();
		private final JScrollPane cp_sptextAreaAltFalsa1 = new JScrollPane();
		private final JScrollPane cp_sptextAreaAltFalsa3 = new JScrollPane();
		private final JScrollPane cp_sptextAreaAltFalsa2 = new JScrollPane();
		private final JScrollPane cp_sptextAreaAltFalsa4 = new JScrollPane();
		
		
	/**
	 * 		FIM DOS OBJETOS DA ABA "CRIAR PERGUNTA"
	 */	
	
	/**
	 * 		OBJETOS DO ABA "CRIAR QUESTIONARIO"
	 */
		private final JButton cq_btnProximaQuestao = new JButton("Pr\u00F3xima");
		private final JPanel cq_pnCriarQuestionario = new JPanel();
		private final JButton cq_btnSalvarQuestionario = new JButton("Concluir e Salvar");
		private final JTextPane cq_textPaneExibePergunta = new JTextPane();
		private final JButton cq_btnAbrirPerguntas = new JButton("Abrir Perguntas");
		private final JButton cq_btnVoltar = new JButton("Anterior");
		private final JButton cq_btnAddQuestao = new JButton("Adicionar");
		private final JScrollPane cq_sptextPaneExibePergunta = new JScrollPane();
		
	/**
	 * 		FIM DOS OBJETOS DO  ABA "CRIAR QUESTIONARIO"
	 */	
		
	/**
	 * 		OBJETOS DO ABA "RESOLVER PROVA"
	 */

		private final JPanel rp_pnResolverProva = new JPanel();
		private final JRadioButton rp_rdbtnRespA = new JRadioButton("");
		private final JRadioButton rp_rdbtnRespB = new JRadioButton("");
		private final JRadioButton rp_rdbtnRespC = new JRadioButton("");
		private final JRadioButton rp_rdbtnRespD = new JRadioButton("");
		private final JRadioButton rp_rdbtnRespE = new JRadioButton("");
		private final ButtonGroup rp_btnGroup = new ButtonGroup();
		private final JTextPane rp_txtpnEnunciado = new JTextPane();
		private final JTextPane rp_txtpnRespA = new JTextPane();
		private final JTextPane rp_txtpnRespB = new JTextPane();
		private final JTextPane rp_txtpnRespD = new JTextPane();
		private final JTextPane rp_txtpnRespC = new JTextPane();
		private final JTextPane rp_txtpnRespE = new JTextPane();
		private final JButton rp_btnAbrirProva = new JButton("Abrir Prova");
		private final JButton rp_btnProxima = new JButton("Pr\u00F3xima");
		private final JButton rp_btnVoltar = new JButton("Anterior");
		private final JButton rp_btnSalvar = new JButton("Concluir");
		private final JScrollPane rp_sptxtpnEnunciado = new JScrollPane();
		private final JScrollPane rp_sptxtpnRespA = new JScrollPane();
		private final JScrollPane rp_sptxtpnRespB = new JScrollPane();
		private final JScrollPane rp_sptxtpnRespC = new JScrollPane();
		private final JScrollPane rp_sptxtpnRespD = new JScrollPane();
		private final JScrollPane rp_sptxtpnRespE = new JScrollPane();
		
	/**
	 * 		FIM DOS OBJETOS DO ABA "RESOLVER PROVA"
	 */
		
	/**
	 * 		VARIAVEIS GLOBAIS
	 */
		
		Arquivo arquivo = new Arquivo();
		List<Pergunta> listPergunta = new ArrayList<Pergunta>();
		List<Pergunta> listQuestionario = new ArrayList<Pergunta>();
		List<Resposta> listResposta = new ArrayList<Resposta>();
		List<JRadioButton> listRadioButton = new ArrayList<JRadioButton>();
		
		int correArrayPergunta = 0;
		int correArrayResposta = 0;


	/**
	 * 		FIM VARIAVEIS GLOBAIS
	 */


		
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						TelaPrincipal frame = new TelaPrincipal();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	
	/**
	 * Create the frame.
	 */
		
	public TelaPrincipal() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Igor\\git\\Perguntas-Respostas\\src\\notebook-and-pen.ico"));
		setTitle("Perguntas e Respostas");
		menuBar.setToolTipText("");
		
		setJMenuBar(menuBar);
		menuBar.add(mnArquivo);
		
		// Evento Botão Sair do Menu.
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});

		mntmVerso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,"Versão: 1.0.0\nDisciplina: Programação Orientada a Objertos.\nEquipe Xarás:\n  - Carla Drieli\n  - Edicarla\n  - Igor\n  - Laise\n  - Priscila");
			}
		});
		mnArquivo.add(mntmSair);
		menuBar.add(mnAjuda);
		mnAjuda.add(mntmVerso);		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 873, 632);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tabbedPane.setLayout(new BorderLayout());
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		contentPane.add(tabbedPane);
		
		//Aba Criar Pergunta
		tabbedPane.addTab("Criar Pergunta", null, cp_pnCriarPergunta, null);
		tabbedPane.setEnabledAt(0, true);
		
		//Aba Criar Questionario		
		tabbedPane.addTab("Criar Question\u00E1rio", null, cq_pnCriarQuestionario, null);
		cq_pnCriarQuestionario.setLayout(null);
		
		//Aba Resolver Prova
		tabbedPane.addTab("Resolver Prova", null, rp_pnResolverProva, null);
		rp_pnResolverProva.setLayout(null);
		
	/**
	 * 		FIM CONFIGURAÇÃO GERAL
	 */	

	/**
	 * 		CONFIGURAÇÃO ABA CRIA PERGUNTA
	 */
		
		cp_pnCriarPergunta.setBorder(null);
		cp_pnCriarPergunta.setLayout(null);
		
		cp_lblPergunta.setFont(new Font("Tahoma", Font.BOLD, 15));
		cp_lblPergunta.setBounds(26, 3, 121, 27);
		cp_pnCriarPergunta.add(cp_lblPergunta);
		cp_spTextAreaPergunta.setBounds(22, 36, 772, 69);
		
		cp_pnCriarPergunta.add(cp_spTextAreaPergunta);
		cp_textAreaPergunta.setWrapStyleWord(true);
		cp_textAreaPergunta.setLineWrap(true);
		cp_spTextAreaPergunta.setViewportView(cp_textAreaPergunta);
		cp_sptextAreaAltCorreta.setBounds(216, 139, 356, 69);
		
		cp_pnCriarPergunta.add(cp_sptextAreaAltCorreta);
		cp_sptextAreaAltCorreta.setViewportView(cp_textAreaAltCorreta);
		cp_textAreaAltCorreta.setSelectionEnd(50);
		cp_textAreaAltCorreta.setLineWrap(true);
		cp_textAreaAltCorreta.setWrapStyleWord(true);
		cp_sptextAreaAltFalsa1.setBounds(216, 214, 356, 69);
		
		cp_pnCriarPergunta.add(cp_sptextAreaAltFalsa1);
		cp_sptextAreaAltFalsa1.setViewportView(cp_textAreaAltFalsa1);
		cp_textAreaAltFalsa1.setWrapStyleWord(true);
		cp_textAreaAltFalsa1.setLineWrap(true);
		cp_sptextAreaAltFalsa3.setBounds(216, 364, 356, 69);
		
		cp_pnCriarPergunta.add(cp_sptextAreaAltFalsa3);
		cp_sptextAreaAltFalsa3.setViewportView(cp_textAreaAltFalsa3);
		cp_textAreaAltFalsa3.setWrapStyleWord(true);
		cp_textAreaAltFalsa3.setLineWrap(true);
		cp_sptextAreaAltFalsa2.setBounds(216, 289, 356, 69);
		
		cp_pnCriarPergunta.add(cp_sptextAreaAltFalsa2);
		cp_sptextAreaAltFalsa2.setViewportView(cp_textAreaAltFalsa2);
		cp_textAreaAltFalsa2.setWrapStyleWord(true);
		cp_textAreaAltFalsa2.setLineWrap(true);
		cp_sptextAreaAltFalsa4.setBounds(216, 439, 356, 69);
		
		cp_pnCriarPergunta.add(cp_sptextAreaAltFalsa4);
		cp_sptextAreaAltFalsa4.setViewportView(cp_textAreaAltFalsa4);
		cp_textAreaAltFalsa4.setWrapStyleWord(true);
		cp_textAreaAltFalsa4.setLineWrap(true);
		
		cp_lblAltCorreta.setFont(new Font("Tahoma", Font.BOLD, 15));
		cp_lblAltCorreta.setBounds(26, 139, 151, 34);
		
		cp_pnCriarPergunta.add(cp_lblAltCorreta);
		cp_lblAltFalsa1.setFont(new Font("Tahoma", Font.BOLD, 15));
		cp_lblAltFalsa1.setBounds(26, 215, 151, 34);
		
		cp_pnCriarPergunta.add(cp_lblAltFalsa1);
		cp_lblAltFalsa2.setFont(new Font("Tahoma", Font.BOLD, 15));
		cp_lblAltFalsa2.setBounds(26, 289, 151, 34);
		
		cp_pnCriarPergunta.add(cp_lblAltFalsa2);
		cp_lblAltFalsa3.setFont(new Font("Tahoma", Font.BOLD, 15));
		cp_lblAltFalsa3.setBounds(26, 364, 151, 34);
		
		cp_pnCriarPergunta.add(cp_lblAltFalsa3);
		cp_lblAltFalsa4.setFont(new Font("Tahoma", Font.BOLD, 15));
		cp_lblAltFalsa4.setBounds(26, 439, 151, 34);
		
		cp_pnCriarPergunta.add(cp_lblAltFalsa4);
		
		cp_btnSalvarPergunta.setBounds(702, 467, 92, 41);
		cp_pnCriarPergunta.add(cp_btnSalvarPergunta);
		
	/**
	 * 		FIM CONFIGURAÇÃO ABA CRIA PERGUNTA
	 */	
	
	/**
	 * 		CONFIGURAÇÃO ABA CRIA QUESTIONARIO
	 */	
		cq_sptextPaneExibePergunta.setBounds(26, 110, 666, 332);
		
		cq_pnCriarQuestionario.add(cq_sptextPaneExibePergunta);
		cq_sptextPaneExibePergunta.setViewportView(cq_textPaneExibePergunta);

		cq_textPaneExibePergunta.setEditable(false);
		cq_btnProximaQuestao.setBounds(702, 360, 89, 23);
		cq_pnCriarQuestionario.add(cq_btnProximaQuestao);
		cq_btnVoltar.setBounds(702, 394, 89, 23);
		cq_pnCriarQuestionario.add(cq_btnVoltar);
		cq_btnAbrirPerguntas.setBounds(26, 48, 125, 23);
		cq_pnCriarQuestionario.add(cq_btnAbrirPerguntas);
		cq_btnAddQuestao.setBounds(702, 170, 89, 23);
		cq_pnCriarQuestionario.add(cq_btnAddQuestao);
		cq_btnSalvarQuestionario.setBounds(663, 467, 131, 41);
		cq_pnCriarQuestionario.add(cq_btnSalvarQuestionario);

		rp_rdbtnRespA.setBounds(39, 176, 21, 23);
		rp_pnResolverProva.add(rp_rdbtnRespA);
		rp_rdbtnRespB.setBounds(38, 217, 21, 23);
		rp_pnResolverProva.add(rp_rdbtnRespB);	
		rp_rdbtnRespC.setBounds(39, 263, 21, 23);
		rp_pnResolverProva.add(rp_rdbtnRespC);
		rp_rdbtnRespD.setBounds(39, 306, 21, 23);
		rp_pnResolverProva.add(rp_rdbtnRespD);
		rp_rdbtnRespE.setBounds(39, 353, 21, 23);
		rp_pnResolverProva.add(rp_rdbtnRespE);
		rp_btnGroup.add(rp_rdbtnRespA);
		rp_btnGroup.add(rp_rdbtnRespB);
		rp_btnGroup.add(rp_rdbtnRespC);
		rp_btnGroup.add(rp_rdbtnRespD);
		rp_btnGroup.add(rp_rdbtnRespE);
		rp_sptxtpnEnunciado.setBounds(55, 59, 700, 61);
		
		rp_pnResolverProva.add(rp_sptxtpnEnunciado);
		rp_txtpnEnunciado.setEditable(false);
		rp_sptxtpnEnunciado.setViewportView(rp_txtpnEnunciado);
		rp_sptxtpnRespA.setBounds(99, 176, 656, 34);
		
		rp_pnResolverProva.add(rp_sptxtpnRespA);
		rp_txtpnRespA.setEditable(false);
		rp_sptxtpnRespA.setViewportView(rp_txtpnRespA);
		rp_sptxtpnRespB.setBounds(99, 220, 656, 34);
		
		rp_pnResolverProva.add(rp_sptxtpnRespB);
		rp_txtpnRespB.setEditable(false);
		rp_sptxtpnRespB.setViewportView(rp_txtpnRespB);
		rp_sptxtpnRespD.setBounds(99, 307, 656, 34);
		
		rp_pnResolverProva.add(rp_sptxtpnRespD);
		rp_txtpnRespD.setEditable(false);
		rp_sptxtpnRespD.setViewportView(rp_txtpnRespD);
		rp_sptxtpnRespC.setBounds(99, 263, 656, 34);
		
		rp_pnResolverProva.add(rp_sptxtpnRespC);
		rp_txtpnRespC.setEditable(false);
		rp_sptxtpnRespC.setViewportView(rp_txtpnRespC);
		rp_sptxtpnRespE.setBounds(99, 356, 656, 34);
		
		rp_pnResolverProva.add(rp_sptxtpnRespE);
		rp_txtpnRespE.setEditable(false);
		rp_sptxtpnRespE.setViewportView(rp_txtpnRespE);
		rp_btnAbrirProva.setBounds(39, 11, 107, 23);
		
		rp_pnResolverProva.add(rp_btnAbrirProva);

		rp_btnProxima.setBounds(477, 423, 89, 23);
		rp_pnResolverProva.add(rp_btnProxima);
		rp_btnVoltar.setBounds(331, 423, 89, 23);
		
		rp_pnResolverProva.add(rp_btnVoltar);
		rp_btnSalvar.setBounds(663, 467, 131, 41);
		rp_pnResolverProva.add(rp_btnSalvar);
		
		listRadioButton.add(rp_rdbtnRespA);
		listRadioButton.add(rp_rdbtnRespB);
		listRadioButton.add(rp_rdbtnRespC);
		listRadioButton.add(rp_rdbtnRespD);
		listRadioButton.add(rp_rdbtnRespE);

		
	/**
	 * 		FIM CONFIGURAÇÃO ABA RESOLVER PROVA
	 */	
		
	/**
	 * 		AÇÕES CRIA PERGUNTA
	 */	
		
		// Salva a Pergunta no Arquivo
		cp_btnSalvarPergunta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Se o campo pergunta e o campo Alternativa Correta estivarem vazios, entra no if
				if(cp_textAreaPergunta.getText().trim().equals("") || cp_textAreaAltCorreta.getText().trim().equals("")){
					JOptionPane.showMessageDialog(null,"Informe pelo menos a pergunta e a resposta correta.");
				}else{
					Pergunta pergunta = new Pergunta(
							cp_textAreaPergunta.getText(),
							cp_textAreaAltCorreta.getText(),
							cp_textAreaAltFalsa1.getText(),
							cp_textAreaAltFalsa2.getText(),
							cp_textAreaAltFalsa3.getText(),
							cp_textAreaAltFalsa4.getText()
							);	

					Arquivo arquivo = new Arquivo();
					try {
						arquivo.salvarArquivoPergunta(pergunta);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					cp_textAreaPergunta.setText(null);
					cp_textAreaAltCorreta.setText(null);
					cp_textAreaAltFalsa1.setText(null);
					cp_textAreaAltFalsa2.setText(null);
					cp_textAreaAltFalsa3.setText(null);
					cp_textAreaAltFalsa4.setText(null);
				}
			}
		});

		
	/**
	 * 		FIM AÇÕES CRIA PERGUNTA
	 */		


	/**
	 * 		AÇÕES CRIA QUESTIONARIO
	 */	
		
		// Seleciona o Próximo nó no ArrayList de Perguntas
		cq_btnProximaQuestao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(listPergunta.size() == 0){
					JOptionPane.showMessageDialog(null,"Abra um arquivo de perguntas primeiro.");
				}else{
				

				if (correArrayPergunta < listPergunta.size()-1){
					correArrayPergunta += 1;
				}				
				// Imprime Pergunta e Respostas no Textpane Exibir
				cq_textPaneExibePergunta.setText("Pergunta "+correArrayPergunta+
						"\n\n"+listPergunta.get(correArrayPergunta).getEnunciado().toString()+
						"\n\nA) "+listPergunta.get(correArrayPergunta).getAlternativas().get(0).getAlternativa().toString()+
						" - "+listPergunta.get(correArrayPergunta).getAlternativas().get(0).getEhCorreta()+
						"\nB) "+listPergunta.get(correArrayPergunta).getAlternativas().get(1).getAlternativa().toString()+
						" - "+listPergunta.get(correArrayPergunta).getAlternativas().get(1).getEhCorreta()+
						"\nC) "+listPergunta.get(correArrayPergunta).getAlternativas().get(2).getAlternativa().toString()+
						" - "+listPergunta.get(correArrayPergunta).getAlternativas().get(2).getEhCorreta()+
						"\nD) "+listPergunta.get(correArrayPergunta).getAlternativas().get(3).getAlternativa().toString()+
						" - "+listPergunta.get(correArrayPergunta).getAlternativas().get(3).getEhCorreta()+
						"\nE) "+listPergunta.get(correArrayPergunta).getAlternativas().get(4).getAlternativa().toString()+
						" - "+listPergunta.get(correArrayPergunta).getAlternativas().get(4).getEhCorreta());
				}
			}
		});
		
		// Seleciona o nó Anterior no ArrayList de Perguntas
		cq_btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(listPergunta.size() == 0){
					JOptionPane.showMessageDialog(null,"Abra um arquivo de perguntas primeiro.");
				}else{
				
				if (correArrayPergunta > 0){
					correArrayPergunta -= 1;
				}
				// Imprime Pergunta e Respostas no Textpane Exibir
				cq_textPaneExibePergunta.setText("Pergunta "+correArrayPergunta+
						"\n\n"+listPergunta.get(correArrayPergunta).getEnunciado().toString()+
						"\n\nA) "+listPergunta.get(correArrayPergunta).getAlternativas().get(0).getAlternativa().toString()+
						" - "+listPergunta.get(correArrayPergunta).getAlternativas().get(0).getEhCorreta()+
						"\nB) "+listPergunta.get(correArrayPergunta).getAlternativas().get(1).getAlternativa().toString()+
						" - "+listPergunta.get(correArrayPergunta).getAlternativas().get(1).getEhCorreta()+
						"\nC) "+listPergunta.get(correArrayPergunta).getAlternativas().get(2).getAlternativa().toString()+
						" - "+listPergunta.get(correArrayPergunta).getAlternativas().get(2).getEhCorreta()+
						"\nD) "+listPergunta.get(correArrayPergunta).getAlternativas().get(3).getAlternativa().toString()+
						" - "+listPergunta.get(correArrayPergunta).getAlternativas().get(3).getEhCorreta()+
						"\nE) "+listPergunta.get(correArrayPergunta).getAlternativas().get(4).getAlternativa().toString()+
						" - "+listPergunta.get(correArrayPergunta).getAlternativas().get(4).getEhCorreta());
				}
			}
		});
		
		// Abre o arquivo Perguntas e imprime na tela a primeira
		cq_btnAbrirPerguntas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					listPergunta = arquivo.lerArquivoPergunta();
					if(listPergunta.size() > 0){
						
						// Imprime Pergunta e Respostas no Textpane Exibir
						cq_textPaneExibePergunta.setText("Pergunta "+correArrayPergunta+
								"\n\n"+listPergunta.get(correArrayPergunta).getEnunciado().toString()+
								"\n\nA) "+listPergunta.get(correArrayPergunta).getAlternativas().get(0).getAlternativa().toString()+
								" - "+listPergunta.get(correArrayPergunta).getAlternativas().get(0).getEhCorreta()+
								"\nB) "+listPergunta.get(correArrayPergunta).getAlternativas().get(1).getAlternativa().toString()+
								" - "+listPergunta.get(correArrayPergunta).getAlternativas().get(1).getEhCorreta()+
								"\nC) "+listPergunta.get(correArrayPergunta).getAlternativas().get(2).getAlternativa().toString()+
								" - "+listPergunta.get(correArrayPergunta).getAlternativas().get(2).getEhCorreta()+
								"\nD) "+listPergunta.get(correArrayPergunta).getAlternativas().get(3).getAlternativa().toString()+
								" - "+listPergunta.get(correArrayPergunta).getAlternativas().get(3).getEhCorreta()+
								"\nE) "+listPergunta.get(correArrayPergunta).getAlternativas().get(4).getAlternativa().toString()+
								" - "+listPergunta.get(correArrayPergunta).getAlternativas().get(4).getEhCorreta());
					}
					
				} catch (IOException e1) {

					e1.printStackTrace();
				}
			}
		});
		
		// Insere A pergunta escolhida (botão Adicionar) na Lista que irá gerar os Questionários.
		cq_btnAddQuestao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Verifica Se a listPergunta foi Carregada para passar pra ListQuestionario
				if(listPergunta.size() > 0 && !listQuestionario.contains(listPergunta.get(correArrayPergunta))){
					listQuestionario.add(listPergunta.get(correArrayPergunta));
					JOptionPane.showMessageDialog(null, "Adicionado com sucesso!");
				}
			}
		});
		
		// Envia A lista Questionário para salvar em arquivo.
		cq_btnSalvarQuestionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(listQuestionario.size() > 0){
						arquivo.salvarArquivoQuestionario(listQuestionario);
						cq_textPaneExibePergunta.setText("");	
					}else{
						JOptionPane.showMessageDialog(null,"Adicione alguma pergunta no Questionário.");
					}
				
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		
	/**
	 * 		FIM AÇÕES CRIA QUESTIONARIO
	 */		

	/**
	 * 		AÇÕES RESPONDER PROVA
	 */		
		
		// Abrir A prova
		rp_btnAbrirProva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					listResposta.clear();
					rp_btnGroup.clearSelection();
					listQuestionario = arquivo.lerArquivoQuestionario();
					for(int i=0; i < listQuestionario.size(); i++){
					listResposta.add(new Resposta(listQuestionario.get(i).getEnunciado(),
							listQuestionario.get(i).getAlternativas().get(0).getAlternativa(),
							listQuestionario.get(i).getAlternativas().get(1).getAlternativa(),
							listQuestionario.get(i).getAlternativas().get(2).getAlternativa(),
							listQuestionario.get(i).getAlternativas().get(3).getAlternativa(),
							listQuestionario.get(i).getAlternativas().get(4).getAlternativa()));
					}
					
					arquivo.embaralhaAlternativas(listResposta);
					
					if(listQuestionario.size() > 0){
						rp_txtpnEnunciado.setText(listResposta.get(0).getEnunciado().toString());
						rp_txtpnRespA.setText(listResposta.get(0).getAlternativas().get(0).getAlternativa().toString());
						rp_txtpnRespB.setText(listResposta.get(0).getAlternativas().get(1).getAlternativa().toString());
						rp_txtpnRespC.setText(listResposta.get(0).getAlternativas().get(2).getAlternativa().toString());
						rp_txtpnRespD.setText(listResposta.get(0).getAlternativas().get(3).getAlternativa().toString());
						rp_txtpnRespE.setText(listResposta.get(0).getAlternativas().get(4).getAlternativa().toString());
					}
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		// Passar pro próximo nó da listResposta
		rp_btnProxima.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int jaMarcado =-1;
				if(listResposta.size() == 0){
					JOptionPane.showMessageDialog(null,"Abra um arquivo de prova primeiro.");
				}else{
					
					// Verifica Se algum dos Radiobutton ta selecionado, para antes de mudar pra próxima pergunta, salvar a resposta escolhida no nó da listResposta
					if(!rp_btnGroup.isSelected(null)){
						for(int i=0; i < listRadioButton.size(); i++){
							if(listRadioButton.get(i).isSelected()){
								listResposta.get(correArrayResposta).setrespostaAlternativa(i);
								break;
							}
						}
					}	
					
					if (correArrayResposta < listResposta.size()-1){
						correArrayResposta += 1;
					}
					// Verifica se a Pergunta já foi respondida pelo usuário
					jaMarcado = listResposta.get(correArrayResposta).getrespostaAlternativa();
					
					// Se getrespostaAlternativa() retornar valor entre 0 e 4, significa que o usuário já passou por essa questão e já respondeu.
					// Entra no If e habilita a alternativa (radioButton) escolhida pelo usuário previamente ou deixa os radioButton limpos, caso o usuário não tenha respondido ainda.
					if(jaMarcado > -1 && jaMarcado < 5){
						listRadioButton.get(jaMarcado).setSelected(true);
					}else{
						rp_btnGroup.clearSelection();
					}
					
					// Imprime na tela a pergunta e respostas do próximo nó
					rp_txtpnEnunciado.setText(listResposta.get(correArrayResposta).getEnunciado().toString());
					rp_txtpnRespA.setText(listResposta.get(correArrayResposta).getAlternativas().get(0).getAlternativa().toString());
					rp_txtpnRespB.setText(listResposta.get(correArrayResposta).getAlternativas().get(1).getAlternativa().toString());
					rp_txtpnRespC.setText(listResposta.get(correArrayResposta).getAlternativas().get(2).getAlternativa().toString());
					rp_txtpnRespD.setText(listResposta.get(correArrayResposta).getAlternativas().get(3).getAlternativa().toString());
					rp_txtpnRespE.setText(listResposta.get(correArrayResposta).getAlternativas().get(4).getAlternativa().toString());		
				}
			}
		});
		
		// Passar para o nó anterior da listResposta
		rp_btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int jaMarcado =-1;
				if(listResposta.size() == 0){
					JOptionPane.showMessageDialog(null,"Abra um arquivo de prova primeiro.");
				}else{
					// Verifica Se algum dos Radiobutton ta selecionado, para antes de mudar pra pergunta anterior, salvar a resposta escolhida no nó da listResposta
					if(!rp_btnGroup.isSelected(null)){
						for(int i=0; i < listRadioButton.size(); i++){
							if(listRadioButton.get(i).isSelected()){
								listResposta.get(correArrayResposta).setrespostaAlternativa(i);
								break;
							}
						}
					}
					if (correArrayResposta > 0){
						correArrayResposta -= 1;
					}
					// Verifica se a Pergunta já foi respondida pelo usuário
					jaMarcado = listResposta.get(correArrayResposta).getrespostaAlternativa();
					
					// Se getrespostaAlternativa() retornar valor entre 0 e 4, significa que o usuário já passou por essa questão e já respondeu.
					// Entra no If e habilita a alternativa (radioButton) escolhida pelo usuário previamente ou deixa os radioButton limpos, caso o usuário não tenha respondido ainda.
					if(jaMarcado > -1 && jaMarcado < 5){
						listRadioButton.get(jaMarcado).setSelected(true);
					}else{
						rp_btnGroup.clearSelection();
					}
					
					// Imprime na tela a pergunta e respostas do próximo nó
					rp_txtpnEnunciado.setText(listResposta.get(correArrayResposta).getEnunciado().toString());
					rp_txtpnRespA.setText(listResposta.get(correArrayResposta).getAlternativas().get(0).getAlternativa().toString());
					rp_txtpnRespB.setText(listResposta.get(correArrayResposta).getAlternativas().get(1).getAlternativa().toString());
					rp_txtpnRespC.setText(listResposta.get(correArrayResposta).getAlternativas().get(2).getAlternativa().toString());
					rp_txtpnRespD.setText(listResposta.get(correArrayResposta).getAlternativas().get(3).getAlternativa().toString());
					rp_txtpnRespE.setText(listResposta.get(correArrayResposta).getAlternativas().get(4).getAlternativa().toString());	
				}
			}
		});
		
		rp_btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int letraMarcada = -1;
				int letraCerta = -1;
				int questoesCertas = 0;
				
				if(listResposta.size() > 0){
					// Verifica Se o usuário respondeu a última pergunta, para antes de calcular a nota, salvar a resposta escolhida no nó da listResposta
					if(!rp_btnGroup.isSelected(null)){
						for(int i=0; i < listRadioButton.size(); i++){
							if(listRadioButton.get(i).isSelected()){
								listResposta.get(correArrayResposta).setrespostaAlternativa(i);
								break;
							}
						}
					}
					
					// Verifica qual indice da listAlternativas (dentro de Pergunta) que tem a propriedade ehCorreta igual a true
					// e compara com o indice do arrayList listRadioButton.
					// depois que as alternativas são embaralhadas (botão abrir prova), o indice o listRadioButton que o usuario marcou será compativel com o listAlternativa que é exibido na tela, por isso dá pra fazer essa comparação sem medo de errar.
					for(int i=0; i < listResposta.size(); i++){
						letraMarcada = listResposta.get(i).getrespostaAlternativa();
						
						for(int j=0; j < listResposta.get(i).getAlternativas().size(); j++ ){
							if(listResposta.get(i).getAlternativas().get(j).getEhCorreta() == true){
								letraCerta = j;
							}
						}
						if(letraMarcada > -1 && letraMarcada < 5){
							if(letraMarcada == letraCerta){
								questoesCertas += 1;
							}
						}					
					}
					JOptionPane.showMessageDialog(null,"Você Acertou "+questoesCertas+" de "
							+listResposta.size()+" questões.\n Sua Nota é: "+(double)questoesCertas*((double)10/listResposta.size()));
					rp_btnGroup.clearSelection();
					listResposta.clear();
					rp_txtpnEnunciado.setText("");
					rp_txtpnRespA.setText("");
					rp_txtpnRespB.setText("");
					rp_txtpnRespC.setText("");
					rp_txtpnRespD.setText("");
					rp_txtpnRespE.setText("");
				}else{
					JOptionPane.showMessageDialog(null,"Abra um arquivo de prova primeiro.");
				}
			}
		});
		
		
	/**
	 * 		FIM AÇÕES RESPONDER PROVA
	 */		
	}
}
