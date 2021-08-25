package fun.rtzhao.crm.workbench.service.impl;

import fun.rtzhao.crm.utils.SqlSessionUtil;
import fun.rtzhao.crm.workbench.dao.CustomerDao;
import fun.rtzhao.crm.workbench.service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao = SqlSessionUtil.getSqlSession().getMapper(CustomerDao.class);

    @Override
    public List<String> getCustomerName(String name) {
        List<String> sList = customerDao.getCustomerName(name);

        return sList;
    }
}
