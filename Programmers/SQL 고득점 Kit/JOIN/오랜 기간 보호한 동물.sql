SELECT I.NAME, I.DATETIME
from ANIMAL_INS as I left outer join ANIMAL_OUTS as O on I.ANIMAL_ID = O.ANIMAL_ID
where O.ANIMAL_ID is NULL
order by I.DATETIME
limit 3;
