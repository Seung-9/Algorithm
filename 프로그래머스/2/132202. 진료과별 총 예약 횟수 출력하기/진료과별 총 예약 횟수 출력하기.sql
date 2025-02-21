SELECT mcdp_cd as '진료과코드', 
count(mcdp_cd) as '5월예약건수' 
from appointment 
where month(apnt_ymd) = '05'
group by mcdp_cd
order by count(mcdp_cd) asc, mcdp_cd asc