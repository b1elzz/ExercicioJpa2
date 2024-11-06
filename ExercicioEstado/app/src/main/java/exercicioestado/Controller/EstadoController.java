package exercicioestado.Controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

import exercicioestado.Util.TecladoUtil;
import exercicioestado.model.Cidade;
import exercicioestado.model.CidadeRepository;
import exercicioestado.model.Estado;
import exercicioestado.model.EstadoRepository;

public class EstadoController {
    
    TecladoUtil teclado = new TecladoUtil();
    private CidadeRepository cidadeRepository;
    private EstadoRepository estadoRepository;

    public EstadoController(){
        this.cidadeRepository = new CidadeRepository();
        this.estadoRepository = new EstadoRepository();
    }

    public void inserirEstado() {
        String sigla = teclado.lerString("Insira a sigla");
        String nomeEstado = teclado.lerString("Insira o nome do estado");
        Calendar data_registroEstado = Calendar.getInstance();

        Estado estados = new Estado(sigla, nomeEstado, data_registroEstado);

        estadoRepository.inserirEstado(estados);
       
    }

    public List<Estado> listarRegistros() {
        return estadoRepository.listarUfs();
    }

    

}
