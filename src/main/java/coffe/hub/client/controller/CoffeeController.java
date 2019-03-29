package coffe.hub.client.controller;

import coffe.hub.client.model.Coffee;
import coffe.hub.client.stub.CoffeeStub;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class CoffeeController {

    @GetMapping("/coffee")
    public List<Coffee> list(){
        return CoffeeStub.list();
    }

    @GetMapping("/coffee/{id}")
    public Coffee get(@PathVariable int id){
        return CoffeeStub.get(id);
    }
}
