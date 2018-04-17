package cn.yubajin.rjgcsx172.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.yubajin.rjgcsx172.dao.IBaseDao;
import cn.yubajin.rjgcsx172.dao.ISchoolDao;
import cn.yubajin.rjgcsx172.entity.SchoolInfo;

/**
 * 用户service类
 * <p>
 * ClassName: UserService
 * </p>
 * <p>
 * Description:
 * </p>
 */
@Service
public class SchoolService extends BaseService<SchoolInfo> {

	@Autowired
	private ISchoolDao userDao;

	@Override
	protected IBaseDao<SchoolInfo> getDao() {
		return userDao;
	}

}