USE quan_li_sinh_vien;
SELECT `subject`.* FROM `subject` 
WHERE Credit = (SELECT MAX(Credit) FROM `subject`);

SELECT `subject`.* ,mark.Mark FROM `subject`INNER JOIN mark ON `subject`.sub_id = mark.sub_id
ORDER BY  mark DESC
limit 1;

SELECT student.* , AVG(mark) FROM student INNER JOIN mark ON student.Student_Id = mark.Student_Id
GROUP BY Student_Id ORDER BY  Mark DESC LIMIT 3;

