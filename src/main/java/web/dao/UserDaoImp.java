package web.dao;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class UserDaoImp implements UserDao {

    @PersistenceContext //(unitName = "User")
    private EntityManager entityManager;

    @Override
    @SuppressWarnings("uncheced")//Если бы я не анонсировал @SuppressWarnings ( "unchecked" ) здесь, у него возникла бы проблема с линией, где я хочу вернуть свой ResultList.
    public List<User> allUser() {
        return entityManager.createQuery("select g from User g",User.class).getResultList();
    }

    @Override
    public void addUser(User user) {
        entityManager.persist(user);


    }

    @Override
    public void deleteUser(User user) {
        entityManager.remove(entityManager.find(User.class, user.getId()));

    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);


    }

    @Override
    @SuppressWarnings("uncheced")
    public User getIdUser(int id) {
        return entityManager.find(User.class, id);
    }
}
