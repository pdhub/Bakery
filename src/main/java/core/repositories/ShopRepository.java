package core.repositories;

import core.entities.Shop;

/**
 * Created by PDeb on 1/28/2017.
 */
public interface ShopRepository {
    public Shop findShopByName(String id);
}
