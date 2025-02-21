select i.INGREDIENT_TYPE, sum(f.TOTAL_ORDER) as total_order
from ICECREAM_INFO i, FIRST_HALF f
where i.flavor = f.flavor
group by i.ingredient_type
order by f.total_order asc