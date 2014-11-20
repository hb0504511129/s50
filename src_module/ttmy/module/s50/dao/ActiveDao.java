package ttmy.module.s50.dao;

import org.springframework.stereotype.Repository;

import ttmy.framework.base.dao.BaseEntityDao;
import ttmy.module.s50.module.Active;

@Repository("activeDao")
public class ActiveDao extends BaseEntityDao<Active> implements IActiveDao {
}
