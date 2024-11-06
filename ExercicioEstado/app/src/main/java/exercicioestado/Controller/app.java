package exercicioestado.Controller;

import exercicioestado.model.Estado;

public class app {
    public static void main(String[] args) {
        CidadeController cidade = new CidadeController();
        EstadoController estado = new EstadoController();
        
        cidade.inserirCidade();

        for (Estado estado1 : estado.listarRegistros()) {
            System.out.println(estado1);
        }
    }
}
