package fun.rtzhao.crm.settings.dao;

import fun.rtzhao.crm.settings.domain.DicValue;

import java.util.List;

public interface DicValueDao {
    List<DicValue> getListByCode(String code);
}
