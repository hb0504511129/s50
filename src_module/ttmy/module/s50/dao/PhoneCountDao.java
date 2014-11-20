package ttmy.module.s50.dao;

import org.springframework.stereotype.Repository;

import ttmy.framework.base.dao.BaseEntityDao;
import ttmy.module.s50.module.PhoneCount;

@Repository("phoneCountDao")
public class PhoneCountDao extends BaseEntityDao<PhoneCount> implements IPhoneCountDao {
}
