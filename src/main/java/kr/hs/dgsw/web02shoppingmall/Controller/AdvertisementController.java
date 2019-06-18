package kr.hs.dgsw.web02shoppingmall.Controller;

import kr.hs.dgsw.web02shoppingmall.Domain.Advertisement;
import kr.hs.dgsw.web02shoppingmall.Service.AdvertisementService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdvertisementController {
    @Autowired
    private  AdvertisementService advertisementService;

    @GetMapping(value = "/api/advertisement")
    public List<Advertisement> findAll() {
        return advertisementService.findAll();
    }

    @PostMapping(value = "/api/advertisement/add")
    public Long add(@RequestBody Advertisement advertisement) {
        return advertisementService.add(advertisement);
    }

    @PutMapping(value = "/api/advertisement/modify")
    public int modify(@RequestBody Advertisement advertisement) {
        return advertisementService.modify(advertisement);
    }

    @DeleteMapping(value = "/api/advertisement/delete/{id}")
    public int deleteById(@PathVariable Long id) {
        return advertisementService.deleteById(id);
    }

    @GetMapping(value = "/api/advertisement/find/{id}")
    public Advertisement findById(@PathVariable Long id) {
        return advertisementService.findById(id);
    }
}
