package ttmy.module.s50.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import ttmy.framework.core.dao.IModuleProvider;
import ttmy.framework.core.model.IModule;

@Repository("moduleProvider")
public class ModuleDao extends HibernateDaoSupport implements IModuleDao, IModuleProvider {

	@Override
	public List<IModule> loadAll() {
		return new ArrayList<>();
	}

}
