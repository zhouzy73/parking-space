package com.ruoyi.project.parking.domain.request;

import lombok.Data;

import java.util.Date;

/**
 * 部门表 sys_dept
 *
 * @author ruoyi
 */
@Data
public class ParkingSpaceRequest extends BaseRequest
{

    private Long id;
    private Date gmtCreate;
    private Date gmtModified;
    private Integer isDelete;
    private Integer version;
    private String creator;
    private String modifier;

    /**
     * 车位号
     */
    private String spaceNumber;
    /**
     * 总车位数
     */
    private Integer totalCount;
    /**
     * 使用车位数
     */
    private Integer useCount;
    /**
     * 车位类型
     */
    private String type;
}
