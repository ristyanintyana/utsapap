package com.example.model;


import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RuanganModel {
	private Integer id;
	private String kode_ruang;
	private String deskripsi;
	private int tipe;
	private double panjang;
	private double lebar;
	private double harga_sewa;
	private String lokasi;
	private String fasilitas;
	private int status;
}
