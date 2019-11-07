/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118008.latihan52.siapakamu;

/**
 *
 * @author ASUS
 */
public class Dosen extends Manusia {
	private String nip, mataKuliah;

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getMataKuliah() {
		return mataKuliah;
	}

	public void setMataKuliah(String mataKuliah) {
		this.mataKuliah = mataKuliah;
	}

	public void mengajarApa(){
		System.out.printf("Saya %s umur %d tahun sedang mengajar kelas %s\n", this.nama, this.umur, this.mataKuliah);
	}	

	public void siapaKamu(){
		System.out.println("Saya Dosen");	
	}
}
