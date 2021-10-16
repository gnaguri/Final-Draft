package com.example.pedestrianservices.pedestrianservices.service;

import java.util.List;
import com.example.pedestrianservices.pedestrianservices.entity.Pedestrain;

public interface PedestrainService {
	
	public void addPedestrain(Pedestrain pedestrain);
	public void deletePedestrain(Pedestrain pedestrain);
	public List<Pedestrain> getAllPedestrain();
	public Pedestrain updatePedestrain(Pedestrain pedestrain);
	public Pedestrain getPedestrain(Integer id);
}
                                                