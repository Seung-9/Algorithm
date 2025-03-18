SELECT route,
    CONCAT(ROUND(sum(d_between_dist), 1),'km') as total_distance, 
    CONCAT(ROUND(avg(d_between_dist), 2), 'km') as average_distance
FROM SUBWAY_DISTANCE
GROUP BY route
ORDER BY ROUND(sum(d_between_dist), 1) desc