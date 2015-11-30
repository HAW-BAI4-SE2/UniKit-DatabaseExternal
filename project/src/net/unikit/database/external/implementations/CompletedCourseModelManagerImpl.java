package net.unikit.database.external.implementations;

import net.unikit.database.implementations.AbstractModelManagerImpl;
import org.hibernate.SessionFactory;

/**
 * Created by Andreas on 20.11.2015.
 */
final class CompletedCourseModelManagerImpl
        extends AbstractModelManagerImpl<CompletedCourseModel, Integer, CompletedCourseModelImpl, Integer>
        implements CompletedCourseModelManager {
    private CompletedCourseModelManagerImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    public static CompletedCourseModelManager create(SessionFactory sessionFactory) {
        return new CompletedCourseModelManagerImpl(sessionFactory);
    }

    @Override
    public CompletedCourseModel createEntity() {
        return new CompletedCourseModelImpl();
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
        return CompletedCourseModelImpl.class;
    }

    @Override
    protected void updateDatabaseFields(CompletedCourseModelImpl entityOld, CompletedCourseModelImpl entityNew) {
        entityOld.setIdField(entityNew.getIdField());
        entityOld.setStudentField(entityNew.getStudentField());
        entityOld.setCourseField(entityNew.getCourseField());
    }
}
