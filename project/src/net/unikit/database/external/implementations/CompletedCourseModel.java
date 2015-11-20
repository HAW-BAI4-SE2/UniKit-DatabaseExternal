package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.entities.AbstractModel;
import net.unikit.database.external.interfaces.entities.CourseModel;
import net.unikit.database.external.interfaces.entities.StudentModel;

/**
 * Created by Andreas on 19.11.2015.
 */
interface CompletedCourseModel extends AbstractModel<Integer> {
    Integer getId();

    StudentModel getStudent();
    void setStudent(StudentModel student);

    CourseModel getCourse();
    void setCourse(CourseModel course);
}
