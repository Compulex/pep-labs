select student.id, student_name from class 
inner join student 
on class.class_title = student.class_title 
where class.teacher_name LIKE 'Ms. Lovelace';