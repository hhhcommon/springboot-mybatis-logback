package cn.com.bsfit.frms.obj;

import java.util.List;

/**
 * 邦盛决策响应结果<<br>
 * http://192.168.1.238:9093/flow/syncAudit?processKey=gjjd001
 */
public class BsfitDecisionResponse {

	/** 数据类型 */
	private String type;
	private DecisionResult data;
	private boolean success;

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setData(DecisionResult data) {
		this.data = data;
	}

	public DecisionResult getData() {
		return data;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public boolean getSuccess() {
		return success;
	}

	class DecisionResult {
		private String type;
		private String flowId;
		private List<NodeResults> nodeResults;
		private String orderId;
		private String processKey;
		private String userId;

		public void setType(String type) {
			this.type = type;
		}

		public String getType() {
			return type;
		}

		public void setFlowId(String flowId) {
			this.flowId = flowId;
		}

		public String getFlowId() {
			return flowId;
		}

		public void setNodeResults(List<NodeResults> nodeResults) {
			this.nodeResults = nodeResults;
		}

		public List<NodeResults> getNodeResults() {
			return nodeResults;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public String getOrderId() {
			return orderId;
		}

		public void setProcessKey(String processKey) {
			this.processKey = processKey;
		}

		public String getProcessKey() {
			return processKey;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getUserId() {
			return userId;
		}

	}

	class NodeResults {
		private int index;
		private AuditResult result;
		private String taskName;

		public void setIndex(int index) {
			this.index = index;
		}

		public int getIndex() {
			return index;
		}

		public void setResult(AuditResult result) {
			this.result = result;
		}

		public AuditResult getResult() {
			return result;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public String getTaskName() {
			return taskName;
		}
	}

}