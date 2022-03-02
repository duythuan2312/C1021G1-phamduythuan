USE quan_li_sinh_vien;
SELECT address ,COUNT(student.student_id) AS "Số lượng học viên"
FROM student GROUP BY address;
SELECT student.student_id , AVG(Mark) FROM student INNER JOIN mark on student.student_id = mark.student_id
GROUP BY student.student_id ,student.student_name;

SELECT student.student_id , AVG(Mark) FROM student INNER JOIN mark on student.student_id = mark.student_id
GROUP BY student.student_id ,student.student_name HAVING AVG(Mark) >15;

SELECT student.student_id, student.Student_Name, AVG(Mark)
FROM student  INNER JOIN mark ON student.student_id = mark.student_id
GROUP BY student.Student_id,student.Student_Name
HAVING AVG(Mark) >= ALL (SELECT AVG(Mark) FROM mark GROUP BY mark.student_id);	