package com.demo.mms.service;

import com.demo.mms.common.domain.Admin;
import com.demo.mms.common.domain.Midreport;

/**
 * @author teacher
 */
public interface AdminService {
    void addAdmin(Admin admin);
    void addMidreport(Midreport midreport);
}
