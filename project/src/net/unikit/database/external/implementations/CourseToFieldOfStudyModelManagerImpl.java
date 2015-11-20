package net.unikit.database.external.implementations;

import org.hibernate.SessionFactory;

/**
 * Created by Andreas on 20.11.2015.
 */
public class CourseToFieldOfStudyModelManagerImpl
        extends AbstractModelManagerImpl<CourseToFieldOfStudyModel, Integer, CourseToFieldOfStudyModelImpl, Integer>
        implements CourseToFieldOfStudyModelManager {
    private CourseToFieldOfStudyModelManagerImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    public static CourseToFieldOfStudyModelManager create(SessionFactory sessionFactory) {
        return new CourseToFieldOfStudyModelManagerImpl(sessionFactory);
    }

    @Override
    public CourseToFieldOfStudyModel createEntity() {
        return null;
    }

    @Override
    protected Integer createIdFromBaseIdType(Integer id) {
        return null;
    }

    @Override
    protected Integer createBaseIdFromIdType(Integer id) {
        return null;
    }

    @Override
    protected Class getAnnotatedClass() {
        return null;
    }

    @Override
    protected void updateDatabaseFields(CourseToFieldOfStudyModelImpl entityOld, CourseToFieldOfStudyModelImpl entityNew) {

    }
}
