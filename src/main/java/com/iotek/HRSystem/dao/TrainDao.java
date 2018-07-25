package com.iotek.HRSystem.dao;

import java.util.List;

import com.iotek.HRSystem.domain.Train;

public interface TrainDao {
	public List<Train> queryAllTrains();
	public void insertTrain(Train train);
	public void deleteTrain(Integer id);
	public void updateTrain(Train train);
	public Train queryTrainById(Integer id);
}
