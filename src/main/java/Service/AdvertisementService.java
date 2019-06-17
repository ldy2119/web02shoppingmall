package Service;

import Domain.Advertisement;

import java.util.List;

public interface AdvertisementService {
    List<Advertisement> findAll();
    Long add(Advertisement advertisement);
    int modify(Advertisement advertisement);
    int deleteById(Long id);
    Advertisement findById(Long id);
}
