package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.entities.DidacticUnitModel;
import net.unikit.database.external.interfaces.managers.DidacticUnitModelManager;
import org.hibernate.SessionFactory;

/**
 * Created by Andreas on 20.11.2015.
 */
final class DidacticUnitModelManagerImpl
        extends AbstractModelManagerImpl<DidacticUnitModel, Integer, DidacticUnitModelImpl, Integer>
        implements DidacticUnitModelManager {
    private DidacticUnitModelManagerImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    public static DidacticUnitModelManager create(SessionFactory sessionFactory) {
        return new DidacticUnitModelManagerImpl(sessionFactory);
    }

    @Override
    public DidacticUnitModel createEntity() {
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
    protected void updateDatabaseFields(DidacticUnitModelImpl entityOld, DidacticUnitModelImpl entityNew) {

    }
}
