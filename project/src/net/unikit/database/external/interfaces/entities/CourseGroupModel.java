package net.unikit.database.external.interfaces.entities;

/**
 * Created by Andreas on 19.11.2015.
 */
public interface CourseGroupModel {
    int getId();
    int getGroupNumber();
    void setGroupNumber(int groupNumberField);
    int getMaxGroupSize();
    void setMaxGroupSize(int maxGroupSizeField);
}
