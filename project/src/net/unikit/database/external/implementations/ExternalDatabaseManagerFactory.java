package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.ExternalDatabaseManager;
import net.unikit.database.interfaces.DatabaseConfiguration;

/**
 * Created by Andreas on 19.11.2015.
 */
public final class ExternalDatabaseManagerFactory {
    public static ExternalDatabaseManager createExternalDatabaseManager(DatabaseConfiguration databaseConfiguration) {
        return ExternalDatabaseManagerImpl.create(databaseConfiguration);
    }
}
