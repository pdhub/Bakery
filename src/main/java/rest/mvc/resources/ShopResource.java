package rest.mvc.resources;

import org.springframework.hateoas.ResourceSupport;

/**
 * Created by PDeb on 1/28/2017.
 */
public class ShopResource extends ResourceSupport {

    private String shopName;

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
}
