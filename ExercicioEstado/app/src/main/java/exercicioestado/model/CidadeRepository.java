package exercicioestado.model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import org.h2.result.ResultWithGeneratedKeys;

public class CidadeRepository {

    private EntityManager em;

    public CidadeRepository() {
        EntityManagerFactory factory =  Persistence.createEntityManagerFactory("BancoDeDados");
        em = factory.createEntityManager();
    }

    public void inserirCidade(Cidade cidade) {
        this.em.getTransaction().begin();
        this.em.merge(cidade);
        this.em.getTransaction().commit();
    }

    public Cidade buscarNome(String nome) {
        TypedQuery<Cidade> query = this.em.createQuery("select e from Cidade e where e.nome like :nome",
                Cidade.class);
        query.setParameter("nome", nome);

        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public List<Cidade> listarCidades() {
        TypedQuery<Cidade> buscarTodosQuery = this.em.createQuery("select e from Cidade e", Cidade.class);
        return buscarTodosQuery.getResultList();
    }

    

}