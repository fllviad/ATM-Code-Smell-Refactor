ATM Code Smell Refactor

Project ini merupakan hasil refactor dari program simulasi ATM berbasis Java. Tujuan refactor adalah untuk menghilangkan berbagai jenis code smell dan meningkatkan kualitas kode.

Struktur Project

- before refactor: berisi source code sebelum dilakukan refactoring
- after refactor: berisi source code yang telah direfactor dan memperbaiki 5 code smell

Code Smell yang Diperbaiki

Berikut adalah lima jenis code smell yang diidentifikasi dan diperbaiki:

1. Long Method
   Method terlalu panjang dan melakukan banyak hal sekaligus
   Solusi: Memecah method jadi beberapa method kecil dengan satu tanggung jawab

2. Duplicate Code
   Kode yang sama atau sangat mirip muncul di lebih dari satu tempat
   Solusi:Menyatukan kode ke dalam satu method reusable atau utility method

3. Magic Number
   Angka yang langsung ditulis di dalam kode tanpa penjelasan
   Solusi: Mengganti angka tersebut dengan konstanta bernama agar lebih jelas maksudnya

4. Long Parameter List
   Method atau constructor memiliki parameter yang terlalu banyak
   Solusi: Membuat object baru sebagai pembungkus semua parameter tersebut

5. Feature Envy
   Method di satu class terlalu sering mengakses data atau method milik class lain
   Solusi: Memindahkan method tersebut ke class yang datanya paling sering digunakan

Cara Menjalankan

1. Compile semua file:
   javac after-refactor/*.java

2. Jalankan program utama:
   java after-refactor.ATMCaseStudy

Author:


@fllviad - Ade Esa Aldinnasyah Putra: Refactoring utama, dokumentasi, dan penulisan laporan

@aptaaaa - Muhammad Apta Chandrakanta: Inisialisasi repository dan struktur project

@Hessel45 - Hessel Marciello: Review refactoring dan testing kode hasil refactor

