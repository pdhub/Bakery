package rest.mvc.resources.asm;

import core.entities.Shop;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import rest.mvc.controller.ShopController;
import rest.mvc.resources.ShopResource;

/**
 * Created by PDeb on 1/28/2017.
 */
public class ShopResourceASM extends ResourceAssemblerSupport<Shop, ShopResource> {

    public ShopResourceASM() {
        super(ShopController.class, ShopResource.class);
    }

    public ShopResource toResource(Shop shop) {
        ShopResource shopResource = new ShopResource();
        shopResource.setShopName(shop.getName());
        return shopResource;
    }
}
