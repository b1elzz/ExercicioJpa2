package exercicioestado.Controller;

import java.util.Calendar;

import exercicioestado.Util.TecladoUtil;
import exercicioestado.model.Cidade;
import exercicioestado.model.CidadeRepository;
import exercicioestado.model.Estado;
import exercicioestado.model.EstadoRepository;

public class CidadeController {
     TecladoUtil teclado = new TecladoUtil();
    private CidadeRepository cidadeRepository;
    private EstadoRepository estadoRepository;

    public CidadeController(){
        this.cidadeRepository = new CidadeRepository();
        this.estadoRepository = new EstadoRepository();
    }

    
       
        
        public void inserirCidade(){
        String nome = teclado.lerString("Insira o nome da cidade");
        String uf = teclado.lerString("Digite o UF");
        Calendar data_registro = Calendar.getInstance();

        Estado estado = estadoRepository.buscarPorUf(uf);
        Cidade cidade = new Cidade(nome, data_registro, estado);
        cidadeRepository.inserirCidade(cidade);
        }
}
