package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar = new JMenuBar();
	private JMenu mnArquivo = new JMenu("Arquivo");
	private JMenuItem mntmSair = new JMenuItem("Sair");
	private JMenu mnAjuda = new JMenu("Ajuda");
	private JMenuItem mntmVerso = new JMenuItem("Vers\u00E3o");
	private final JButton btnAbrirProva = new JButton("Abrir Prova");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		//setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Igor\\Documents\\workspace\\PergEResp\\PergEResp.jpg"));
		setTitle("Perguntas e Respostas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		
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
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCriarPergunta = new JButton("Criar Pergunta");
		btnCriarPergunta.setBounds(49, 167, 140, 35);
		contentPane.add(btnCriarPergunta);
		
		JButton btnCriarProva = new JButton("Criar Prova");
		btnCriarProva.setBounds(49, 240, 140, 35);
		contentPane.add(btnCriarProva);
		
		JButton btnResponderProva = new JButton("Responder Prova");
		btnResponderProva.setBounds(49, 308, 140, 35);
		contentPane.add(btnResponderProva);
		btnAbrirProva.setBounds(49, 96, 140, 35);
		
		contentPane.add(btnAbrirProva);
	}
}
