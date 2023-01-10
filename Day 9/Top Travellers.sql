select a.name, 
case  
    when b.user_id is null then 0
    else sum(distance)
end
as travelled_distance from Users as a
left join Rides as b
on a.id=b.user_id
group by user_id
order by travelled_distance desc, name asc
