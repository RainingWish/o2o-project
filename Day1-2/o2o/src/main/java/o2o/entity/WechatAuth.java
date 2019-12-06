//Qinyao Zhang 12.5.2019
package o2o.entity;

import java.util.Date;

public class WechatAuth {

	//create four relevant variable 
	private Long wechatAuthId;
	private String openId;
	private Date createTime;
	private PersonInfo personInfo;
	
	//add getter and setter
	
	public Long getWechatAuthId() {
		return wechatAuthId;
	}
	public void setWechatAuthId(Long wechatAuthId) {
		this.wechatAuthId = wechatAuthId;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public PersonInfo getPersonInfo() {
		return personInfo;
	}
	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}
}
