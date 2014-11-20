package ttmy.module.s50.dao;

import ttmy.framework.base.dao.IEntityDao;
import ttmy.module.s50.module.User;

public interface IUserDao extends IEntityDao<User> {

	User loadByUsername(String username);

}
