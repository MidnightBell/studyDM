package per.zs.studyDM.beans.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import per.zs.studyDM.beans.enums.HttpCodeEnum;

@Setter
@Getter
@NoArgsConstructor
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@EqualsAndHashCode(callSuper = true)
@ApiModel("api接口分页通用返回对象")
public class PageRes<T> extends ResultRes<T> {
    @ApiModelProperty(notes = "当前页码", position = 2)
    private String pageNum;

    @ApiModelProperty(notes = "单页数据量", position = 3)
    private String pageSize;

    @ApiModelProperty(notes = "总页数", position = 4)
    private String totalPageNum;

    @ApiModelProperty(notes = "总数据量", position = 5)
    private String totalSize;

    public void setPageNum(int pageNum) {
        this.pageNum = String.valueOf(pageNum);
    }

    public void setPageSize(int pageSize) {
        this.pageSize = String.valueOf(pageSize);
    }

    public void setTotalPageNum(int totalPageNum) {
        this.totalPageNum = String.valueOf(totalPageNum);
    }

    public void setTotalSize(long totalSize) {
        this.totalSize = String.valueOf(totalSize);
    }

    public PageRes(HttpCodeEnum httpCodeEnum) {
        setCode(httpCodeEnum.getCode());
        setMsg(httpCodeEnum.getMsg());
    }

    public PageRes(HttpCodeEnum httpCodeEnum, T data) {
        setCode(httpCodeEnum.getCode());
        setData(data);
        setMsg(httpCodeEnum.getMsg());
    }
    
    public PageRes(HttpCodeEnum httpCodeEnum, String message) {
        setCode(httpCodeEnum.getCode());
        setMsg(message);
    }
}
