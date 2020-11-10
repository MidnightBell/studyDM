package per.zs.studyDM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import per.zs.studyDM.beans.entity.City;
import per.zs.studyDM.service.StudyDMService;

/** 
* Create time 2020年11月9日 下午5:09:57 
* @author sheng.zhong 
* @Description  
*/
@Api(tags = "达梦数据库操作")
@Slf4j
@Validated
@RestController
@RequestMapping(value = "dmOperation")
public class StudyDMController {
    
    @Autowired
    private StudyDMService studyDMService;
    
    @ApiOperation(value = "查询操作")
    @RequestMapping(value = "selectAll",method = RequestMethod.GET)
    public List<City> selectAll() {
        return studyDMService.selectAll();
    }
    
    @ApiOperation(value = "根据主键查询操作")
    @RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
    public City selectByPrimaryKey(String cityId){
        return studyDMService.selectByPrimaryKey(cityId);
    }
    
    @ApiOperation(value = "根据主键删除操作")
    @RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
    public Integer deleteByPrimaryKey(String cityId){
        return studyDMService.deleteByPrimaryKey(cityId);
    }
    
    @ApiOperation(value = "新增操作")
    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public Integer insert(@RequestBody City record){
        return studyDMService.insert(record);
    }
    
    @ApiOperation(value = "根据主键更新操作")
    @RequestMapping(value = "updateByPrimaryKey",method = RequestMethod.POST)
    public Integer updateByPrimaryKey(@RequestBody City record){
        return studyDMService.updateByPrimaryKey(record);
    }
    
}
