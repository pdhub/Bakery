package rest.mvc.controller;


import core.entities.Shop;
import core.services.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import rest.mvc.resources.ShopResource;
import rest.mvc.resources.asm.ShopResourceASM;

/**
 * Created by PDeb on 1/28/2017.
 */
@Controller
@RequestMapping("rest/shops")
public class ShopController {

    private ShopService shopService;

    @Autowired
    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @RequestMapping(value = "/{shopName}", method = RequestMethod.GET)
    public ResponseEntity<ShopResource> getAllShops(@PathVariable String shopName){
        Shop shop = shopService.getShopByName(shopName);
        ShopResource shopResource = new ShopResourceASM().toResource(shop);
        return new ResponseEntity<ShopResource>(shopResource, HttpStatus.OK);
    }
}
