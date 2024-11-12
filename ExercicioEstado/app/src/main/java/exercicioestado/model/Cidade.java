
package exercicioestado.model;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;
import javax.persistence.*;


@Entity
@Table (name = "CIDADE")
public class Cidade {
    
    @Id
    @GeneratedValue(strategy=GenerationType.TABLE , generator="cidade_generator")
    @TableGenerator(name="cidade_generator",
            table="chave",
            pkColumnName="id",
            valueColumnName="valor",
            allocationSize=1)
    @Column(name = "id")
    private Integer id;


    @Column(name = "nome")
    private String nome;

    @Column(name = "data_registro")
    private Calendar data_registro;

    @ManyToOne
    @JoinColumn(name = "id_estado")
    private Estado id_estado;

    public Cidade(){

    }

    public Cidade(String nome, Calendar data_registro, Estado id_estado) {
        this.nome = nome;
        this.data_registro = data_registro;
        this.id_estado = id_estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Estado getId_estado() {
        return id_estado;
    }

    public void setId_estado(Estado id_estado) {
        this.id_estado = id_estado;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((data_registro == null) ? 0 : data_registro.hashCode());
        result = prime * result + ((id_estado == null) ? 0 : id_estado.hashCode());
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
        Cidade other = (Cidade) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
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
        if (id_estado == null) {
            if (other.id_estado != null)
                return false;
        } else if (!id_estado.equals(other.id_estado))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Cidade [id=" + id + ", nome=" + nome + ", id_estado=" + id_estado
                + "]";
    }

    



    

    
}

    

