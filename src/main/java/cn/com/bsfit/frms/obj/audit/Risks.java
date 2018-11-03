package cn.com.bsfit.frms.obj.audit;
import java.util.List;

public class Risks {

    private String comments;
    private long createTime;
    private Customization customization;
    private int dynamicScore;
    private List<String> riskTypes;
    private int ruleLevel;
    private String ruleName;
    private String rulePackageName;
    private int ruleSeq;
    private int ruleStatus;
    private int ruleType;
    private int score;
    private String uuid;
    private VerifyPolicy verifyPolicy;
    private int weight;
    public void setComments(String comments) {
         this.comments = comments;
     }
     public String getComments() {
         return comments;
     }

    public void setCreateTime(long createTime) {
         this.createTime = createTime;
     }
     public long getCreateTime() {
         return createTime;
     }

    public void setCustomization(Customization customization) {
         this.customization = customization;
     }
     public Customization getCustomization() {
         return customization;
     }

    public void setDynamicScore(int dynamicScore) {
         this.dynamicScore = dynamicScore;
     }
     public int getDynamicScore() {
         return dynamicScore;
     }

    public void setRiskTypes(List<String> riskTypes) {
         this.riskTypes = riskTypes;
     }
     public List<String> getRiskTypes() {
         return riskTypes;
     }

    public void setRuleLevel(int ruleLevel) {
         this.ruleLevel = ruleLevel;
     }
     public int getRuleLevel() {
         return ruleLevel;
     }

    public void setRuleName(String ruleName) {
         this.ruleName = ruleName;
     }
     public String getRuleName() {
         return ruleName;
     }

    public void setRulePackageName(String rulePackageName) {
         this.rulePackageName = rulePackageName;
     }
     public String getRulePackageName() {
         return rulePackageName;
     }

    public void setRuleSeq(int ruleSeq) {
         this.ruleSeq = ruleSeq;
     }
     public int getRuleSeq() {
         return ruleSeq;
     }

    public void setRuleStatus(int ruleStatus) {
         this.ruleStatus = ruleStatus;
     }
     public int getRuleStatus() {
         return ruleStatus;
     }

    public void setRuleType(int ruleType) {
         this.ruleType = ruleType;
     }
     public int getRuleType() {
         return ruleType;
     }

    public void setScore(int score) {
         this.score = score;
     }
     public int getScore() {
         return score;
     }

    public void setUuid(String uuid) {
         this.uuid = uuid;
     }
     public String getUuid() {
         return uuid;
     }

    public void setVerifyPolicy(VerifyPolicy verifyPolicy) {
         this.verifyPolicy = verifyPolicy;
     }
     public VerifyPolicy getVerifyPolicy() {
         return verifyPolicy;
     }

    public void setWeight(int weight) {
         this.weight = weight;
     }
     public int getWeight() {
         return weight;
     }

}