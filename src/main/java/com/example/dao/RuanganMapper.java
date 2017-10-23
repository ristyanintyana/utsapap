package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.model.RuanganModel;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.One;

@Mapper
public interface RuanganMapper {

	@Select("select id, kode_ruang, deskripsi, tipe, status from ruangan")
	@Results(value = {
			@Result(property="id", column="id"),
			@Result(property="kode_ruang", column="kode_ruang"),
			@Result(property="deskripsi", column="deskripsi"),
			@Result(property="tipe", column="tipe"),
			@Result(property="status", column="status")
	})
	List<RuanganModel> selectAllRooms();

	
	@Select("select * from ruangan where id = #{id}")
	@Results(value = {
			@Result(property="id", column="id"),
			@Result(property="kode_ruang", column="kode_ruang"),
			@Result(property="deskripsi", column="deskripsi"),
			@Result(property="tipe", column="tipe"),
			@Result(property="panjang", column="panjang"),
			@Result(property="lebar", column="lebar"),
			@Result(property="harga_sewa", column="harga_sewa"),
			@Result(property="lokasi", column="lokasi"),
			@Result(property="fasilitas", column="fasilitas"),
			@Result(property="status", column="status")
	})
	RuanganModel selectRoom (@Param("id") String id);

}

