/*SELECT ANIMAL_ID, NAME
from ANIMAL_OUTS
where ANIMAL_ID not in (select ANIMAL_ID
                         from ANIMAL_INS)
order by ANIMAL_ID;*/

select O.ANIMAL_ID, O.NAME
from ANIMAL_OUTS as O left outer join ANIMAL_INS as I on O.ANIMAL_ID = I.ANIMAL_ID
where I.ANIMAL_ID is NULL
order by O.ANIMAL_ID;
