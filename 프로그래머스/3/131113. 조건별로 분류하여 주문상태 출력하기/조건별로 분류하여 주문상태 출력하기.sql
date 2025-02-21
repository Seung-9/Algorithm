select order_id, product_id, date_format(out_date, '%Y-%m-%d'), if(out_date > '2022-05-01', '출고대기', if(OUT_DATE <= '2022-05-01', '출고완료', '출고미정')) AS 출고여부
from food_order
order by order_id asc