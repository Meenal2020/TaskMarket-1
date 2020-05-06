package com.kodekonveyor.market.tasks;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.kodekonveyor.market.register.MarketUserEntityTestData;

@Generated("by zenta-tools")
public class TaskEntityTestData {

  public static final long ISSUE_ID_INPROGRESS = 4567;
  public static final long ISSUE_ID_UPFORGRAB_OPEN = 5897;
  public static final long ISSUE_ID_UPFORGRAB_CLOSED = 5997;
  public static final long ISSUE_ID_CLOSED = 9897;
  public static final long ISSUE_ID = 4422;

  public final static TaskEntity get() {
    final TaskEntity taskEntity = new TaskEntity();
    taskEntity.setId(TaskTestData.ID);
    taskEntity.setMarketUser(MarketUserEntityTestData.get());
    taskEntity.setService(TaskTestData.SERVICE);
    taskEntity.setBehaviour(TaskTestData.BEHAVIOUR);
    taskEntity.setGithubId(TaskTestData.GITHUB_ID);
    taskEntity.setDescription(TaskTestData.DESCRIPTION);

    return taskEntity;
  };

  public static final List<TaskEntity> listStatusDone() {
    final TaskEntity taskEntity = get();
    final List<TaskEntity> taskEntities = new ArrayList<>();
    taskEntity.setGithubId(ISSUE_ID_CLOSED);
    taskEntities.add(taskEntity);
    return taskEntities;
  }

  public static final List<TaskEntity> listStatusInProgress() {
    final TaskEntity taskEntity = get();
    final List<TaskEntity> taskEntities = new ArrayList<>();
    taskEntity.setGithubId(ISSUE_ID_INPROGRESS);
    taskEntities.add(taskEntity);
    return taskEntities;
  }

  public static final List<TaskEntity> listIsPublicTrue() {
    final TaskEntity taskEntity = get();
    final List<TaskEntity> taskEntities = new ArrayList<>();
    taskEntity.setGithubId(ISSUE_ID_UPFORGRAB_OPEN);
    taskEntities.add(taskEntity);
    return taskEntities;
  }

  public static final List<TaskEntity> listIsPublicFalse() {
    final TaskEntity taskEntity = get();
    final List<TaskEntity> taskEntities = new ArrayList<>();
    taskEntity.setGithubId(ISSUE_ID_UPFORGRAB_CLOSED);
    taskEntities.add(taskEntity);
    return taskEntities;
  }
}
