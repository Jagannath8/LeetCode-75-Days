select name as customers from Customers 
where id not in (select customerId from Orders)
