# sorting-searching-basic_
Implementasi Bubble Sort dan Binary Search tanpa library
## Catatan Optimasi Algoritma

Di repositori ini, kedua algoritma sengaja tidak dibuat secara "polos", melainkan sudah diberi sedikit sentuhan optimasi agar kinerjanya lebih efisien. Berikut penjelasannya:

### 1. Optimasi pada Bubble Sort (Early Exit Flag)
Secara bawaan (*default*), algoritma Bubble Sort itu agak kurang peka. Meskipun datanya sudah rapi di tengah-tengah proses, dia akan tetap membandingkan angka sampai batas iterasi maksimalnya selesai. Tentu ini membuang-buang waktu *processing*.

* **Cara Optimasinya:** Saya menambahkan sebuah penanda (*flag*) bernama `swapped`.
* **Logikanya:** Di setiap putaran, program akan mengecek: *"Apakah ada angka yang bertukar tempat?"* * Jika **ADA**, proses pengecekan lanjut ke putaran berikutnya.
    * Jika **TIDAK ADA**, berarti seluruh data sudah benar-benar urut. Program akan langsung berhenti (*break*) detik itu juga tanpa menyelesaikan sisa perulangan yang tidak perlu.
* **Keuntungannya:** Jika kita memasukkan data yang sudah hampir urut, waktu eksekusinya akan jauh lebih cepat (bisa mencapai *Best Case* $O(n)$).

---

### 2. Optimasi pada Binary Search (Cegah Overflow Nilai Tengah)
Biasanya, cara standar untuk mencari indeks nilai tengah pada pencarian biner adalah dengan rumus: 
`mid = (low + high) // 2`

Rumus di atas tidak salah, namun kurang aman jika kita bekerja dengan data yang ukurannya sangat besar (skala jutaan/miliar) seperti pada bahasa Java atau C++. Penjumlahan `low + high` berisiko melebihi kapasitas maksimal memori yang bisa ditampung (*Integer Overflow*), yang akhirnya bisa membuat program *crash*.

* **Cara Optimasinya:** Rumusnya diubah menjadi: `mid = low + (high - low) // 2`
* **Logikanya:** Daripada menjumlahkan dua angka indeks yang berpotensi menghasilkan angka raksasa, kita hitung dulu **selisihnya** (jarak antara indeks tinggi dan rendah), dibagi dua, baru kemudian ditambahkan ke nilai `low`.
* **Keuntungannya:** Secara matematika hasil indeks tengahnya sama persis, tetapi cara ini jauh lebih aman dan *bulletproof* terhadap risiko *error* memori jika suatu saat program ini dikembangkan untuk skala data yang masif.
