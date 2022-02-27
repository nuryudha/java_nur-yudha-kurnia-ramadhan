# TIME COMPLEXITY
Complexity adalah ukuran waktu operasi dapat dilakukan , seperti operasi aritmatika, bisa juga pemberian nilai
perbandingan dan lainnya. Dalam mengukur time complexitiy dapat diukur pada operasi yang paling dominan
pada suatu kegiatan. Bagian yang paling dominan biasanya For (karena aktivitas di sini berulang sebanyak n yang dimasukan).

## Constant Time - 0 (1)
tidak ada proses yang berulang di dalamnya.
## Linear Time - 0 (n)
Proses perulangan yang dilakukan sebanyak jumlah N. Perulangan linear juga bisa 0 (n + m) jadi terdapat 2 buah parameter,
## Logaritmic Time 0 (log n)
Perulangan yang berjalan terdapat operasi yang ada dan nilai tersebut disimpan untuk ke perulangan selanjutnya.
## Quadratic Time 0 (n^2)
Terdapat 2 buah perulangan yang perulangnnya bersarang, yaitu ada perulangan dalam sebuah perulangan.
Menyebabkan perulangan pertama lanjut ke perulangan kedua hingga perulangan kedua selesai lalu lanjut ke 
perulangan pertama kemudian balik ke perulangan kedua hingga selesai, begitu seterusnya.

## Time Limit
Acuan batasaan, agar dalam menulis algoritma tidak lebih dari batasan komputer dalam menyelesaikan tugas
n <= 1.000.000 menggunakan 0(n) atau 0(n log n)
n <= 10.000 menggunakan 0(n^2)
n <= 500 menggunakan 0 (n^3)
