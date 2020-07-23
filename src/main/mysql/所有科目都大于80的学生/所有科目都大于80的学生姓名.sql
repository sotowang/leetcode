# 查询所有科目都大于80的学生
select name as 姓名 from grade group by 姓名 having min(score)>=60;

select distinct name as 姓名 from grade where
name not in(select name from grade where score<80);
