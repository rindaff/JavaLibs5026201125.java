import javax.swing.JOptionPane;

public class JavaLibs5026201125{

	public static void main(String [] args){

		String nama = JOptionPane.showInputDialog("Masukkan nama Anda");
		
		JOptionPane.showMessageDialog(null, "halo " +nama);
		
		String dom = JOptionPane.showInputDialog("Masukkan tempat tinggal Anda");
		
		double tahun = Double.parseDouble(JOptionPane.showInputDialog("Umur saat masuk sekolah dasar"));
		
		int tinggi = Integer.parseInt(JOptionPane.showInputDialog("Masukkan tinggi badan"));

		int berat = Integer.parseInt(JOptionPane.showInputDialog("Masukkan berat badan"));

		int ukuran = Integer.parseInt(JOptionPane.showInputDialog("Masukkan ukuran sepatu"));

		String tempat = JOptionPane.showInputDialog("Tempat yang ingin Anda kunjungi");
		
		JOptionPane.showMessageDialog(null, "Wah " +tempat +" sangat menarik!");

		String food = JOptionPane.showInputDialog ("Apa makanan favoritmu?");
		
		double harga = Double.parseDouble(JOptionPane.showInputDialog("10000+10000"));

		String trans = JOptionPane.showInputDialog ("Satu jenis alat transportasi");
		
		int kali = Integer.parseInt(JOptionPane.showInputDialog("3*3"));
		
		JOptionPane.showMessageDialog(null, "Kemarin, saya pergi bersama sahabat saya yang bernama " +nama +" yang berasal dari " +dom +" . Kami sudah berteman \n selama " +tahun +" tahun bahkan kami 			sering dibilang kembar karena berpostur sama dengan tinggi " +tinggi +" cm dan berat badan " +berat +" kg. \n Ukuran sepatu pun sama yaitu " +ukuran +" . Kami jalan -jalan ke" +tempat +" . Disana kami 			membeli " +food +" seharga " +harga +". Setelah \n itu kami pulang dengan naik " +trans +" dan kami sampai di rumah pukul " +kali +" malam." );

		
	}

}


