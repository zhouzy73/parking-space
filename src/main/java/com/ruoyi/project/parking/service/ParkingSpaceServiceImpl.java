package com.ruoyi.project.parking.service;

import com.ruoyi.project.parking.domain.request.ParkingSpaceRequest;
import com.ruoyi.project.parking.domain.vo.ParkingSpaceVO;
import com.ruoyi.project.parking.mapper.ParkingSpaceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 部门管理 服务实现
 *
 * @author ruoyi
 */
@Service
public class ParkingSpaceServiceImpl implements ParkingSpaceService
{
    @Autowired
    private ParkingSpaceMapper parkingSpaceMapper;

    @Override
    public ParkingSpaceVO getParkingSpace(Long id) {
        return null;
    }

    @Override
    public List<ParkingSpaceRequest> selectParkingSpaceList(ParkingSpaceRequest request) {
        return null;
    }

    @Override
    public boolean insert(ParkingSpaceRequest request) {
        return false;
    }

    @Override
    public boolean update(ParkingSpaceRequest request) {
        return false;
    }

    @Override
    public boolean delete(ParkingSpaceRequest request) {
        return false;
    }
}
