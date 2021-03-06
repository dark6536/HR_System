package com.iotek.HRSystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.HRSystem.dao.PositionDao;
import com.iotek.HRSystem.domain.Position;
import com.iotek.HRSystem.service.PositionService;
@Service("positionService")
public class PositionServiceImpl implements PositionService{
	@Autowired
	private PositionDao positionDao;
	@Override
	public void insertPosition(Position position) {
		positionDao.insertPosition(position);
	}
	@Override
	public List<Position> queryPositionsByDepartment(Integer id) {
		return positionDao.queryPositionsByDepartment(id);
	}
	@Override
	public List<Position> queryAllPositions() {
		return positionDao.queryAllPositions();
	}
	@Override
	public void deletePosition(Integer id) {
		positionDao.deletePosition(id);
	}
	@Override
	public void updatePosition(Position position) {
		positionDao.updatePosition(position);
	}
	@Override
	public Position queryPositionById(Integer id) {
		return positionDao.queryPositionById(id);
	}

}
