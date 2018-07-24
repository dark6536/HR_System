package com.iotek.HRSystem.service;

import java.util.List;

import com.iotek.HRSystem.domain.Position;

public interface PositionService {
	public void insertPosition(Position position);
	public List<Position> queryPositionsByDepartment(Integer id);
}
