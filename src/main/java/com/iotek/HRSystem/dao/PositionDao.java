package com.iotek.HRSystem.dao;

import java.util.List;

import com.iotek.HRSystem.domain.Position;

public interface PositionDao {
	public void insertPosition(Position position);
	public List<Position> queryPositionsByDepartment(Integer id);
}
