package org.crowdcomputer.impl.tactic;

import org.activiti.engine.delegate.DelegateExecution;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.crowdcomputer.impl.utils.BaseTask;
import org.json.simple.JSONObject;

public class RewardGive extends BaseTask {


    private Logger log = LogManager.getLogger(this.getClass());


    @SuppressWarnings({"unchecked", "rawtypes"})
    public void execute(DelegateExecution execution) throws Exception {
        init(execution);
        long task_id = Integer.parseInt("" + execution.getVariable("taskId"));
        long task_instance_id = getTaskInstanceId(execution);
        JSONObject ret = croco.giveReward(task_id,task_instance_id);
        log.debug("Give reward "+ret);


    }
}
