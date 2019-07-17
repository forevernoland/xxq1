package com.demo.mms.dao;

import com.demo.mms.common.domain.Admin;
import com.demo.mms.common.domain.Midreport;


/**
 * @author  teacher
 */
public interface AdminMapper {
    int insert(Admin admin);
    int insertMidreport(Midreport midreport);
}