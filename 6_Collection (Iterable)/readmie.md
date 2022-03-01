# Collections (Iterable) 
struktur data yang dapat dilakukan iterasi
atau perulangan di dalamnya.interface iterable, menjadi interface tertinggi.
Setiap bagian dari interface iterable merupakan data yang dapat dilakukan
perulangan data yang sudah disimpan. cara menggunakan iterable , ada Foreach, iterator, spliterator. untuk menggunakan iterable
bisa menggunakan iterable sebgai tipe datanya, contohnya Iterable<string>names = list.of("Altera","academy").

## Iterator
merupakan kelas yang memanage iterasi yang ada di iterable, dan mengetahui data apa yang akan diambil.
contoh : Iterator<String> it = names.iterator();.

## Collection
kumpukan objek atau data yang dikumpukan dalam tempat yang sama. diatanranya adalaah, mengahapus data , menambah data, dll.
contoh collection seperti Arrylist, Collection<String>names = new ArrayList().

## List
interface yang menyediakan cara untuk menyimpan data secara linear, turunan dari interface Collection. List dapat menyimpan nilai data sama.
urutan data menurut siapa yang pertama kali dimasukan. Implementasi pada java list :
- Array list : menyediakan penyimpanan data yang dinamis, tidak terkait dari akan kapasitas data disimpan di array list tersebut, tapi tergantung memori.
- Linked list : merupakan struktur data yang menyimpan datanya saling terhubung, dengan cara menyimpan alamat memori dari masing-masing elemen setelah atau sebelumnya.
- Immutable List : merupakan bagian dari list, tapi datanya tidak dapat dirubah.
- Stack : menyimpan data secara linear tetapi dalam penambahan dan pengeluaran datanya menggyunakan sistem LIFO,
  Last In First Out. methodnya adalah : Pop = mengambil data, Push = menambah data , Pick = mengintip data.

## Set
sebuah strutur data yang menyimpan sekumpulan data secara linear sama seperti list tetapi, set tidak dapat menerima data duplikat. Jika terdapat 2 data duplikat maka yang 1 akan diabaikan.
- Hash : dikatan sebgai struktur data yang menyediakan cara tercepat untuk proses pencarian data. dan datanya sudah terurut.
- Linked Hastset : data yang diinputkan terlebih dahulu maka akan jadi data terdepan.
- EnumSet : digunakan untuk menyimpan nilai Enum, urutannya mengikuti penulisan enum tersebut.

## SortedSet
set yang mampu mengelola urutan dari data.

## Queue
menganut sistem FIFO, first in First out untuk data yang diambil. 