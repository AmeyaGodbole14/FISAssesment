package com.fis.airline.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fis.airline.Dao.PassengerDao;
import com.fis.airline.Entity.Passenger;


@Service
public class PassServiceImpl implements PassService{
	
	@Autowired
	PassengerDao passDao;

	@Override
	public Passenger addPassengerData(Passenger passenger) {
		// TODO Auto-generated method stub
		return passDao.save(passenger);
	}

	@Override
	public Passenger updatePassengerData(Passenger passenger) {
		// TODO Auto-generated method stub
		return passDao.save(passenger);
	}

}