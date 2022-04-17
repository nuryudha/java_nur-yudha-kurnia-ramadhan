#Database
##DDL
--> DDL data definition language : data yang digunakan untuk menentukan ( Select , create , drop ,
alter ( panambahan struktur, seperti menambah kolom , tipe data , merubah kolom, auto increment, primary key)
##DML
--> DML data manipulation language : (Select * Form, yang mau dicari form apa , )
update ( update isi tabelnya / update data ) 

foreign key = terconnect antar database

menampilkan nama belakang di (dbeaver)
select  * from actor where last_name = 'guiness'
menampilkan nama depan di (mysql Workbecn)
select * from sakila.actor where first_name = 'penelope'

noted
(;) digunakan untuk menghentikan

tabel master
tidak ada perulangan (perubahan)
perubahan yang minor (perubahan jenis kelamin dll)

tabel transaksi
perubahan yang banyak seperti setiap menit detik (transaksi jual beli contohnya)

timestamp
biasanya ada jamnya , untuk nyimpen jam

datestamp
buat nyimpen data berupa tanggal contoh 09.04.2022

bedanya
where country "="
bener2 ga boleh typo. harus sama persis

where county "like"
bisa menggunakan kata kunci / huruf kuncinya aja

##JOIN
Menghubungkan 2 tabel - foreign key lewat primary key (connect antar tabel_
ALTER TABLE alta_online_shop.products MODIFY COLUMN id int auto_increment NOT NULL;
ALTER TABLE alta_online_shop.products ADD CONSTRAINT products_FK FOREIGN KEY (id) REFERENCES alta_online_shop.product_types(id);

PRIAMRY KEY
ALTER TABLE alta_online_shop.product_descriptions ADD CONSTRAINT product_descriptions_pk PRIMARY KEY (id);

JOIN 2
select * from city c join country co on c.country_id = co.country_id
// dari tabel cituy yang country id samain dengan country id di country
//kalau bintang itu semuanya
menampilkan sebagian
select c.city, c.country_id,c.last_update,co.country,co.last_update from city c join country co on c.country_id = co.country_id
INSERT INTO digital_outlet_pulsa.users