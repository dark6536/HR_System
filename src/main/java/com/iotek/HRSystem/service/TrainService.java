package com.iotek.HRSystem.service;

import java.util.List;

import com.iotek.HRSystem.domain.Train;

public interface TrainService {
	public List<Train> quaryAllTrains();
	public void insertTrain(Train train);
	public void deleteTrain(Integer id);
	public void updateTrain(Train train);
	public Train queryTrainById(Integer id);
}
