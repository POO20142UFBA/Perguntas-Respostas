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

import java.awt.TextArea;
import java.awt.GridLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import modelo.Alternativa;
import modelo.Arquivo;
import modelo.Pergunta;
import modelo.Resposta;

import javax.swing.JRadioButton;


public class TelaPrincipal extends JFrame {

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
		private final TextArea cp_textAreaPergunta = new TextArea();
		private final JLabel cp_lblAltCorreta = new JLabel("Alternativa Correta");
		private final JTextArea cp_textAreaAltCorreta = new JTextArea();
		private final JLabel cp_lblAltFalsa1 = new JLabel("Alternativa Falsa 1");
		private final TextArea cp_textAreaAltFalsa1 = new TextArea();
		private final JLabel cp_lblAltFalsa2 = new JLabel("Alternativa Falsa 2");
		private final TextArea cp_textAreaAltFalsa2 = new TextArea();
		private final JLabel cp_lblAltFalsa3 = new JLabel("Alternativa Falsa 3");
		private final TextArea cp_textAreaAltFalsa3 = new TextArea();
		private final JLabel cp_lblAltFalsa4 = new JLabel("Alternativa Falsa 4");
		private final TextArea cp_textAreaAltFalsa4 = new TextArea();
		private final JButton cp_btnSalvarPergunta = new JButton("Salvar");
		
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
		private final JButton cq_btnVoltar = new JButton("Voltar");
		private final JButton cq_btnAddQuestao = new JButton("Adicionar");
		
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
		private final JButton rp_btnVoltar = new JButton("Voltar");
		private final JButton rp_btnSalvar = new JButton("Concluir e Salvar");
		
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
		
	/**
	 * 		CONFIGURA��O GERAL
	 */
		
		setResizable(false);
		setTitle("Perguntas e Respostas");
		menuBar.setToolTipText("");
		
		setJMenuBar(menuBar);
		menuBar.add(mnArquivo);
		
		// Evento Bot�o Sair do Menu.
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
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
	 * 		FIM CONFIGURA��O GERAL
	 */	

	/**
	 * 		CONFIGURA��O ABA CRIA PERGUNTA
	 */
		
		cp_pnCriarPergunta.setBorder(null);
		cp_pnCriarPergunta.setLayout(null);
		
		cp_lblPergunta.setFont(new Font("Tahoma", Font.BOLD, 15));
		cp_lblPergunta.setBounds(26, 3, 121, 27);
		cp_pnCriarPergunta.add(cp_lblPergunta);
		
		cp_textAreaPergunta.setBounds(22, 36, 772, 69);
		cp_pnCriarPergunta.add(cp_textAreaPergunta);
		cp_textAreaAltCorreta.setSelectionEnd(50);
		cp_textAreaAltCorreta.setLineWrap(true);
		cp_textAreaAltCorreta.setWrapStyleWord(true);
		
		cp_textAreaAltCorreta.setBounds(216, 139, 356, 69);
		cp_pnCriarPergunta.add(cp_textAreaAltCorreta);
		
		cp_textAreaAltFalsa1.setBounds(216, 214, 356, 69);
		cp_pnCriarPergunta.add(cp_textAreaAltFalsa1);
		
		cp_textAreaAltFalsa3.setBounds(216, 364, 356, 69);
		cp_pnCriarPergunta.add(cp_textAreaAltFalsa3);
		
		cp_textAreaAltFalsa2.setBounds(216, 289, 356, 69);
		cp_pnCriarPergunta.add(cp_textAreaAltFalsa2);
		
		cp_textAreaAltFalsa4.setBounds(216, 439, 356, 69);
		cp_pnCriarPergunta.add(cp_textAreaAltFalsa4);
		
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
	 * 		FIM CONFIGURA��O ABA CRIA PERGUNTA
	 */	
	
	/**
	 * 		CONFIGURA��O ABA CRIA QUESTIONARIO
	 */	

		cq_textPaneExibePergunta.setEditable(false);
		cq_textPaneExibePergunta.setBounds(26, 110, 666, 332);
		cq_pnCriarQuestionario.add(cq_textPaneExibePergunta);
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
		
	/**
	 * 		FIM CONFIGURA��O ABA CRIA QUESTIONARIO
	 */			
		
	/**
	 * 		CONFIGURA��O ABA RESOLVER PROVA
	 */	

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
		rp_txtpnEnunciado.setBounds(55, 59, 691, 61);
		
		rp_pnResolverProva.add(rp_txtpnEnunciado);
		rp_txtpnRespA.setBounds(99, 176, 647, 20);
		
		rp_pnResolverProva.add(rp_txtpnRespA);
		rp_txtpnRespB.setBounds(99, 220, 647, 20);
		
		rp_pnResolverProva.add(rp_txtpnRespB);
		rp_txtpnRespD.setBounds(99, 307, 647, 20);
		
		rp_pnResolverProva.add(rp_txtpnRespD);
		rp_txtpnRespC.setBounds(99, 263, 647, 20);
		
		rp_pnResolverProva.add(rp_txtpnRespC);
		rp_txtpnRespE.setBounds(99, 356, 647, 20);
		
		rp_pnResolverProva.add(rp_txtpnRespE);
		rp_btnAbrirProva.setBounds(39, 11, 89, 23);
		
		rp_pnResolverProva.add(rp_btnAbrirProva);

		rp_btnProxima.setBounds(477, 423, 89, 23);
		rp_pnResolverProva.add(rp_btnProxima);
		rp_btnVoltar.setBounds(175, 423, 89, 23);
		
		rp_pnResolverProva.add(rp_btnVoltar);
		rp_btnSalvar.setBounds(151, 11, 113, 23);
		
