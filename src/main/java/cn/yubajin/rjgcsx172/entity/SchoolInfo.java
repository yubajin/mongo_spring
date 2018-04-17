package cn.yubajin.rjgcsx172.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * 用户实体类
 * <p>
 * ClassName: UserInfo
 * </p>
 * <p>
 * Description:本类用来展示MongoDB实体类映射的使用
 * </p>
 * <p>
 */
@Document(collection = "schools")
public class SchoolInfo implements Serializable {
	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	// 主键使用此注解
	@Id
	private String id;

	// 字段使用此注解
	@Field
	private String link;

	// 字段还可以用自定义名称
	@Field("school")
	private String schoolName;
	
	@Field
	private String local;
	
	@Field
	private boolean _985;
	
	@Field
	private boolean _211;

	// 还可以生成索引
//	@Indexed(name = "index_createTime", direction = IndexDirection.DESCENDING)
//	@Field
//	private Timestamp createTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public boolean is_985() {
		return _985;
	}

	public void set_985(boolean _985) {
		this._985 = _985;
	}

	public boolean is_211() {
		return _211;
	}

	public void set_211(boolean _211) {
		this._211 = _211;
	}


//	public Timestamp getCreateTime() {
//		return createTime;
//	}
//
//	public void setCreateTime(Timestamp createTime) {
//		this.createTime = createTime;
//	}

}
