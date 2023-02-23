/*Волкова Таня ПИ19-4 (2.12-2.14: 37-40)*/
/*
37) Напишите запрос, выбирающий данные о названиях университетов,
рейтинг которых равен или превосходит рейтинг Воронежского
государственного университета.
*/
SELECT UNIV_NAME
FROM university
WHERE RATING >=
	(SELECT RATING
	FROM university
	WHERE UNIV_NAME == "ВГУ");

/*
38) Напишите запрос, использующий ANY или ALL, выполняющий выборку
данных о студентах, у которых в городе их постоянного местожительства нет университета.
*/
SELECT STUDENT_ID, NAME, CITY
FROM student
WHERE CITY != ANY
	(SELECT CITY
	FROM university);

/*
39) Напишите запрос, выбирающий из таблицы EXAM_MARKS данные о
названиях предметов обучения, для которых значение полученных 
на экзамене оценок (поле MARK) превышает любое значение оценки 
для предмета, имеющего идентификатор равный 105.
!!!105 нет, есть 22
*/
SELECT  DISTINCT SUBJ_ID, MARK
FROM exam_marks 
WHERE MARK > ANY
	(SELECT MARK
	FROM exam_marks 
	WHERE SUBJ_ID = 22);

/*
40) Напишите этот же запрос с использованием MAX.
!!!105 нет, есть 22
*/
SELECT DISTINCT SUBJ_ID 
FROM exam_marks 
WHERE MARK > 
	(SELECT MAX(MARK) 
	FROM exam_marks 
	WHERE SUBJ_ID = 22);