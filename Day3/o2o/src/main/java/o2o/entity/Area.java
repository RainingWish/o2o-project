//Qinyao Zhang 12.5.2019
package o2o.entity;

import java.util.Date;

public class Area {
//create variable inside area class
// ctrl+shift+F = re-organize the code
	// ID
	private Integer areaId;
	// Name
	private String areaName;
	// priority
	private Integer priority;
	// create time
	private Date createTime;
	// update time
	private Date lastEditTime;

	// generate getter and setter by using source
	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastEditTime() {
		return lastEditTime;
	}

	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}

	
}
