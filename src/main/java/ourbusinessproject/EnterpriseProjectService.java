package ourbusinessproject;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
@Service
public class EnterpriseProjectService {

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @PersistenceContext
    private EntityManager entityManager;

    public void save (Enterprise enterprise){
        entityManager.persist(enterprise);
        entityManager.flush();
    }

    public void save (Project project){
        entityManager.persist(project);
        entityManager.flush();
    }

    public Project findProjectById (long id){
        return this.entityManager.find(Project.class, id);
    }
    public Enterprise findEnterpriseById (long id){
        return this.entityManager.find(Enterprise.class, id);
    }
}
