package exercicioestado.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import org.h2.result.ResultWithGeneratedKeys;

public class EstadoRepository {

    private EntityManager em;

    public EstadoRepository(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("BancoDeDados");
        em = factory.createEntityManager();
    }


    public void inserirEstado(Estado estado) {
        this.em.getTransaction().begin();
        this.em.merge(estado);
        this.em.getTransaction().commit();
    }

    public Estado buscarPorUf(String sigla){
    TypedQuery<Estado> query = this.em.createQuery("select e from Estado e where e.sigla = :sigla", Estado.class);
       query.setParameter("sigla", sigla);

       try {
           return query.getSingleResult();
       } catch (NoResultException e) {
           return null;
       }
   }
    
   public List<Estado> listarUfs() {
        TypedQuery<Estado> buscarTodosQuery = this.em.createQuery("select e from Estado e", Estado.class);
        return buscarTodosQuery.getResultList();
    }

   


   }

