SELECT I.ANIMAL_ID, O.NAME
from ANIMAL_INS as I left outer join ANIMAL_OUTS as O on I.ANIMAL_ID = O.ANIMAL_ID
where I.DATETIME > O.DATETIME
order by I.DATETIME;
