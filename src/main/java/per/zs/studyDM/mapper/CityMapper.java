package per.zs.studyDM.mapper;

import java.util.List;
import per.zs.studyDM.beans.entity.City;

public interface CityMapper {
    int deleteByPrimaryKey(String cityId);

    int insert(City record);

    City selectByPrimaryKey(String cityId);

    List<City> selectAll();

    int updateByPrimaryKey(City record);
}