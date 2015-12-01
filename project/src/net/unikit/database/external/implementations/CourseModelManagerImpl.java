package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.entities.CourseModel;
import net.unikit.database.external.interfaces.managers.CourseModelManager;
import net.unikit.database.implementations.AbstractModelManagerImpl;
import org.hibernate.SessionFactory;

/**
 * Created by Andreas on 20.11.2015.
 */
final class CourseModelManagerImpl
        extends AbstractModelManagerImpl<CourseModel, Integer, CourseModelImpl, Integer>
        implements CourseModelManager {
    private CourseModelManagerImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    public static CourseModelManager create(SessionFactory sessionFactory) {
        return new CourseModelManagerImpl(sessionFactory);
    }

    @Override
    public CourseModel createEntity() {
        return new CourseModelImpl();
    }

    @Override
    protected Class getAnnotatedClass() {
        return CourseModelImpl.class;
    }

    @Override
    protected void updateDatabaseFields(CourseModelImpl entityOld, CourseModelImpl entityNew) {
        entityOld.setIdField(entityNew.getIdField());
        entityOld.setNameField(entityNew.getNameField());
        entityOld.setAbbreviationField(entityNew.getAbbreviationField());
        entityOld.setSemesterField(entityNew.getSemesterField());
        entityOld.setMinTeamSizeField(entityNew.getMinTeamSizeField());
        entityOld.setMaxTeamSizeField(entityNew.getMaxTeamSizeField());
        entityOld.setCourseLectureField(entityNew.getCourseLectureField());
        entityOld.setCourseGroupModels(entityNew.getCourseGroupModels());
        entityOld.setCourseToFieldOfStudyModels(entityNew.getCourseToFieldOfStudyModels());
        entityOld.setCompletedCourseModels(entityNew.getCompletedCourseModels());
    }
}
