package okkpp.websocket;

import com.google.gson.Gson;

/**
* @author duck
* @date 创建时间：2018年4月17日 下午2:06:22
*/
public class Message {

	private Integer sendTo;
	private Integer sendFrom;
	private String content;
	
	public Message() {};
	public Message(String json) {
		Message msg = new Gson().fromJson(json, this.getClass());
		this.setSendTo(msg.getSendTo());
		this.setSendFrom(msg.getSendFrom());
		this.setContent(msg.getContent());
	}
	public String toJson() {
		return new Gson().toJson(this);
	}
	public Integer getSendTo() {
		return sendTo;
	}
	public void setSendTo(Integer sendTo) {
		this.sendTo = sendTo;
	}
	public Integer getSendFrom() {
		return sendFrom;
	}
	public void setSendFrom(Integer sendFrom) {
		this.sendFrom = sendFrom;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
