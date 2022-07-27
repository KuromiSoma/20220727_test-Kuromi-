package com.example.demo;

import lombok.Data;

@Data
public class DesignUser {
	private int kaiin_id; //会員ID
	private int add_nm; //郵便番号
	private String add1; //住所（都道府県）
	private String add2; //住所（市町村）
	private String add3; //住所（番地）
	private int tel_no; // 電話番号
	private int uke_no; //受付ナンバー
	private String re_date; //受付日
	private String de_date; //納品日
	private String design_sz; //デザインサイズ
	private int mai_no; //枚数
	
	public int getKaiin_id() {
		return kaiin_id;
	}
	public void setKaiin_id(int kaiin_id) {
		this.kaiin_id = kaiin_id;
	}
	public int getAdd_nm() {
		return add_nm;
	}
	public void setAdd_nm(int add_nm) {
		this.add_nm = add_nm;
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
	public int getTel_no() {
		return tel_no;
	}
	public void setTel_no(int tel_no) {
		this.tel_no = tel_no;
	}
	public int getUke_no() {
		return uke_no;
	}
	public void setUke_no(int uke_no) {
		this.uke_no = uke_no;
	}
	public String getRe_date() {
		return re_date;
	}
	public void setRe_date(String re_date) {
		this.re_date = re_date;
	}
	public String getDe_date() {
		return de_date;
	}
	public void setDe_date(String de_date) {
		this.de_date = de_date;
	}
	public String getDesign_sz() {
		return design_sz;
	}
	public void setDesign_sz(String design_sz) {
		this.design_sz = design_sz;
	}
	public int getMai_no() {
		return mai_no;
	}
	public void setMai_no(int mai_no) {
		this.mai_no = mai_no;
	}
	
}
