//Qinyao Zhang 12.5.2019
package o2o.entity;

import java.util.Date;

public class PersonInfo {

	// Add nine user propose
	private Long userId;
	private String name;
	private String profileImg;
	private String email;
	private String gender;
	private Integer enableStatus;
	// 1.customers 2.shop owner 3. web manager
	private Integer userTypel;
	private Date createTime;
	private Date lastEditTime;

	//create getter and setter for this variables
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfileImg() {
		return profileImg;
	}

	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getEnableStatus() {
		return enableStatus;
	}

	public void setEnableStatus(Integer enableStatus) {
		this.enableStatus = enableStatus;
	}

	public Integer getUserTypel() {
		return userTypel;
	}

	public void setUserTypel(Integer userTypel) {
		this.userTypel = userTypel;
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
