CREATE TABLE pegawai (	nip  VARCHAR(3) NOT NULL PRIMARY KEY,
                          nama VARCHAR(50),
                          kota VARCHAR(30),
                          tgl_lahir DATE,
                          jk CHAR(1),
                          kj VARCHAR(3));

CREATE TABLE anak (		nip  VARCHAR(3),
                           nama VARCHAR(50),
                           jk CHAR(1),
                           umur INT);

CREATE TABLE jabatan (	kj VARCHAR(3) NOT NULL PRIMARY KEY,
                          jabatan VARCHAR(30),
                          gaji decimal);


-- LOAD DATA
INSERT INTO pegawai VALUES	('N01', 'YAHYA', 'JAKARTA','19800120', 'L', 'J02'),
                              ('N02', 'BAYU', 'JAKARTA','19800208', 'L', 'J01'),
                              ('N03', 'M ZAININ DAHLAN', 'CIBINONG','19811203', 'L', 'J03'),
                              ('N04', 'AHMAD RIZAL', 'JAKARTA','19830317', 'L', 'J03'),
                              ('N05', 'MULIA', 'JAKARTA','19860605', 'P', 'J04'),
                              ('N06', 'UMI', 'JAKARTA','19860106', 'P', 'J06'),
                              ('N07', 'LUKMANUL HAKIM', 'BEKASI','19820624', 'L', 'J06'),
                              ('N08', 'RIAN SANJAYA', 'BOGOR','19840513', 'L', 'J03'),
                              ('N09', 'AZIZAH RAHMA', 'JAKARTA','19870301', 'P', 'J02'),
                              ('N10', 'RAHMAT MULYANTO', 'BEKASI','19810919', 'L', 'J01')
;

INSERT INTO ANAK VALUES		('N02', 'HARIS STIAWAN', 'L', 10),
                               ('N02', 'HANNDY', 'P', 5),
                               ('N05', 'S HALIZAH', 'P', 9),
                               ('N05', 'M SULTAN RAISYAH', 'P', 1),
                               ('N03', 'INDAH ANJARWATI', 'P', 9),
                               ('N04', 'SAYID NUGRAHA', 'L', 9),
                               ('N04', 'HAMZAH NUR IKBAL', 'L', 5),
                               ('N04', 'DEVIE KLENDER', 'P', 3),
                               ('N04', 'JULIANA PUTRI MERBABU', 'P', 17)
;

INSERT JABATAN VALUES		('J01', 'MARKETING LEADER', 9500000),
							('J02', 'SYSTEM ANALYST', 8500000),
							('J03', 'PROGRAMMER', 8000000),
							('J04', 'NETWORK ENGINEER', 5500000),
							('J05', 'DATABASE ADMINISTRATOR', 5000000),
							('J06', 'SEKRETARIS', 4000000)
							;