package ttmy.module.s50.dao;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import ttmy.framework.base.dao.BaseEntityDao;
import ttmy.framework.core.dao.IUserProvider;
import ttmy.framework.core.model.IUser;
import ttmy.module.s50.module.User;

@Repository("userProvider")
public class UserDao extends BaseEntityDao<User> implements IUserDao, IUserProvider {

	@Override
	public IUser loadUser(long userId) {
		return super.findById(userId);
	}

	@Override
	public User loadByUsername(String username) {
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(super.entityClass);
		detachedCriteria.add(Restrictions.eq("name", username));
		return super.findUniqueBy(detachedCriteria);
	}

}
