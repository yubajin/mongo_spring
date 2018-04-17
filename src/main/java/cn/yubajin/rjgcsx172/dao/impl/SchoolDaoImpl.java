package cn.yubajin.rjgcsx172.dao.impl;

import org.springframework.stereotype.Repository;

import cn.yubajin.rjgcsx172.dao.ISchoolDao;
import cn.yubajin.rjgcsx172.entity.SchoolInfo;

/**
 * 用户接口实现类
 * <p>
 * ClassName: UserDaoImpl
 * </p>
 * <p>
 * Description:
 * </p>
 */
@Repository
public class SchoolDaoImpl extends BaseDaoImpl<SchoolInfo> implements ISchoolDao {

	@Override
	protected Class<SchoolInfo> getEntityClass() {
		return SchoolInfo.class;
	}

}