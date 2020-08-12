package com.kodekonveyor.market.tasks;

import com.kodekonveyor.market.register.MarketUserEntityTestData;

public class TaskDTOTestData {

  public final static TaskDTO get() {
    final TaskDTO taskDTO = new TaskDTO();
    taskDTO.setId(TaskTestData.ID);
    taskDTO.setMarketUser(MarketUserEntityTestData.get().getId());
    taskDTO.setService(TaskTestData.SERVICE);
    taskDTO.setBehaviour(TaskTestData.BEHAVIOUR);
    taskDTO.setGithubId(TaskTestData.GITHUB_ID);
    taskDTO.setDescription(TaskTestData.DESCRIPTION);
    taskDTO.setStatus(TaskStatusEnum.UP_FOR_GRAB);
    return taskDTO;

  }

  public final static TaskDTO getDifferentTask() {
    final TaskDTO taskDTO = get();
    taskDTO.setId(TaskTestData.ID_2);
    return taskDTO;

  }
}
