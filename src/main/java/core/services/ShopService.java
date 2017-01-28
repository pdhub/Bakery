package core.services;

import core.entities.Shop;

import java.util.List;

/**
 * Created by PDeb on 1/28/2017.
 */
public interface ShopService {

    public List<Shop> fetchShops();
    public Shop getShopByName(String id);
}
