package cn.com.bsfit.frms.obj.audit;

public class VerifyPolicy {

	private String code;
	private String failControl;
	private String name;
	private int priority;
	private String succControl;

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setFailControl(String failControl) {
		this.failControl = failControl;
	}

	public String getFailControl() {
		return failControl;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getPriority() {
		return priority;
	}

	public void setSuccControl(String succControl) {
		this.succControl = succControl;
	}

	public String getSuccControl() {
		return succControl;
	}

}