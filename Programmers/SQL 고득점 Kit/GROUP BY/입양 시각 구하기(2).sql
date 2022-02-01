with recursive CTE as(
    select 0 as HOUR
    UNION ALL
    select HOUR + 1
    from CTE
    where HOUR < 23)
select CTE.HOUR, count(ANIMAL_ID) as COUNT
from CTE left outer join ANIMAL_OUTS on CTE.HOUR = DATE_FORMAT(DATETIME, '%H')
group by CTE.HOUR;
