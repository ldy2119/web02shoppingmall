package Domain;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AdvertisementMapper {
    List<Advertisement> findAll();
    Long add(Advertisement advertisement);
    int modify(Advertisement advertisement);
    int deleteById(@Param("id") Long id);
    Advertisement findById(@Param("id") Long id);
}