		rp_pnResolverProva.add(rp_btnSalvar);
		
	/**
	 * 		FIM CONFIGURA��O ABA RESOLVER PROVA
	 */	
		
	/**
	 * 		A��ES CRIA PERGUNTA
	 */	
		
		// Salva a Pergunta no Arquivo
		cp_btnSalvarPergunta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

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
		});

		
	/**
	 * 		FIM A��ES CRIA PERGUNTA
	 */		


	/**
	 * 		A��ES CRIA QUESTIONARIO
	 */	
		
		// Seleciona o Pr�ximo n� no ArrayList de Perguntas
		cq_btnProximaQuestao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(listPergunta.size() == 0){
					JOptionPane.showMessageDialog(null,"Abra um arquivo de perguntas primeiro.");
				}else{
				

				if (correArrayPergunta < listPergunta.size()-1){
					correArrayPergunta += 1;
				}				

				cq_textPaneExibePergunta.setText("Pergunta "+correArrayPergunta+
						"\n\n"+
						listPergunta.get(correArrayPergunta).getEnunciado().toString()+
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
		
		// Seleciona o n� Anterior no ArrayList de Perguntas
		cq_btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(listPergunta.size() == 0){
					JOptionPane.showMessageDialog(null,"Abra um arquivo de perguntas primeiro.");
				}else{
				
				if (correArrayPergunta > 0){
					correArrayPergunta -= 1;
				}

				cq_textPaneExibePergunta.setText("Pergunta "+correArrayPergunta+
						"\n\n"+
						listPergunta.get(correArrayPergunta).getEnunciado().toString()+
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
						
						cq_textPaneExibePergunta.setText("Pergunta "+correArrayPergunta+
								"\n\n"+
								listPergunta.get(correArrayPergunta).getEnunciado().toString()+
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
		
		// Insere A pergunta escolhida (bot�o Adicionar) na Lista que ir� gerar os Question�rios.
		cq_btnAddQuestao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(listPergunta.size() > 0 && !listQuestionario.contains(listPergunta.get(correArrayPergunta))){
					listQuestionario.add(listPergunta.get(correArrayPergunta));
				}
			}
		});
		
		// Envia A lista Question�rio para salvar em arquivo.
		cq_btnSalvarQuestionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					arquivo.salvarArquivoQuestionario(listQuestionario);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		
	/**
	 * 		FIM A��ES CRIA QUESTIONARIO
	 */		

	/**
	 * 		A��ES RESPONDER PROVA
	 */		
		
		rp_btnAbrirProva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
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
					System.out.println(rp_rdbtnRespA.isSelected());
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		rp_btnProxima.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(listResposta.size() == 0){
					JOptionPane.showMessageDialog(null,"Abra um arquivo de prova primeiro.");
				}else{

				//se tem algum radiobutton selecionado -===>>>> CONTINUAR AQUIIIIIIIIIIIIIIIIII !!!!!
				if(!rp_btnGroup.isSelected(null)){
					int resp = -1;
					if(!rp_rdbtnRespA.isEnabled()){
						resp = 0;
					}else{
						if(!rp_rdbtnRespB.isEnabled()){
							resp = 1;
						}else{
							if(!rp_rdbtnRespC.isEnabled()){
								resp = 2;
							}else{
								if(!rp_rdbtnRespD.isEnabled()){
									resp = 3;
								}else{
									if(!rp_rdbtnRespE.isEnabled()){
										resp = 4;
									}
								}
							}
						}	
					}
					listResposta.get(correArrayResposta).setrespostaAlternativa(resp);
				}
				
				rp_btnGroup.clearSelection();
				System.out.println(listResposta.get(correArrayResposta).getrespostaAlternativa());
				
					
				if (correArrayResposta < listResposta.size()-1){
					correArrayResposta += 1;
				}

					rp_txtpnEnunciado.setText(listResposta.get(correArrayResposta).getEnunciado().toString());
					rp_txtpnRespA.setText(listResposta.get(correArrayResposta).getAlternativas().get(0).getAlternativa().toString());
					rp_txtpnRespB.setText(listResposta.get(correArrayResposta).getAlternativas().get(1).getAlternativa().toString());
					rp_txtpnRespC.setText(listResposta.get(correArrayResposta).getAlternativas().get(2).getAlternativa().toString());
					rp_txtpnRespD.setText(listResposta.get(correArrayResposta).getAlternativas().get(3).getAlternativa().toString());
					rp_txtpnRespE.setText(listResposta.get(correArrayResposta).getAlternativas().get(4).getAlternativa().toString());		
				}
			}
		});
		
		rp_btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(listResposta.size() == 0){
					JOptionPane.showMessageDialog(null,"Abra um arquivo de prova primeiro.");
				}else{
				if (correArrayResposta > 0){
					correArrayResposta -= 1;
				}
				rp_txtpnEnunciado.setText(listResposta.get(correArrayResposta).getEnunciado().toString());
				rp_txtpnRespA.setText(listResposta.get(correArrayResposta).getAlternativas().get(0).getAlternativa().toString());
				rp_txtpnRespB.setText(listResposta.get(correArrayResposta).getAlternativas().get(1).getAlternativa().toString());
				rp_txtpnRespC.setText(listResposta.get(correArrayResposta).getAlternativas().get(2).getAlternativa().toString());
				rp_txtpnRespD.setText(listResposta.get(correArrayResposta).getAlternativas().get(3).getAlternativa().toString());
				rp_txtpnRespE.setText(listResposta.get(correArrayResposta).getAlternativas().get(4).getAlternativa().toString());	
				}
			}
		});
		
	/**
	 * 		FIM A��ES RESPONDER PROVA
	 */		
	}
}
