package cn.com.bsfit.frms.obj;

import java.util.List;

import cn.com.bsfit.frms.obj.audit.Customization;
import cn.com.bsfit.frms.obj.audit.Items;
import cn.com.bsfit.frms.obj.audit.Risks;
import cn.com.bsfit.frms.obj.audit.Trusts;
import cn.com.bsfit.frms.obj.audit.VerifyPolicy;

public class AuditResult {

	private String uuid;
	private String type;
	private String retCode;
	private int score;

	private Customization customization;
	private List<Items> items;
	private List<Risks> risks;
	private List<Trusts> trusts;
	private VerifyPolicy verifyPolicy;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRetCode() {
		return retCode;
	}

	public void setRetCode(String retCode) {
		this.retCode = retCode;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Customization getCustomization() {
		return customization;
	}

	public void setCustomization(Customization customization) {
		this.customization = customization;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	public List<Risks> getRisks() {
		return risks;
	}

	public void setRisks(List<Risks> risks) {
		this.risks = risks;
	}

	public List<Trusts> getTrusts() {
		return trusts;
	}

	public void setTrusts(List<Trusts> trusts) {
		this.trusts = trusts;
	}

	public VerifyPolicy getVerifyPolicy() {
		return verifyPolicy;
	}

	public void setVerifyPolicy(VerifyPolicy verifyPolicy) {
		this.verifyPolicy = verifyPolicy;
	}

}