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
	private final JLabel lblNewLabel = new JLabel("A)");
	private final JLabel lblB = new JLabel("B)");
	private final JLabel lblC = new JLabel("C)");
	private final JLabel lblD = new JLabel("D)");
	private final JLabel lblE = new JLabel("E)");
	private final JLabel lblNewLabel_1 = new JLabel("<html>Resposta<br/>Correta</html>");
	private final JRadioButton rbA = new JRadioButton("");
	private final JRadioButton rbB = new JRadioButton("");
	private final JRadioButton rbC = new JRadioButton("");
	private final JRadioButton rbD = new JRadioButton("");
	private final JRadioButton rbE = new JRadioButton("");
	private final JLabel lblNomeAutorPergunta = new JLabel("Nome Autor:");
	private final JLabel lblemailAutorPergunta = new JLabel("Email Autor:");
	private JTextField tfNomeAutorPergunta;
	private JTextField tfEmailAutorPergunta;
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
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tabbedPane.setLayout(new BorderLayout());
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane.setBounds(0, 0, 998, 709);
		contentPane.add(tabbedPane);
		
		tabbedPane.addTab("Criar Pergunta", null, pnCriarPergunta, null);
		pnCriarPergunta.setLayout(null);
		
		JLabel lblPergunta = new JLabel("Pergunta:");
		lblPergunta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPergunta.setBounds(26, 3, 68, 27);
		pnCriarPergunta.add(lblPergunta);
		
		TextArea textArea_1 = new TextArea();
		textArea_1.setBounds(22, 36, 946, 102);
		pnCriarPergunta.add(textArea_1);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(128, 188, 840, 69);
		pnCriarPergunta.add(textArea);
		
		TextArea textArea_2 = new TextArea();
		textArea_2.setBounds(128, 276, 840, 69);
		pnCriarPergunta.add(textArea_2);
		
		TextArea textArea_3 = new TextArea();
		textArea_3.setBounds(128, 453, 840, 69);
		pnCriarPergunta.add(textArea_3);
		
		TextArea textArea_4 = new TextArea();
		textArea_4.setBounds(128, 367, 840, 69);
		pnCriarPergunta.add(textArea_4);
		textArea_5.setBounds(128, 539, 840, 69);
		
		pnCriarPergunta.add(textArea_5);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(26, 188, 25, 34);
		
		pnCriarPergunta.add(lblNewLabel);
		lblB.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblB.setBounds(26, 276, 25, 34);
		
		pnCriarPergunta.add(lblB);
		lblC.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblC.setBounds(26, 367, 25, 34);
		
		pnCriarPergunta.add(lblC);
		lblD.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblD.setBounds(26, 453, 25, 34);
		
		pnCriarPergunta.add(lblD);
		lblE.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblE.setBounds(26, 539, 25, 34);
		
		pnCriarPergunta.add(lblE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(57, 157, 55, 27);
		
		pnCriarPergunta.add(lblNewLabel_1);
		
		
		rbA.setBounds(73, 201, 21, 21);
		pnCriarPergunta.add(rbA);
		rbB.setBounds(73, 289, 21, 21);
		
		pnCriarPergunta.add(rbB);
		rbD.setBounds(73, 466, 21, 21);
		
		pnCriarPergunta.add(rbD);
		rbC.setBounds(73, 378, 21, 21);
		
		pnCriarPergunta.add(rbC);
		rbE.setBounds(73, 552, 21, 21);
		
		pnCriarPergunta.add(rbE);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rbA);
		group.add(rbB);
		group.add(rbC);
		group.add(rbD);
		group.add(rbE);
		lblNomeAutorPergunta.setBounds(128, 626, 73, 27);
		
		pnCriarPergunta.add(lblNomeAutorPergunta);
		lblemailAutorPergunta.setBounds(491, 626, 68, 27);
		
		pnCriarPergunta.add(lblemailAutorPergunta);
		
		tfNomeAutorPergunta = new JTextField();
		tfNomeAutorPergunta.setBounds(210, 626, 238, 20);
		pnCriarPergunta.add(tfNomeAutorPergunta);
		tfNomeAutorPergunta.setColumns(10);
		
		tfEmailAutorPergunta = new JTextField();
		tfEmailAutorPergunta.setColumns(10);
		tfEmailAutorPergunta.setBounds(567, 626, 238, 20);
		pnCriarPergunta.add(tfEmailAutorPergunta);
		
		Button btnSalvarPergunta = new Button("Salvar");
		btnSalvarPergunta.setBounds(898, 631, 70, 22);
		pnCriarPergunta.add(btnSalvarPergunta);
		
		
		
		tabbedPane.addTab("Criar Questionario", null, pnCriarQuestionario, null);
		tabbedPane.addTab("Responder Questionario", null, pnResponderQuestionario, null);
		
		tabbedPane.addTab("New tab", null, panel_3, null);
	}
}
