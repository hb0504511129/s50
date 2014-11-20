package ttmy.module.s50.dao;

import org.springframework.stereotype.Repository;

import ttmy.framework.base.dao.BaseEntityDao;
import ttmy.module.s50.module.Gift;

@Repository("giftDao")
public class GiftDao extends BaseEntityDao<Gift> implements IGiftDao {

}
