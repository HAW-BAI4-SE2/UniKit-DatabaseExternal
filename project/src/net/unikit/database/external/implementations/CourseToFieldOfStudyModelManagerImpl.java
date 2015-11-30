package net.unikit.database.external.implementations;

import net.unikit.database.implementations.AbstractModelManagerImpl;
import org.hibernate.SessionFactory;

/**
 * Created by Andreas on 20.11.2015.
 */
final class CourseToFieldOfStudyModelManagerImpl
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
        return new CourseToFieldOfStudyModelImpl();
    }

    @Override
    protected Integer createIdFromBaseIdType(Integer id) {
        return id;
    }

    @Override
    protected Integer createBaseIdFromIdType(Integer id) {
        return id;
    }

    @Override
    protected Class getAnnotatedClass() {
        return CourseToFieldOfStudyModelImpl.class;
    }

    @Override
    protected void updateDatabaseFields(CourseToFieldOfStudyModelImpl entityOld, CourseToFieldOfStudyModelImpl entityNew) {
        entityOld.setIdField(entityNew.getIdField());
        entityOld.setCourseField(entityNew.getCourseField());
        entityOld.setFieldOfStudyField(entityNew.getFieldOfStudyField());
    }
}
