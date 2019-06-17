package Service;

import Domain.Advertisement;
import Domain.AdvertisementMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvertisementServiceImpl implements AdvertisementService{

    @Autowired
    private AdvertisementMapper advertisementMapper;

    @Override
    public List<Advertisement> findAll() {
        return advertisementMapper.findAll();
    }

    @Override
    public Long add(Advertisement advertisement) {
        return advertisementMapper.add(advertisement);
    }

    @Override
    public int modify(Advertisement advertisement) {
        return advertisementMapper.modify(advertisement);
    }

    @Override
    public int deleteById(Long id) {
        return advertisementMapper.deleteById(id);
    }

    @Override
    public Advertisement findById(Long id) {
        return advertisementMapper.findById(id);
    }
}
