package com.iotek.HRSystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.HRSystem.dao.TrainDao;
import com.iotek.HRSystem.domain.Train;
import com.iotek.HRSystem.service.TrainService;
@Service("trainService")
public class TrainServiceImpl implements TrainService{
	@Autowired
	private TrainDao trainDao;
	@Override
	public List<Train> quaryAllTrains() {
		return trainDao.queryAllTrains();
	}
	@Override
	public void insertTrain(Train train) {
		trainDao.insertTrain(train);
	}
	@Override
	public void deleteTrain(Integer id) {
		trainDao.deleteTrain(id);
	}
	@Override
	public void updateTrain(Train train) {
		trainDao.updateTrain(train);
	}
	@Override
	public Train queryTrainById(Integer id) {
		return trainDao.queryTrainById(id);
	}

}
