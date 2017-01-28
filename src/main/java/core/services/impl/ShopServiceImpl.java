package core.services.impl;

import core.entities.Shop;
import core.repositories.ShopRepository;
import core.services.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by PDeb on 1/28/2017.
 */
@Service
@Transactional
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopRepository shopRepository;

    public List<Shop> fetchShops() {
        return null;
    }

    public Shop getShopByName(String name) {
        return shopRepository.findShopByName(name);
    }
}
