package com.example.demo.mmRegister;

import lombok.Data;
import java.sql.Timestamp;

@Data
public class mmRegisterForm {
	private int kaiinId; //会員ID
	private String gdNm; //デザイン会社名
	private String telNo; // 電話番号
	private String addNo; //郵便番号
	private String add1; //住所（都道府県）
	private String add2; //住所（市町村）
	private String add3; //住所（番地）
	private Timestamp reDa; //注文日
	private Timestamp deDa; //納品日
	private String szDa; //サイズ
	private String noDa; //枚数
	public int getKaiinId() {
		return kaiinId;
	}
	public void setKaiinId(int kaiinId) {
		this.kaiinId = kaiinId;
	}
	public String getGdNm() {
		return gdNm;
	}
	public void setGdNm(String gdNm) {
		this.gdNm = gdNm;
	}
	public String getTelNo() {
		return telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	public String getAddNo() {
		return addNo;
	}
	public void setAddNo(String addNo) {
		this.addNo = addNo;
	}
	public String getAdd1() {
		return add1;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	public String getAdd2() {
		return add2;
	}
	public void setAdd2(String add2) {
		this.add2 = add2;
	}
	public String getAdd3() {
		return add3;
	}
	public void setAdd3(String add3) {
		this.add3 = add3;
	}
	public Timestamp getReDa() {
		return reDa;
	}
	public void setReDa(Timestamp reDa) {
		this.reDa = reDa;
	}
	public Timestamp getDeDa() {
		return deDa;
	}
	public void setDeDa(Timestamp deDa) {
		this.deDa = deDa;
	}
	public String getSzDa() {
		return szDa;
	}
	public void setSzDa(String szDa) {
		this.szDa = szDa;
	}
	public String getNoDa() {
		return noDa;
	}
	public void setNoDa(String noDa) {
		this.noDa = noDa;
	}
	
}
