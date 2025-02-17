package tws.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import tws.entity.ParkingLot;
@Mapper
public interface ParkingLotMapper {
	List<ParkingLot> selectAll();
	void insert(@Param("parkingLot") ParkingLot parkingLot);
}
