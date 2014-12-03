package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import java.awt.TextArea;

import javax.swing.DropMode;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.border.BevelBorder;
import javax.swing.JCheckBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSplitPane;

import modelo.Alternativa;
import modelo.Arquivo;
import modelo.Pergunta;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar = new JMenuBar();
	private JMenu mnArquivo = new JMenu("Arquivo");
	private JMenuItem mntmSair = new JMenuItem("Sair");
	private JMenu mnAjuda = new JMenu("Ajuda");
	private JMenuItem mntmVerso = new JMenuItem("Vers\u00E3o");
	private final JPanel pnCriarPergunta = new JPanel();
	private final JLabel lblPergunta = new JLabel("Pergunta:");
	private final TextArea textAreaPergunta = new TextArea();
	private final JLabel lblAltCorreta = new JLabel("Alternativa Correta");
	private final TextArea textAreaAltCorreta = new TextArea();
	private final JLabel lblAltFalsa1 = new JLabel("Alternativa Falsa 1");
	private final TextArea textAreaAltFalsa1 = new TextArea();
	private final JLabel lblAltFalsa2 = new JLabel("Alternativa Falsa 2");
	private final TextArea textAreaAltFalsa2 = new TextArea();
	private final JLabel lblAltFalsa3 = new JLabel("Alternativa Falsa 3");
	private final TextArea textAreaAltFalsa3 = new TextArea();
	private final JLabel lblAltFalsa4 = new JLabel("Alternativa Falsa 4");
	private final TextArea textAreaAltFalsa4 = new TextArea();
	private ArrayList<Alternativa> alternativasFalsas = new ArrayList<Alternativa>();
	private final JButton btnSalvar = new JButton("Salvar");
	private final JButton btnProximo = new JButton("Proximo");
	
	private final JPanel pnCriarQuestionario = new JPanel();
	private final JLabel lblRespA = new JLabel("");
	private final JLabel lblRespB = new JLabel("");
	private final JLabel lblRespD = new JLabel("");
	private final JLabel lblRespC = new JLabel("");
	private final JLabel lblRespE = new JLabel("");
	
	/**
	 * Launch the application.
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
		setResizable(false);
		setTitle("Perguntas e Respostas");
		menuBar.setToolTipText("");
		
		
		setJMenuBar(menuBar);
		menuBar.add(mnArquivo);
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
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tabbedPane.setLayout(new BorderLayout());
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		contentPane.add(tabbedPane);
		pnCriarPergunta.setBorder(null);
		
		
		//Aba Criar Pergunta
		tabbedPane.addTab("Criar Pergunta", null, pnCriarPergunta, null);
		tabbedPane.setEnabledAt(0, true);
		
		pnCriarPergunta.setLayout(null);
		
		
		lblPergunta.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPergunta.setBounds(26, 3, 121, 27);
		pnCriarPergunta.add(lblPergunta);
		
		textAreaPergunta.setBounds(22, 36, 772, 69);
		pnCriarPergunta.add(textAreaPergunta);
		
		
		textAreaAltCorreta.setBounds(216, 139, 356, 69);
		pnCriarPergunta.add(textAreaAltCorreta);
		
		
		textAreaAltFalsa1.setBounds(216, 214, 356, 69);
		pnCriarPergunta.add(textAreaAltFalsa1);
		
		
		textAreaAltFalsa3.setBounds(216, 364, 356, 69);
		pnCriarPergunta.add(textAreaAltFalsa3);
		
		
		textAreaAltFalsa2.setBounds(216, 289, 356, 69);
		pnCriarPergunta.add(textAreaAltFalsa2);
		
		textAreaAltFalsa4.setBounds(216, 439, 356, 69);
		pnCriarPergunta.add(textAreaAltFalsa4);
		
		lblAltCorreta.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAltCorreta.setBounds(26, 139, 151, 34);
		
		pnCriarPergunta.add(lblAltCorreta);
		lblAltFalsa1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAltFalsa1.setBounds(26, 215, 151, 34);
		
		pnCriarPergunta.add(lblAltFalsa1);
		lblAltFalsa2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAltFalsa2.setBounds(26, 289, 151, 34);
		
		pnCriarPergunta.add(lblAltFalsa2);
		lblAltFalsa3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAltFalsa3.setBounds(26, 364, 151, 34);
		
		pnCriarPergunta.add(lblAltFalsa3);
		lblAltFalsa4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAltFalsa4.setBounds(26, 439, 151, 34);
		
		pnCriarPergunta.add(lblAltFalsa4);
		
		JButton btnSalvarPergunta = new JButton("Salvar");
		btnSalvarPergunta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pergunta pergunta = new Pergunta(
						textAreaPergunta.getText(),
						textAreaAltCorreta.getText(),
						textAreaAltFalsa1.getText(),
						textAreaAltFalsa2.getText(),
						textAreaAltFalsa3.getText(),
						textAreaAltFalsa4.getText()
						);	

				Arquivo arquivo = new Arquivo();
				try {
					arquivo.salvarArquivoPergunta(pergunta);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				textAreaPergunta.setText(null);
				textAreaAltCorreta.setText(null);
				textAreaAltFalsa1.setText(null);
				textAreaAltFalsa2.setText(null);
				textAreaAltFalsa3.setText(null);
				textAreaAltFalsa4.setText(null);
				
			}
		});
		btnSalvarPergunta.setBounds(702, 467, 92, 41);
		pnCriarPergunta.add(btnSalvarPergunta);
		
		
		
		//Aba Criar Questionario		
		tabbedPane.addTab("Criar Questionario", null, pnCriarQuestionario, null);
		pnCriarQuestionario.setLayout(null);
		
		
		pnCriarQuestionario.add(btnSalvar);
		
		JLabel lblEnunciado = new JLabel("");
		lblEnunciado.setBounds(26, 27, 790, 78);
		pnCriarQuestionario.add(lblEnunciado);
		lblRespA.setBounds(77, 170, 705, 14);
		
		pnCriarQuestionario.add(lblRespA);
		lblRespB.setBounds(77, 211, 705, 14);
		
		pnCriarQuestionario.add(lblRespB);
		lblRespD.setBounds(77, 295, 705, 14);
		
		pnCriarQuestionario.add(lblRespD);
		lblRespC.setBounds(77, 254, 705, 14);
		
		pnCriarQuestionario.add(lblRespC);
		lblRespE.setBounds(77, 343, 705, 14);
		
		pnCriarQuestionario.add(lblRespE);
		


		btnProximo.setBounds(716, 420, 89, 23);
		pnCriarQuestionario.add(btnProximo);
		
		JLabel lblA = new JLabel("a");
		lblA.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblA.setBounds(10, 170, 46, 14);
		pnCriarQuestionario.add(lblA);
		
		JLabel lblB = new JLabel("b");
		lblB.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblB.setBounds(10, 211, 46, 14);
		pnCriarQuestionario.add(lblB);
		
		JLabel lblD = new JLabel("d");
		lblD.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblD.setBounds(10, 295, 46, 14);
		pnCriarQuestionario.add(lblD);
		
		JLabel lblC = new JLabel("c");
		lblC.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblC.setBounds(10, 254, 46, 14);
		pnCriarQuestionario.add(lblC);
		
		JLabel lblE = new JLabel("e");
		lblE.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblE.setBounds(10, 343, 46, 14);
		pnCriarQuestionario.add(lblE);
		
		JButton btnAbrirPerguntas = new JButton("Abrir Perguntas");
		btnAbrirPerguntas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Arquivo arquivo = new Arquivo();
				List<Pergunta> listPergunta = new ArrayList<Pergunta>();
				
				btnProximo.addActionListener(new ActionListener() {
					
					public boolean actionPerformed() {
						 return true;
					}

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
					}
				});				
				try {
					listPergunta = arquivo.lerArquivoPergunta();
					
					for (Pergunta pergunta : listPergunta) {
						lblEnunciado.setText(pergunta.getEnunciado().toString());
					}
					
					
					
					
					
					
				} catch (IOException e1) {

					e1.printStackTrace();
				} finally{
					System.out.println("oi");
				}
			}
		});
		btnAbrirPerguntas.setBounds(560, 420, 125, 23);
		pnCriarQuestionario.add(btnAbrirPerguntas);
		
		/*tfCaminho = new JTextField();
		tfCaminho.setBounds(181, 479, 436, 20);
		pnCriarQuestionario.add(tfCaminho);
		tfCaminho.setColumns(10);
		
		JTextArea taTeste = new JTextArea();
		taTeste.setBounds(67, 140, 334, 103);
		pnCriarQuestionario.add(taTeste);
		
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Arquivo ea = new Arquivo();
				tfCaminho.setText(ea.buscarArquivoSalvar("prrs"));
			}
		});
		btnSalvar.setBounds(685, 478, 94, 23);*/
	}
}
