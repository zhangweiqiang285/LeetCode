select Name Customers from  Customers as c
Left join Orders as o
on c.Id = o.CustomerId
where o.CustomerId is null