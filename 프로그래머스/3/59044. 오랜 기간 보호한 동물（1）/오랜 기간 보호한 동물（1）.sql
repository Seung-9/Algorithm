select a.name, a.datetime
from animal_ins a
where not exists (select animal_id from animal_outs b where a.animal_id = b.animal_id)
order by datetime asc limit 3