SELECT f.flavor
FROM first_half f, icecream_info i
WHERE f.flavor = i.flavor and total_order > 3000 and ingredient_type like '%fruit_based%'
ORDER BY f.total_order desc