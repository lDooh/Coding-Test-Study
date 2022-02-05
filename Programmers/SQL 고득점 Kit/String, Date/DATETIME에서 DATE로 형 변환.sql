SELECT ANIMAL_ID, NAME, DATE_FORMAT(DATETIME, '%Y-%m-%d') as '날짜'   # y를 소문자로 하면 yy, 대문자로 하면 yyyy형태
from ANIMAL_INS
order by ANIMAL_ID;