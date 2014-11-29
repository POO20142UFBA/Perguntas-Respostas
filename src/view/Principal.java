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

import modelo.Alternativa;
import modelo.EscolherArquivo;
import modelo.Pergunta;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Principal extends JFrame {

//	private JPanel contentPane;
//	private JMenuBar menuBar = new JMenuBar();
//	private JMenu mnArquivo = new JMenu("Arquivo");
//	private JMenuItem mntmSair = new JMenuItem("Sair");
//	private JMenu mnAjuda = new JMenu("Ajuda");
//	private JMenuItem mntmVerso = new JMenuItem("Vers\u00E3o");
//	private final JButton btnAbrirProva = new JButton("Abrir Prova");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal inicio = new TelaPrincipal();
					inicio.setVisible(true);
					

					//Principal frame = new Principal();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Principal(){
		Pergunta pg = new Pergunta();

		
		List<Alternativa> al = new ArrayList<Alternativa>();
		Alternativa e = new Alternativa("simn",true);
		al.add(0,e);
		e.setAlternativa("Nao");
		e.setEhCorreta(false);
		al.add(1,e);		
		e.setAlternativa("Nao 2");
		e.setEhCorreta(false);
		al.add(2,e);
		e.setAlternativa("Nao 3 ");
		e.setEhCorreta(false);
		al.add(3,e);
		e.setAlternativa("Nao 4");
		e.setEhCorreta(false);
		al.add(4,e);
		
		pg.setAlternativas((ArrayList)al);
		pg.setEnunciado("Eu vou conseguir terminar esse trabalho de POO?");
		pg.setdata(new Date());
		pg.setTema("Dúvida Cruel");
		pg.setNomeAutor("Capiroto");
		
		
		
	}	

//	public Principal() {
//		//setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Igor\\Documents\\workspace\\PergEResp\\PergEResp.jpg"));
//		setTitle("Perguntas e Respostas");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 800, 600);
//		
//		
//		setJMenuBar(menuBar);
//		menuBar.add(mnArquivo);
//		mntmSair.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				System.exit(0);
//			}
//		});
//		mnArquivo.add(mntmSair);
//		menuBar.add(mnAjuda);
//		mnAjuda.add(mntmVerso);
//		
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//		contentPane.setLayout(null);
//		
//		JButton btnCriarPergunta = new JButton("Criar Pergunta");
//		btnCriarPergunta.setBounds(49, 167, 140, 35);
//		contentPane.add(btnCriarPergunta);
//		
//		JButton btnCriarProva = new JButton("Criar Prova");
//		btnCriarProva.setBounds(49, 240, 140, 35);
//		contentPane.add(btnCriarProva);
//		
//		JButton btnResponderProva = new JButton("Responder Prova");
//		btnResponderProva.setBounds(49, 308, 140, 35);
//		contentPane.add(btnResponderProva);
//		btnAbrirProva.setBounds(49, 96, 140, 35);
//		
//		contentPane.add(btnAbrirProva);
//	}
}
