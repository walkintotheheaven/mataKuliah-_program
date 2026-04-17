# 📊 Program Perhitungan Jumlah Mahasiswa per Mata Kuliah

## 📌 Deskripsi

Program ini merupakan aplikasi berbasis **Java** yang dirancang untuk menghitung jumlah mahasiswa yang mengambil mata kuliah tertentu pada setiap semester.

Program memungkinkan pengguna untuk melakukan input data secara dinamis, meliputi:

* Semester
* Mata kuliah
* Jumlah mahasiswa pada setiap mata kuliah

Hasil yang ditampilkan mencakup rekapitulasi per semester serta total keseluruhan dari seluruh semester yang diinput.

---

## 🎯 Tujuan

Pengembangan program ini bertujuan untuk:

1. Mengimplementasikan konsep **perulangan (looping)** menggunakan `while` dan `do-while`
2. Memahami penggunaan **counter** (penghitung jumlah data)
3. Menerapkan **accumulator** (penjumlahan total data)
4. Menggunakan class **Scanner** untuk interaksi input pengguna
5. Mengelola alur logika program berbasis input dinamis

---

## ⚙️ Fitur Utama

* Input semester secara berulang
* Input banyak mata kuliah dalam satu semester
* Mendukung input teks dengan spasi (contoh: *Basis Data*)
* Perhitungan otomatis:

  * Jumlah mata kuliah per semester
  * Jumlah mahasiswa per semester
  * Total keseluruhan mata kuliah
  * Total keseluruhan mahasiswa
* Tampilan output berwarna menggunakan ANSI Escape Code

---

## 🧠 Konsep yang Digunakan

### 1. Looping

* `while` → untuk mengulang input semester
* `do-while` → untuk input mata kuliah dalam satu semester

### 2. Counter

Digunakan untuk menghitung jumlah mata kuliah:

```java
totalMatkul++;
```

### 3. Accumulator

Digunakan untuk menjumlahkan total mahasiswa:

```java
totalMahasiswa += jumlahMahasiswa;
```

### 4. Input Scanner

Menggunakan kombinasi:

* `next()` → untuk input satu kata
* `nextInt()` → untuk angka
* `nextLine()` → untuk teks dengan spasi

---

## 🧾 Alur Program

1. Program meminta input semester
2. Pengguna menginput mata kuliah dan jumlah mahasiswa
3. Program menampilkan hasil input
4. Pengguna dapat menambah mata kuliah dalam semester yang sama
5. Program menampilkan hasil per semester
6. Data diakumulasi ke total keseluruhan
7. Pengguna dapat melanjutkan ke semester berikutnya atau keluar
8. Program menampilkan hasil keseluruhan

---

## 🖥️ Contoh Output

```
Selamat Datang di Program...

Input Semester: 1
Input Mata Kuliah: Basis Data
Jumlah Mahasiswa: 30

Result:
Semester: 1
Mata Kuliah ke-1: Basis Data
Jumlah Mahasiswa: 30

Total Semester:
2 mata kuliah, 60 mahasiswa

Result Keseluruhan:
Total Mata Kuliah: 4
Total Mahasiswa: 120
```

---

## ⚠️ Catatan

* Penggunaan `nextLine()` diperlukan untuk menangani input teks yang mengandung spasi
* `totalMatkul` dan `totalMahasiswa` di-reset setiap semester agar data tidak tercampur
* Akumulasi keseluruhan dilakukan di dalam loop utama agar hasil akurat

---

## 🚀 Kesimpulan

Program ini berhasil mengimplementasikan konsep dasar pemrograman Java, khususnya dalam:

* Pengolahan input dinamis
* Penggunaan struktur kontrol
* Pengelolaan data sederhana

Program dapat dikembangkan lebih lanjut menjadi sistem akademik sederhana dengan fitur penyimpanan data atau antarmuka grafis.

---
