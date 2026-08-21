# Write your MySQL query statement below
select product_id,year as first_year, quantity,price
from Sales
where (product_id,year) in (
    select product_id, MIN(year) as year
    from sales
    group by product_id
);