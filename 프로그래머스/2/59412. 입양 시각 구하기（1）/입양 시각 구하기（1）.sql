SELECT hour(datetime) as 'HOUR', count(datetime) as 'COUNT'
FROM animal_outs
GROUP BY hour
HAVING hour >= 9 and hour <= 19
ORDER BY hour