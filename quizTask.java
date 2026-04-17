import java.util.Scanner;

public class quizTask {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // INTRO
            System.out.println(
                        "\u001B[34mSelamat Datang di Program untuk menghitung jumlah mahasiswa yang mengambil mata kuliah tertentu di setiap semesternya.\u001B[0m");

            int keseluruhanMahasiswa = 0;
            int keseluruhanMatkuliah = 0;
            // int newnumberMatkul = 0;

            String selection = "yes";

            // INPUT SEMESTER
            while (selection.equals("yes")) {
                  System.out.println("Lakukan Input Semester: ");
                  String semesterIni = sc.next();
                  String lagi = "yes";

                  int totalMatkul = 0;
                  int totalMahasiswa = 0;

                  // INPUT MATA KULIAH & JUMLAH MAHASISWA
                  // int numberMatkul = 0;
                  do {
                        // numberMatkul = numberMatkul + 1;
                        totalMatkul++;
                        System.out.println(
                                    "Inputkan Mata Kuliah ke - " + /* numberMatkul */ totalMatkul + " di Semester "
                                                + semesterIni);

                        System.out.println("Input Mata Kuliah: ");
                        // buat text biar ada spasinya
                        sc.nextLine();
                        String mataKuliah = sc.nextLine();
                        System.out.println("Input Jumlah Mahasiswa yang mengambil mata kuliah tersebut: ");
                        Integer jumlahMahasiswa = sc.nextInt();

                        System.out.println("\u001B[32m>Result In1put:\n");
                        System.out.println("Semester yang ditempuh: " + semesterIni);
                        System.out.println("Mata Kuliah ke - " + /* numberMatkul */ totalMatkul);
                        System.out.println("Dengan Mata Kuliah: " + mataKuliah);
                        System.out.println("Memiliki jumlah mahasiswa sebanyak: " + jumlahMahasiswa + "\u001B[0m");

                        System.out.println(
                                    "\u001B[31m>>>Apakah anda ingin menginput mata kuliah lain di semester yang sama? (yes/no)<<<\u001B[0m");

                        totalMahasiswa += jumlahMahasiswa;
                        // newnumberMatkul += totalMatkul;
                        lagi = sc.next();
                  } while (lagi.equals("yes"));

                  System.out.println("\u001B[32m>Result per Seemster: \n Total Mata Kuliah yang diambil pada semester "
                              + semesterIni + ", sebanyak "
                              + totalMatkul
                              + " mata kuliah, dengan jumlah mahasiswa yang mengambil mata kuliah tersebut sebanyak "
                              + totalMahasiswa + " mahasiswa.<<<<\u001B[0m");
                  keseluruhanMatkuliah += totalMatkul;
                  keseluruhanMahasiswa += totalMahasiswa;

                  System.out.println(
                              "\u001B[31m>>>Ketik 'yes' untuk melanjutkan program, ketik 'no' untuk keluar dari program.<<<\u001B[0m");

                  selection = sc.next();
            }

            System.out.println("\u001B[32m>Result Keseluruhan: \n");
            System.out.println(
                        "Total Mata Kuliah yang diambil pada seluruh semester yang diinput: " + keseluruhanMatkuliah);
            System.out.println("Total Keseluruhan Mahasiswa: " + keseluruhanMahasiswa + "\u001B[0m");
      }
}
