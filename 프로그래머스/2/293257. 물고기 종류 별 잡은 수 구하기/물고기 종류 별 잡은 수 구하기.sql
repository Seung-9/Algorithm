select count(n.fish_name) as fish_count, n.fish_name
from fish_info f, fish_name_info n
where f.fish_type = n.fish_type
group by fish_name
order by fish_count desc;