/*Волкова Таня ПИ19-4 (2.8-2.10: 26-32)*/
/*
26) Напишите запрос с подзапросом для получения данных обо всех оценках
студента с фамилией “Иванов”. Предположим, что его персональный
номер не известен.
!!!Иванова нет, работает с Котовым
*/
SELECT MARK 
FROM  exam_marks
WHERE STUDENT_ID = 
	(SELECT STUDENT_ID 
	FROM student
	WHERE SURNAME = "Котов");

/*
27) Напишите запрос, выбирающий данные об именах всех студентов ,
имеющих по предмету c идентификатором 101 балл выше общего
среднего балла.
!!! 101 нет, есть 10
*/
SELECT NAME, SURNAME
FROM  student, exam_marks
WHERE MARK >
	(SELECT AVG(MARK)
	FROM EXAM_MARKS)
AND student.STUDENT_ID = exam_marks.STUDENT_ID
AND SUBJ_ID = 10;

/*
28) Напишите запрос, который выполняет выборку имен всех студентов ,
имеющих по предмету c идентификатором 102 балл ниже общего
среднего балла.
!!! 101 нет, есть 10
*/
SELECT NAME, SURNAME
FROM  student, exam_marks
WHERE MARK <
	(SELECT AVG(MARK)
	FROM EXAM_MARKS)
AND student.STUDENT_ID = exam_marks.STUDENT_ID
AND SUBJ_ID = 10;

/*
29) Напишите запрос, выполняющий вывод количества предметов , по
которым экзаменовался каждый студент, сдававший более 20-ти
предметов.
!!! Больше 20 нет, есть больше 1
*/
SELECT COUNT(SUBJ_ID), STUDENT_ID
FROM exam_marks
GROUP BY STUDENT_ID
HAVING COUNT(SUBJ_ID) > 1;

/*
30) Напишите команду SELECT,использующую связанные подзапросы и
выполняющуювывод имен и идентификаторов студентов, у которых 
стипендия совпадает с максимальным значением стипендии для города, 
в котором живет студент.
*/
SELECT SURNAME, NAME, STUDENT_ID
FROM student A
WHERE STIPEND = 
	(SELECT MAX(STIPEND)
	FROM student B
	WHERE A.CITY = B.CITY);

/*
31) Напишите запрос, который позволяет вывести имена и 
идентификаторы всех студентов,для которых точно известно,
что они проживают в городе,где нет ни одного университета.
*/
SELECT SURNAME, NAME, STUDENT_ID
FROM student 
WHERE CITY NOT IN  
	(SELECT CITY
	FROM university);
	
/*
32) Напишите два запроса, которые позволяют вывести имена и 
идентификаторы всех студентов, для которых точно известно,
что они проживают не в том городе, где расположен их 
университет. Один запрос с использованием соединения, 
а другой – с использованием связанного подзапроса.
*/
SELECT SURNAME, NAME, STUDENT_ID
FROM student A
WHERE CITY != 
	(SELECT CITY
	FROM university B
	WHERE A.UNIV_ID = B.UNIV_ID);
	
SELECT NAME, SURNAME, STUDENT_ID
FROM student S
JOIN university U
ON (S.UNIV_ID = U.UNIV_ID) 
WHERE S.CITY != U.CITY;