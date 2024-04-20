package com.ruoyi.project.parking.domain.dao;

import lombok.Data;

/**
 * 车位表
 */
@Data
public class ParkingSpaceDO extends BaseDO {

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
