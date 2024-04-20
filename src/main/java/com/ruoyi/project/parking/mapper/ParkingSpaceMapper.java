package com.ruoyi.project.parking.mapper;

import com.ruoyi.project.parking.domain.request.ParkingSpaceRequest;

import java.util.List;

/**
 * 部门管理 数据层
 *
 * @author ruoyi
 */
public interface ParkingSpaceMapper {

    ParkingSpaceRequest getById(Long id);

    int count(ParkingSpaceRequest query);

    List<ParkingSpaceRequest> pageList(ParkingSpaceRequest query);

    int insertParkingSpace(ParkingSpaceRequest request);

    int updateParkingSpace(ParkingSpaceRequest request);

    int deleteById(ParkingSpaceRequest request);
}
