package com.iotek.HRSystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.HRSystem.dao.RewardAndPunishmentDao;
import com.iotek.HRSystem.domain.RewardAndPunishment;
import com.iotek.HRSystem.service.RewardAndPunishmentService;
@Service("rewardAndPunishService")
public class RewardAndPunishmentServiceImpl implements RewardAndPunishmentService{
	@Autowired
	private RewardAndPunishmentDao rewardAndPunishmentDao;
	@Override
	public List<RewardAndPunishment> queryAllRewardsAndPunishments() {
		return rewardAndPunishmentDao.queryAllRewardsAndPunishments();
	}

}
