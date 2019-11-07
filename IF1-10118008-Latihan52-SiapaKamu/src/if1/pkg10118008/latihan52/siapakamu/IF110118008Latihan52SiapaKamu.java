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
public class IF110118008Latihan52SiapaKamu {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Mahasiswa mhs = new Mahasiswa();
		Dosen dsn = new Dosen();
		dsn.setNip("41227829930");
		dsn.setMataKuliah("PBO");
		dsn.setNama("Rizki Adam Kurniawan");
		dsn.setUmur(27);
		System.out.println("NIP DOSEN : " + dsn.getNip());
		dsn.siapaKamu();
		dsn.mengajarApa();
		mhs.setNama("Nindi");
		mhs.setUmur(17);
		mhs.setNim("10110269");
		mhs.setKelas("PBO");
		System.out.println("\nNIM MAHASISWA : " + mhs.getNim());
		mhs.siapaKamu();
		mhs.kelasApa();
	}
	
}
