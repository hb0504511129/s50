package ttmy.module.s50.service;

import ttmy.framework.base.service.IService;

public interface IS50service extends IService {

	boolean checkUserPwd(String username, String password);

}
