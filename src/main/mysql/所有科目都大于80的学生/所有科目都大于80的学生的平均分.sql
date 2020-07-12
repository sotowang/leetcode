# 查询所有科目都大于80的学生的平均分
select  name as 姓名, avg(score) as 平均分 from grade
group by name having avg(score) >= 80;
