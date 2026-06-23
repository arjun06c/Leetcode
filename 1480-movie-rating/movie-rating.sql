(select u.name as results from Users u
inner join MovieRating m
on u.user_id =m.user_id
group by m.user_id,u.name
order by count(*)desc , u.name limit 1)
union all
(select title as results from Movies m1
inner join MovieRating m2
on m1.movie_id=m2.movie_id 
where m2.created_at BETWEEN '2020-02-01' AND '2020-02-29' GROUP BY m2.movie_id, m1.title
 order by avg(rating) desc, m1.title limit 1);
