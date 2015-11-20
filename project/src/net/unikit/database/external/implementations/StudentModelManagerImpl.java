package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.entities.StudentModel;
import net.unikit.database.external.interfaces.managers.StudentModelManager;
import org.hibernate.SessionFactory;

/**
 * Created by Andreas on 20.11.2015.
 */
final class StudentModelManagerImpl
        extends AbstractModelManagerImpl<StudentModel, String, StudentModelImpl, String>
        implements StudentModelManager {
        private StudentModelManagerImpl(SessionFactory sessionFactory) {
                super(sessionFactory);
        }

        public static StudentModelManager create(SessionFactory sessionFactory) {
                return new StudentModelManagerImpl(sessionFactory);
        }

        @Override
        public StudentModel createEntity() {
                return null;
        }

        @Override
        protected String createIdFromBaseIdType(String id) {
                return null;
        }

        @Override
        protected String createBaseIdFromIdType(String id) {
                return null;
        }

        @Override
        protected Class getAnnotatedClass() {
                return null;
        }

        @Override
        protected void updateDatabaseFields(StudentModelImpl entityOld, StudentModelImpl entityNew) {

        }
}
