package ttmy.module.s50.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ttmy.framework.base.service.BaseService;
import ttmy.framework.util.EncryptUtils;
import ttmy.module.s50.dao.IUserDao;
import ttmy.module.s50.module.User;

@Service("s50service")
public class S50service extends BaseService implements IS50service {
	@Resource(name = "userProvider")
	private IUserDao userDao;

	@Override
	public boolean checkUserPwd(String username, String password) {
		User user = userDao.loadByUsername(username);
		return (user.getPassword().equals(EncryptUtils.md5Encoder(username + password)));
	}
}
