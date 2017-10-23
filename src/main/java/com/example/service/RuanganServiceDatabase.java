package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.RuanganMapper;
import com.example.model.RuanganModel;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service

public class RuanganServiceDatabase implements RuanganService {
	
	@Autowired
	private RuanganMapper ruanganMapper;
	

	@Override
    public List<RuanganModel> selectAllRooms ()
    {
        return ruanganMapper.selectAllRooms ();
    }
	
	@Override
    public RuanganModel selectRoom (String id)
    {
        return ruanganMapper.selectRoom (id);
    }
	
	
	
	

}
