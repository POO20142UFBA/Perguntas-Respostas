package modelo;

import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


//Retorna o endereço com o nome do arquivo para salvar.
abstract class EscolherArquivo{
	public EscolherArquivo(){
		
	}
	
	public String buscarArquivoAbrir(String TipoArquivo){
		
		// Escolhe o caminho padrão que a janela irá abrir (desktop)
		String diretorioBase = System.getProperty("user.home")+"/Desktop";

		// Cria um caminho apartir do diretório
		File dir = new File(diretorioBase);
		
		// Tela de busca do arquivo
		JFileChooser chooser = new JFileChooser();

		// titulo da tela de abrir
		chooser.setDialogTitle("Abrir Arquivo");
		
		// informando o diretorio padrão
		chooser.setCurrentDirectory(dir);
		
		// informando ao filtro que só quer selecionar/abrir arquivos (não diretórios)
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		
		// impedindo que seja possivel escolher outro tipo de arquivo.
		chooser.setAcceptAllFileFilterUsed(false);
		
		// Filtra pelo tipo de arquivo que foi passado ao método.
        switch( TipoArquivo )
        {
            case "prpg": 
            {
            	// Implementa os tipos de arquivos que apareceram para a escolha.
            	FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivo Tipo Pergunta", "prpg");
            	
            	// imformar qual é o tipo de arquivo possivel de abrir.
            	chooser.addChoosableFileFilter(filtro);
            	break;
            }
            case "prpt": 
            {
            	FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivo Tipo Questionário", "prqt");
            	chooser.addChoosableFileFilter(filtro);
            	break;
            }
            case "prrs": 
            {
            	FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivo Tipo Resolução", "prrs");
            	chooser.addChoosableFileFilter(filtro);
            	break; 
            }
            default: 
        		// permite que seja possivel escolher outro tipo de arquivo.
        		chooser.setAcceptAllFileFilterUsed(true);
        }
            	
		String caminhoArquivo = "";
		// Habilitando o botão de abrir (ShowOpenDialog pra salvar)
		int retorno = chooser.showOpenDialog(null);
		
		// Se selecionou o arquivo, retorna o endereço completo.
		if(retorno == JFileChooser.APPROVE_OPTION){
			caminhoArquivo = chooser.getSelectedFile().getAbsolutePath();
		}
		
		return caminhoArquivo;

	}

	public String buscarArquivoSalvar(String TipoArquivo){
		
		// Escolhe o caminho padrão que a janela irá abrir (desktop)
		String diretorioBase = System.getProperty("user.home")+"/Desktop";

		// Cria um caminho apartir do diretório
		File dir = new File(diretorioBase);
		
		// Tela de busca do arquivo
		JFileChooser chooser = new JFileChooser();

		// titulo da tela de abrir
		chooser.setDialogTitle("Salvar Arquivo");
		
		// informando o diretorio padrão
		chooser.setCurrentDirectory(dir);
		
		// informando ao filtro que só quer selecionar/abrir arquivos (não diretórios)
		chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		
		// impedindo que seja possivel escolher outro tipo de arquivo.
		chooser.setAcceptAllFileFilterUsed(false);
		
		// Filtra pelo tipo de arquivo que foi passado ao método.
        switch( TipoArquivo )
        {
            case "prpg": 
            {
            	// Implementa os tipos de arquivos que apareceram para a escolha.
            	FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivo Tipo Pergunta", "prpg");
            	
            	// imformar qual é o tipo de arquivo possivel de abrir.
            	chooser.addChoosableFileFilter(filtro);
            	break;
            }
            case "prpt": 
            {
            	FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivo Tipo Questionário", "prqt");
            	chooser.addChoosableFileFilter(filtro);
            	break;
            }
            case "prrs": 
            {
            	FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivo Tipo Resolução", "prrs");
            	chooser.addChoosableFileFilter(filtro);
            	break; 
            }
        }
            	
		String caminhoArquivo = "";
		// Habilitando o botão de abrir (ShowOpenDialog pra salvar)
		int retorno = chooser.showSaveDialog(null);
		
		// Se selecionou o arquivo, retorna o endereço + nome + extenção do arquivo.
		if(retorno == JFileChooser.APPROVE_OPTION){
			caminhoArquivo = chooser.getSelectedFile().getAbsolutePath();
			
			if(!VerificaExtencao(caminhoArquivo)){
				caminhoArquivo = chooser.getSelectedFile().getAbsolutePath().concat("."+TipoArquivo);
			}
		}

		return caminhoArquivo;
	}

	public boolean VerificaExtencao(String caminhoArquivo){
		// Verifica se Foi digitado ou selecionado um arquivo com extencao.
		char recebe = ' ';
		String extencao = "";
		String oi = "";
		for(int i = caminhoArquivo.length() - 5; i < caminhoArquivo.length(); i++){
			recebe = caminhoArquivo.charAt(i);
			oi = String.valueOf(recebe);
			extencao = extencao + oi;
		}
		
		if(extencao.equals(".prpg") || extencao.equals(".prqt") || extencao.equals(".prrs")){
			return true;
		}else{
			return false;
		}
	}
}
