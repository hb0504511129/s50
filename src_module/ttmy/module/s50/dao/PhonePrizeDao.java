package ttmy.module.s50.dao;

import org.springframework.stereotype.Repository;

import ttmy.framework.base.dao.BaseEntityDao;
import ttmy.module.s50.module.PhonePrize;

@Repository("phonePrizeDao")
public class PhonePrizeDao extends BaseEntityDao<PhonePrize> implements IPhonePrizeDao {

}
