package core.repositories.jpa;

import core.entities.Shop;
import core.repositories.ShopRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Created by PDeb on 1/28/2017.
 */
@Repository
public class JpaShopRepository implements ShopRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Shop findShopByName(String name) {
        Query query = entityManager.createQuery("SELECT s FROM Shop s WHERE s.name = ?1");
        query.setParameter(1, name);
        Shop shop = (Shop) query.getSingleResult();
        return shop;
    }
}
