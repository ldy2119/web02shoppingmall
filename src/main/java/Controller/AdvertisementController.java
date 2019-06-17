package Controller;

import Domain.Advertisement;
import Service.AdvertisementService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AdvertisementController {
    @Autowired
    private  AdvertisementService advertisementService;

    @GetMapping("/api/advertisement")
    public List<Advertisement> findAll() {
        return advertisementService.findAll();
    }

    @PostMapping("/api/advertisement/add")
    public Long add(@RequestBody Advertisement advertisement) {
        return advertisementService.add(advertisement);
    }

    @PutMapping("/api/advertisement/modify")
    public int modify(@RequestBody Advertisement advertisement) {
        return advertisementService.modify(advertisement);
    }

    @DeleteMapping("/api/advertisement/delete/{id}")
    public int deleteById(@PathVariable Long id) {
        return advertisementService.deleteById(id);
    }

    @GetMapping("/api/advertisement/find/{id}")
    public Advertisement findById(@PathVariable Long id) {
        return advertisementService.findById(id);
    }
}
