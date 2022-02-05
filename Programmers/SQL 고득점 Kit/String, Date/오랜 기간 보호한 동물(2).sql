SELECT I.ANIMAL_ID, I.NAME
from ANIMAL_INS as I left outer join ANIMAL_OUTS as O on I.ANIMAL_ID = O.ANIMAL_ID
where O.ANIMAL_ID is not NULL
order by O.DATETIME - I.DATETIME desc
limit 2;