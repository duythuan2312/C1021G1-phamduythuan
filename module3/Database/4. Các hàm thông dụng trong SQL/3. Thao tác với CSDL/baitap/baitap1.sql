USE quan_li_sinh_vien;
SELECT student.* FROM quan_li_sinh_vien.student WHERE student.Student_Name LIKE "H%";
SELECT class.* FROM quan_li_sinh_vien.class  WHERE class.Start_Date LIKE '____-12%';
SELECT class.* FROM  quan_li_sinh_vien.class WHERE month(Start_Date) = 12;
SELECT * FROM subject WHERE Credit BETWEEN 3 AND 5;
SET SQL_SAFE_UPDATES = 0;
UPDATE student
SET Class_ID = 2 WHERE Student_Name = "Hung";
SET SQL_SAFE_UPDATES = 1;
SELECT * FROM student;
SELECT student.student_name, `subject`.sub_name, mark.mark  FROM student INNER JOIN  mark ON student.Student_Id = mark.Student_Id 
INNER JOIN `subject` 
ON mark.Sub_Id = `subject`.Sub_Id
ORDER BY  mark DESC, student.student_name ASC;
