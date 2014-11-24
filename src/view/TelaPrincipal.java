package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

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

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar = new JMenuBar();
	private JMenu mnArquivo = new JMenu("Arquivo");
	private JMenuItem mntmSair = new JMenuItem("Sair");
	private JMenu mnAjuda = new JMenu("Ajuda");
	private JMenuItem mntmVerso = new JMenuItem("Vers\u00E3o");
	private final JButton btnAbrirProva = new JButton("Abrir Prova");
	private final JTabbedPane tpImprimir = new JTabbedPane(JTabbedPane.TOP);
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
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane.setBounds(0, 0, 784, 541);
		contentPane.add(tabbedPane);
		
		JTabbedPane tpCriarQuestionario = new JTabbedPane(JTabbedPane.TOP);
		tpCriarQuestionario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tabbedPane.addTab("Criar Question\u00E1rio", null, tpCriarQuestionario, null);
		
		JTabbedPane tpRealizarProva = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Realizar Prova", null, tpRealizarProva, null);
		
		JTabbedPane tpCriarPergunta = new JTabbedPane(JTabbedPane.TOP);
		tpCriarPergunta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tabbedPane.addTab("Criar pergunta", null, tpCriarPergunta, null);
		
		tabbedPane.addTab("Imprimir", null, tpImprimir, null);
	}
}
