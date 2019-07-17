package com.demo.mms.service;

import com.demo.mms.common.domain.Admin;
import com.demo.mms.common.domain.Midreport;
import com.demo.mms.dao.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author  teacher
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;
    @Transactional
    @Override
    public void addAdmin(Admin admin) {
        adminMapper.insert(admin);
    }
    @Transactional
    @Override
    public void addMidreport(Midreport midreport) {
        adminMapper.insertMidreport(midreport);
    }
}
