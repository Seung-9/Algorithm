SELECT r.rest_id, i.rest_name, i.food_type, i.favorites, i.address, round(avg(r.review_score), 2) as score
FROM rest_info i, rest_review r
WHERE i.rest_id = r.rest_id and i.address like '서울%'
GROUP BY r.rest_id
ORDER BY score desc, i.favorites desc