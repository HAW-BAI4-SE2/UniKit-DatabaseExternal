package net.unikit.database.external.interfaces.entities;

import java.util.Date;

/**
 * Created by Andreas on 19.11.2015.
 */
public interface CourseLectureAppointmentModel extends AbstractModel<Integer> {
    Integer getId();

    CourseLectureModel getCourseLecture();
    void setCourseLecture(CourseLectureModel courseLecture);

    Date getStartDate();
    void setStartDate(Date startDate);

    Date getEndDate();
    void setEndDate(Date endDate);
}
