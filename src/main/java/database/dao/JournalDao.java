package database.dao;

import database.entities.JournalEntity;

public class JournalDao extends DaoInterfaceImp<JournalEntity, String> {
    public JournalDao() {
        super(JournalEntity.class);
    }
}
