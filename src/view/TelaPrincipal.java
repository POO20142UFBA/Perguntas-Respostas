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

import modelo.EscolherArquivo;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.Window.Type;
import javax.swing.border.BevelBorder;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar = new JMenuBar();
	private JMenu mnArquivo = new JMenu("Arquivo");
	private JMenuItem mntmSair = new JMenuItem("Sair");
	private JMenu mnAjuda = new JMenu("Ajuda");
	private JMenuItem mntmVerso = new JMenuItem("Vers\u00E3o");
	private final JButton btnAbrirProva = new JButton("Abrir Prova");
	private final JPanel pnCriarPergunta = new JPanel();
	private final JPanel pnCriarQuestionario = new JPanel();
	private final JPanel pnResponderQuestionario = new JPanel();
	private final JPanel panel_3 = new JPanel();
	private final TextArea textArea_5 = new TextArea();
	private final JLabel lblNewLabel = new JLabel("a)");
	private final JLabel lblB = new JLabel("b)");
	private final JLabel lblC = new JLabel("c)");
	private final JLabel lblD = new JLabel("d)");
	private final JLabel lblE = new JLabel("e)");
	private final JLabel lblNewLabel_1 = new JLabel("Resposta Correta");
	private final JRadioButton rbA = new JRadioButton("");
	private final JRadioButton rbB = new JRadioButton("");
	private final JRadioButton rbC = new JRadioButton("");
	private final JRadioButton rbD = new JRadioButton("");
	private final JRadioButton rbE = new JRadioButton("");
	private final JLabel lblNomeAutorPergunta = new JLabel("Nome Autor:");
	private final JLabel lblemailAutorPergunta = new JLabel("Email Autor:");
	private JTextField tfNomeAutorPergunta;
	private JTextField tfEmailAutorPergunta;
	private final JButton btnAbrir = new JButton("Abrir");
	private JTextField tfCaminho;
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
		
		tabbedPane.addTab("Criar Pergunta", null, pnCriarPergunta, null);
		tabbedPane.setEnabledAt(0, true);
		pnCriarPergunta.setLayout(null);
		
		JLabel lblPergunta = new JLabel("Pergunta:");
		lblPergunta.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPergunta.setBounds(26, 3, 121, 27);
		pnCriarPergunta.add(lblPergunta);
		
		TextArea textArea_1 = new TextArea();
		textArea_1.setBounds(22, 36, 772, 69);
		pnCriarPergunta.add(textArea_1);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(69, 139, 356, 69);
		pnCriarPergunta.add(textArea);
		
		TextArea textArea_2 = new TextArea();
		textArea_2.setBounds(69, 214, 356, 69);
		pnCriarPergunta.add(textArea_2);
		
		TextArea textArea_3 = new TextArea();
		textArea_3.setBounds(69, 364, 356, 69);
		pnCriarPergunta.add(textArea_3);
		
		TextArea textArea_4 = new TextArea();
		textArea_4.setBounds(69, 289, 356, 69);
		pnCriarPergunta.add(textArea_4);
		textArea_5.setBounds(69, 439, 356, 69);
		
		pnCriarPergunta.add(textArea_5);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(26, 139, 25, 34);
		
		pnCriarPergunta.add(lblNewLabel);
		lblB.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblB.setBounds(26, 214, 25, 34);
		
		pnCriarPergunta.add(lblB);
		lblC.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblC.setBounds(26, 289, 25, 34);
		
		pnCriarPergunta.add(lblC);
		lblD.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblD.setBounds(26, 364, 25, 34);
		
		pnCriarPergunta.add(lblD);
		lblE.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblE.setBounds(26, 439, 25, 34);
		
		pnCriarPergunta.add(lblE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(385, 106, 130, 27);
		
		pnCriarPergunta.add(lblNewLabel_1);
		
		
		rbA.setBounds(448, 161, 21, 21);
		pnCriarPergunta.add(rbA);
		rbB.setBounds(448, 237, 21, 21);
		
		pnCriarPergunta.add(rbB);
		rbD.setBounds(448, 387, 21, 21);
		
		pnCriarPergunta.add(rbD);
		rbC.setBounds(448, 317, 21, 21);
		
		pnCriarPergunta.add(rbC);
		rbE.setBounds(448, 452, 21, 21);
		
		pnCriarPergunta.add(rbE);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rbA);
		group.add(rbB);
		group.add(rbC);
		group.add(rbD);
		group.add(rbE);
		lblNomeAutorPergunta.setBounds(556, 111, 73, 21);
		
		pnCriarPergunta.add(lblNomeAutorPergunta);
		lblemailAutorPergunta.setBounds(556, 170, 68, 20);
		
		pnCriarPergunta.add(lblemailAutorPergunta);
		
		tfNomeAutorPergunta = new JTextField();
		tfNomeAutorPergunta.setBounds(556, 139, 238, 20);
		pnCriarPergunta.add(tfNomeAutorPergunta);
		tfNomeAutorPergunta.setColumns(10);
		
		tfEmailAutorPergunta = new JTextField();
		tfEmailAutorPergunta.setColumns(10);
		tfEmailAutorPergunta.setBounds(556, 199, 238, 20);
		pnCriarPergunta.add(tfEmailAutorPergunta);
		
		JButton btnSalvarPergunta = new JButton("Salvar");
		btnSalvarPergunta.setBounds(702, 467, 92, 41);
		pnCriarPergunta.add(btnSalvarPergunta);
		
//////////////// Arrumar 
		
		tabbedPane.addTab("Criar Questionário", null, pnCriarQuestionario, null);
		pnCriarQuestionario.setLayout(null);
		
		
		/*pnCriarQuestionario.add(btnAbrir);
		
		tfCaminho = new JTextField();
		tfCaminho.setBounds(41, 25, 436, 20);
		pnCriarQuestionario.add(tfCaminho);
		tfCaminho.setColumns(10);*/
		
		JTextArea taTeste = new JTextArea();
		taTeste.setBounds(55, 169, 536, 299);
		pnCriarQuestionario.add(taTeste);
		
		tabbedPane.addTab("Responder Questionário", null, pnResponderQuestionario, null);
		pnResponderQuestionario.setLayout(null);
		
		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EscolherArquivo ea = new EscolherArquivo();
				tfCaminho.setText(ea.buscarArquivoSalvar("prrs"));
				
				
			}
		});
		btnAbrir.setBounds(383, 56, 94, 23);
		
		tfCaminho = new JTextField();
		tfCaminho.setBounds(41, 25, 436, 20);
		pnResponderQuestionario.add(tfCaminho);
		tfCaminho.setColumns(10);
		pnResponderQuestionario.add(btnAbrir);
	}
}
