package per.zs.studyDM.beans.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import per.zs.studyDM.beans.enums.HttpCodeEnum;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@ApiModel("api接口通用返回对象,不带参数")
public class ResultBaseRes {
    @ApiModelProperty(value = "返回码", position = 1)
    private String code;

    @ApiModelProperty(value = "说明信息", position = 7)
    private String msg;

    public ResultBaseRes(String code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public void setCodeAndMsg(String code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public static ResultBaseRes builder(HttpCodeEnum httpCodeEnum, String msg){
        return new ResultBaseRes(httpCodeEnum.getCode(), msg);
    }

    public static ResultBaseRes builder(HttpCodeEnum httpCodeEnum){
        return new ResultBaseRes(httpCodeEnum.getCode(), httpCodeEnum.getMsg());
    }
}
