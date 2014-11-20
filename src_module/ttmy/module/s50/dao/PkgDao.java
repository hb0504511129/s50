package ttmy.module.s50.dao;

import org.springframework.stereotype.Repository;

import ttmy.framework.base.dao.BaseEntityDao;
import ttmy.module.s50.module.Pkg;

@Repository("pkgDao")
public class PkgDao extends BaseEntityDao<Pkg> implements IPkgDao {

}
