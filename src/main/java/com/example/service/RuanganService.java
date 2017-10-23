package com.example.service;

import java.util.List;

import com.example.model.RuanganModel;

public interface RuanganService {
	
	List<RuanganModel> selectAllRooms();
	
	RuanganModel selectRoom (String id);

}
