package mvc.controller;

import entities.Shop;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by PDeb on 1/28/2017.
 */
@Controller
public class ShopController {

    @RequestMapping("/test")
    public ResponseEntity<Object> testWiring(){
        Shop shop = new Shop();
        shop.setName("My First Shop");
        return new ResponseEntity<Object>(shop, HttpStatus.OK);
    }
}
