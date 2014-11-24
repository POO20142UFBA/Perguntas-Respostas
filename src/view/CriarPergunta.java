package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;

import java.awt.TextArea;

import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import javax.swing.JScrollBar;

import java.awt.ScrollPane;
import java.awt.Panel;

import javax.swing.JRadioButton;
import javax.swing.JTree;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButtonMenuItem;

public class CriarPergunta extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar = new JMenuBar();
	private JMenu mnArquivo = new JMenu("Arquivo");
	private JMenuItem mntmSair = new JMenuItem("Sair");
	private JMenu mnAjuda = new JMenu("Ajuda");
	private JMenuItem mntmVerso = new JMenuItem("Vers\u00E3o");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CriarPergunta frame = new CriarPergunta();
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
	public CriarPergunta() {

		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Igor\\Documents\\workspace\\PergEResp\\PergEResp.jpg"));
		setTitle("Perguntas e Respostas");		
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
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdicioneUmPergunta = new JLabel("Crie uma Pergunta");
		lblAdicioneUmPergunta.setAutoscrolls(true);
		lblAdicioneUmPergunta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAdicioneUmPergunta.setBounds(285, 11, 153, 29);
		contentPane.add(lblAdicioneUmPergunta);
		
		JLabel lblPergunta = new JLabel("Pergunta:");
		lblPergunta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPergunta.setBounds(25, 46, 70, 17);
		contentPane.add(lblPergunta);
		
		JLabel lblResp_1 = new JLabel("<html>Resp. <br/> correta</html>");
		lblResp_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblResp_1.setBounds(38, 167, 46, 29);
		contentPane.add(lblResp_1);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(25, 69, 732, 81);
		contentPane.add(textArea);
		
		TextArea textArea_RespA = new TextArea();
		textArea_RespA.setBounds(80, 217, 677, 58);
		contentPane.add(textArea_RespA);
		
		TextArea textArea_RespB = new TextArea();
		textArea_RespB.setBounds(80, 281, 677, 58);
		contentPane.add(textArea_RespB);
		
		TextArea textArea_RespC = new TextArea();
		textArea_RespC.setBounds(80, 345, 677, 58);
		contentPane.add(textArea_RespC);
		
		TextArea textArea_RespD = new TextArea();
		textArea_RespD.setBounds(80, 409, 677, 58);
		contentPane.add(textArea_RespD);
		
		TextArea textArea_RespE = new TextArea();
		textArea_RespE.setBounds(80, 473, 677, 58);
		contentPane.add(textArea_RespE);
		
		JPanel rbPanel = new JPanel();
		ButtonGroup group = new ButtonGroup();
		
		
		
		JRadioButton rbRespA = new JRadioButton("");
		rbRespA.setBounds(53, 221, 21, 23);
		contentPane.add(rbRespA);
		group.add(rbRespA);
		
		JRadioButton rbRespB = new JRadioButton("");
		rbRespB.setBounds(53, 285, 21, 23);
		contentPane.add(rbRespB);
		group.add(rbRespB);
		
		JRadioButton rbRespC = new JRadioButton("");
		rbRespC.setBounds(53, 349, 21, 23);
		contentPane.add(rbRespC);
		group.add(rbRespC);
		
		JRadioButton rbRespD = new JRadioButton("");
		rbRespD.setBounds(53, 413, 21, 23);
		contentPane.add(rbRespD);
		group.add(rbRespD);
		
		JRadioButton rbRespE = new JRadioButton("");
		rbRespE.setBounds(53, 477, 21, 23);
		contentPane.add(rbRespE);
		group.add(rbRespE);
		
		JLabel lblA = new JLabel("A)");
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblA.setBounds(25, 225, 21, 19);
		contentPane.add(lblA);
		
		JLabel lblB = new JLabel("B)");
		lblB.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblB.setBounds(25, 289, 21, 19);
		contentPane.add(lblB);
		
		JLabel lblC = new JLabel("C)");
		lblC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblC.setBounds(25, 353, 21, 19);
		contentPane.add(lblC);
		
		JLabel lblD = new JLabel("D)");
		lblD.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblD.setBounds(25, 417, 21, 19);
		contentPane.add(lblD);
		
		JLabel lblD_1 = new JLabel("E)");
		lblD_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblD_1.setBounds(25, 481, 21, 19);
		contentPane.add(lblD_1);
		
		
		
		
		
		


	}
}
