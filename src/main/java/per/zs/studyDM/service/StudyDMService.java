package per.zs.studyDM.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.ApiOperation;
import per.zs.studyDM.beans.entity.City;
import per.zs.studyDM.mapper.CityMapper;

/** 
* Create time 2020年11月10日 上午11:19:47 
* @author sheng.zhong 
* @Description  
*/
@Service
public class StudyDMService {
    @Autowired
    private CityMapper cituMaper;
    
    /**
     * 查询所有
     * @return
     */
    public List<City> selectAll() {
        return cituMaper.selectAll();
    }
    
    /**
     * 按主键查询
     * @param cityId
     * @return
     */
    public City selectByPrimaryKey(String cityId){
        return cituMaper.selectByPrimaryKey(cityId);
    }
    
    /**
     * 按主键删除
     * @param cityId
     * @return
     */
    public Integer deleteByPrimaryKey(String cityId){
        return cituMaper.deleteByPrimaryKey(cityId);
    }
    
    /**
     * 新增
     * @param record
     * @return
     */
    public Integer insert(City record){
        return cituMaper.insert(record);
    }
    
    /**
     * 按主键更新
     * @param record
     * @return
     */
    public Integer updateByPrimaryKey(City record){
        return cituMaper.updateByPrimaryKey(record);
    }
}
