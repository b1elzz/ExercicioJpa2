package exercicioestado.model;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;

import javax.persistence.*;

@Entity
@Table(name = "ESTADO")
public class Estado {

    @Id
    @Column(name = "SIGLA")
    private String sigla;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "data_registro")
    private Calendar data_registro;

    public Estado() {

    }

    public Estado(String sigla, String nome, Calendar data_registro) {
        this.sigla = sigla;
        this.nome = nome;
        this.data_registro = data_registro;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getData_registro() {
        return data_registro;
    }

    public void setData_registro(Calendar data_registro) {
        this.data_registro = data_registro;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((sigla == null) ? 0 : sigla.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((data_registro == null) ? 0 : data_registro.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Estado other = (Estado) obj;
        if (sigla == null) {
            if (other.sigla != null)
                return false;
        } else if (!sigla.equals(other.sigla))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (data_registro == null) {
            if (other.data_registro != null)
                return false;
        } else if (!data_registro.equals(other.data_registro))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Estado > " + " Nome: " + nome + " Sigla: " + sigla;
    }

    

    

    


    
}