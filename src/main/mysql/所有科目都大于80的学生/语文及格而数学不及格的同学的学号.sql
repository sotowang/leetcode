select  distinct name from grade.grade
where name not in
(select name from grade where course = '数学' and ifnull(score,0) >=60 )
and name not in
(select  name from grade where course = '语文' and ifnull(score,100) <60)
 ;
