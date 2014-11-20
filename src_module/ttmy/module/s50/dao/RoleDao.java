package ttmy.module.s50.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import ttmy.framework.core.dao.IRoleProvider;
import ttmy.framework.core.model.IModule;
import ttmy.framework.core.model.IRole;

@Repository("roleProvider")
public class RoleDao extends HibernateDaoSupport implements IRoleDao, IRoleProvider {

	@Override
	public IRole loadRole(Long id) {
		return userRole;
	}

	private IRole userRole = new IRole() {

		@Override
		public Long getId() {
			return Long.valueOf(0);
		}

		@Override
		public String getName() {
			return "admin";
		}

		@Override
		public List<IModule> getAuthModules() {
			return new ArrayList<IModule>();
		}
	};

	@Override
	public List<IModule> loadRoleModules(Long id) {
		String[] urls = {};
		List<IModule> ms = new ArrayList<>();
		for (int i = 0; i < urls.length; ++i) {
			Long ii = (long)i;
			ms.add(new IModule() {

				@Override
				public Long getId() {
					return ii;
				}

				@Override
				public String getName() {
					return "";
				}

				@Override
				public String getUrl() {
					return urls[ii.intValue()];
				}
			});
		}
		return ms;
	}

}
