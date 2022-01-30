select name
from (SELECT NAME
      from ANIMAL_INS
      order by DATETIME) A
limit 1;
