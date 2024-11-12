package exercicioestado.Controller;

import java.util.Calendar;
import java.util.List;

import exercicioestado.Util.TecladoUtil;
import exercicioestado.model.Cidade;
import exercicioestado.model.CidadeRepository;
import exercicioestado.model.Estado;
import exercicioestado.model.EstadoRepository;

public class CidadeController {
    TecladoUtil teclado = new TecladoUtil();
    private CidadeRepository cidadeRepository;
    private EstadoRepository estadoRepository;

    public CidadeController() {
        this.cidadeRepository = new CidadeRepository();
        this.estadoRepository = new EstadoRepository();
    }

    public void inserirCidade() {
        String nome = teclado.lerString("Insira o nome da cidade");
        Estado estado = estadoRepository.buscarPorUf(teclado.lerString("Digite o UF: "));
        Calendar data_registro = Calendar.getInstance();

        Cidade cidade = new Cidade(nome, data_registro, estado);
        cidadeRepository.inserirCidade(cidade);

    }

    public void buscarCidadePorNome() {
        String nome = teclado.lerString("Insira o nome: ");
        System.out.println(cidadeRepository.buscarNome(nome));
    }

     public List<Cidade> listarCidades() {
        return cidadeRepository.listarCidades();
    }
}
