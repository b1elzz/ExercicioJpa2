package exercicioestado.Controller;

import exercicioestado.Util.TecladoUtil;
import exercicioestado.model.Estado;
import exercicioestado.model.EstadoRepository;

public class app {

    private static CidadeController cidade = new CidadeController();
    private static EstadoController estado = new EstadoController();
    private static TecladoUtil teclado = new TecladoUtil();

    public static void menu() {
        System.out.println("Menu UF/Cidades");
        System.out.println("1 - Inserir Cidade (e UF)");
        System.out.println("2 - Buscar Cidade por nome Aproximado");
        System.out.println("3 - Listar todos UFs.");
        System.out.println("4 - Listar todas Cidades");
        System.out.println("5 - Total de Cidades por Estado");
        System.out.println("6 - Sair");
    }

    public static void executar() {
        int opcao;

        do {
           
                menu();
                opcao = teclado.lerInteiro("Escolha a opção: ");
                teclado.limparBuffer();
                switch (opcao) {
                    case 1:
                        cidade.inserirCidade();
                        break;
                    case 2:
                        cidade.buscarCidadePorNome();
                        break;
                    case 3:
                        System.out.println(estado.listarRegistros());
                        break;
                    case 4:
                        System.out.println(cidade.listarCidades());
                        break;
                    case 5:
                        System.out.println(estado.getCidadeTotalEstados());
                        break;
                    default:
                        System.out.println("Opção invalida!");
                        break;
                }
        } while (opcao != 6);

    }

    public static void main(String[] args) {

        executar();
    }
}
