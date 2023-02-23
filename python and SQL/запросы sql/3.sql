/*Волкова Таня ПИ19-4 (2.11: 33-36)*/
/*
33) Напишите запрос с EXISTS, позволяющий вывести данные обо всех
студентах обучающихся в вузах, имеющих рейтинг выше 300.
*/
SELECT *
FROM student S
WHERE EXISTS 
	(SELECT *
	FROM university U
	WHERE RATING > 300
	AND S.UNIV_ID = U.UNIV_ID);

/*
34) Напишите предыдущий запрос, используя соединения.
*/
SELECT S.SURNAME, S.UNIV_ID, STUDENT_ID, U.RATING
FROM student S, university U 
WHERE S.UNIV_ID = U.UNIV_ID
AND RATING > 300;

SELECT student.*
FROM student
INNER JOIN university
ON student.UNIV_ID = university.UNIV_ID
AND university.RATING > 300;

/*
35) Напишите запрос с EXISTS, выбирающий сведения обо всех студентах,
для которых в том же городе, где живет студент, существуют
университеты, в которых он не учится.
*/
SELECT * 
FROM student S 
WHERE EXISTS 
	(SELECT * 
	FROM university U 
	WHERE S.CITY = U.CITY
	AND S.UNIV_ID != U.UNIV_ID);

/*
36) Напишите запрос, выбирающий из таблицы SUBJECT данные о названиях
предметов обучения, экзамены по которым сданы более чем 
одним студентом.
*/
SELECT SUBJ_NAME
FROM subject 
WHERE EXISTS 
	(SELECT * 
	FROM exam_marks A 
	WHERE subject.SUBJ_ID= A.SUBJ_ID
	AND A.MARK > 2 
	AND 1 < 
		(SELECT COUNT(*) 
		FROM exam_marks B 
		WHERE B.SUBJ_ID= subject.SUBJ_ID
		AND B.MARK > 2 
		AND A.STUDENT_ID != B.STUDENT_ID));
		
SELECT SUBJ_NAME
FROM SUBJECT
WHERE EXISTS 
	(SELECT MARK 
	FROM EXAM_MARKS 
	WHERE SUBJECT.SUBJ_ID = EXAM_MARKS.SUBJ_ID 
	AND MARK IS NOT NULL);
