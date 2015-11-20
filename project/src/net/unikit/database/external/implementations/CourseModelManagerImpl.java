package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.entities.CourseModel;
import net.unikit.database.external.interfaces.managers.CourseModelManager;
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
    protected Integer createIdFromBaseIdType(Integer id) {
        return id;
    }

    @Override
    protected Integer createBaseIdFromIdType(Integer id) {
        return id;
    }

    @Override
    protected Class getAnnotatedClass() {
        return CourseModelImpl.class;
    }

    @Override
    protected void updateDatabaseFields(CourseModelImpl entityOld, CourseModelImpl entityNew) {

    }
}
