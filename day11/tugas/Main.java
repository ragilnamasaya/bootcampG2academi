import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Crud crud = new Crud();
	
		Scanner in = new Scanner(System.in);
	
		System.out.println("APLIKASI MAHASISWA");
		System.out.println("==================\n");
		
		System.out.println("Masukan Username :");
		String username = in.nextLine();
		
		System.out.println("Masukan Password :");
		String password = in.nextLine();
		
		boolean validasi = crud.Validation(username, password);
		
		if(validasi) {
			System.out.println("Selamat Anda Berhasil Login...");
			
			String input = "";
			
			
			while (!input.equals("4")) {
				// menu
		    	   System.out.println("MENU");
		    	   System.out.println("1. Create & Input Data Mahasiswa");
		    	   System.out.println("2. Edit or Delete Data Mahasiswa");
		    	   System.out.println("3. laporan Nilai Data Mahasiswa");
		    	   System.out.println("4. Exit \n");
		    	   
		    	   System.out.println("Masukan Pilihan");
		    	   input = in.nextLine();
		    	   
		    	   switch (input) {
				case "1":
					
					System.out.println("Masukan Nama : ");
					String nama = in.nextLine();
					
					System.out.println("Masukan Nilai Bahasa Inggris : ");
					double inggris = in.nextDouble();
					
					System.out.println("Masukan Nilai Fisika : ");
					double fisika = in.nextDouble();
					
					System.out.println("Masukan Nilai algoritma : ");
					double algoritma = in.nextDouble();
					
					crud.createDataMahasiswa(nama, inggris, fisika, algoritma);
					
					break;
				
				case "2":
					System.out.println("Masukan ID : ");
					int id = in.nextInt();
					in.nextLine();
					
					System.out.println("1. Edit data");
					System.out.println("2. Hapus Data \n");
			
					System.out.println("Masukan Pilihan : ");
					String editOrRemove = in.nextLine();
					
					switch (editOrRemove) {
					case "1":
						
						System.out.println("Pilih Edit : \n");
						System.out.println("1. Edit ID");
						System.out.println("2. Edit Nama");
						System.out.println("3. Edit Nilai Bahasa Indonesia");
						System.out.println("4. Edit Nilai Fisika");
						System.out.println("5. Edit Nilai Algoritma \n");
						
						System.out.println("Masukan Pilihan. :");
						String pilihEdit = in.nextLine();
						
						switch (pilihEdit) {
						case "1":
							
							System.out.println("Masukan ID Baru : ");
							int newID = in.nextInt();
					
							crud.editIdMahasiswa(id, newID);
							
							break;
						case "2":
							System.out.println("Masukan nama Baru :");
							String newName = in.nextLine();
							
							crud.editNamaMahasiswa(id, newName);
							
							break;
						case "3":
							System.out.println("Masukan Nilai Bahasa Inggris Baru : ");
							double nilai = in.nextDouble();
							
							crud.editNilaiB_Inggris(id, nilai);
						
							break;
						case "4":
							System.out.println("Masukan Nilai Fisika Baru : ");
							nilai = in.nextDouble();
							
							crud.editNilaiFisika(id, nilai);
							
							break;
						case "5":
							System.out.println("Masukan Nilai Algoritma :");
							nilai = in.nextDouble();
							
							crud.editNilaiAlgoritma(id, nilai);
							break;

						default:
							System.out.println("Inputan anda salah");
							break;
						}
						
						break;
					case "2":
						crud.hapusDataMahasiswa(id);
						break;
					
					default:
						System.out.println("Inputan anda salah");
						break;
					}
					
					break;
				case "3":
					crud.printLaporan();
					break;
				case "4":
					break;
					
				default:
					System.out.println("Inputan anda salah");
					break;
				}
			}
		} else {
			System.out.println("anda gagal login..");
		}
		
		
		
	

	}

}
