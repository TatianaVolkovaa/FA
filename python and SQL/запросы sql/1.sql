/*Волкова Таня ПИ19-4 (2.5-2.7: 21-25)*/
/* 21) Предположим, что стипендия всем студентам увеличена 
на 20%. Напишите запрос к таблице STUDENT, выполняющий 
вывод номера студента, фамилию студента и величину 
увеличенной стипендии. Выходные данные упорядочить:
а) по значению послед него столбца (величине стипендии);
б) в алфавитном порядке фамилий студентов.
*/
SELECT student_id, surname, stipend*1.2 "increased stipend"
FROM student
ORDER BY 3;

SELECT student_id, surname, stipend*1.2 "increased stipend"
FROM student
ORDER BY surname;

/* 22) Напишите запрос, который по таблице EXAM_MARKS 
позволяет найти а) максимальные и 
б) минимальные оценки каждого студента и выводит их 
вместе с идентификатором студента.
*/
SELECT student_id, max(mark)
FROM exam_marks
GROUP BY student_id;

SELECT student_id, min(mark)
FROM exam_marks
GROUP BY student_id;

/* 23) Напишите запрос, выполняющий вывод списка предметов 
обучения в порядке а) убывания семестров и 
б) возрастания количества отводимых на предмет часов. 
Поле семестра в выходных данных должно быть первым, 
за ним должны следовать имя предмета обучения и 
идентификатор предмета.
*/
SELECT semester, subj_name, subj_id
FROM subject
ORDER BY semester DESC;

SELECT semester, subj_name, subj_id, hour
FROM subject
ORDER BY hour;

/* 24) Напишите запрос, который для каждой даты сдачи 
экзаменов выполняет вывод суммы баллов всех студентов 
и представляет результаты в порядке убывания этих сумм.
*/
SELECT exam_date, sum(mark) "sum"
FROM exam_marks
GROUP BY exam_date
ORDER BY sum DESC;

/* 25) Напишите запрос, который для каждой даты сдачи 
экзаменов выполняет вывод а) среднего, б) минимального, 
в) максимального баллов всех студентов и представляет 
результаты в порядке убывания этих значений.
*/
SELECT exam_date, avg(mark) "avg"
FROM exam_marks
GROUP BY exam_date
ORDER BY avg DESC;

SELECT exam_date, min(mark) "avg"
FROM exam_marks
GROUP BY exam_date
ORDER BY avg DESC;

SELECT exam_date, max(mark) "avg"
FROM exam_marks
GROUP BY exam_date
ORDER BY avg DESC;