> Muhammad Satya Adhi Wicaksana:
bagi query join yg tdii

> yudha:
select t.user_id , 
t.payment_method_id , 
t.status , 
t.total_qty , 
t.total_price ,
t.created_at , 
t.updated_at , 
pm.nama , 
u.nama , 
u.alamat , 
u.tanggal_lahir , 
u.gender  
from transactions t 
join payment_methods pm on t.payment_method_id  = pm.id 
join users u on t.user_id = u.id