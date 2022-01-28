
package com.sg.classroster.service;

import com.sg.classroster.dao.ClassRosterAuditDao;
import com.sg.classroster.dao.ClassRosterPersistenceException;

/**
 *
 * @author kurtiswong
 */
public class ClassRosterAuditDaoStubImpl implements ClassRosterAuditDao {
    
    @Override 
    public void writeAuditEntry(String Entry) throws ClassRosterPersistenceException{
        
    }
}

