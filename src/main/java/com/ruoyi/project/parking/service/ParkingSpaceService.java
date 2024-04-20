package com.ruoyi.project.parking.service;

import com.ruoyi.project.parking.domain.request.ParkingSpaceRequest;
import com.ruoyi.project.parking.domain.vo.ParkingSpaceVO;

import java.util.List;

/**
 * 部门管理 服务层
 *
 * @author ruoyi
 */
public interface ParkingSpaceService {

    ParkingSpaceVO getParkingSpace(Long id);

    List<ParkingSpaceRequest> selectParkingSpaceList(ParkingSpaceRequest request);

    boolean insert(ParkingSpaceRequest request);

    boolean update(ParkingSpaceRequest request);

    boolean delete(ParkingSpaceRequest request);
}
