package com.kodekonveyor.market.tasks;

import static org.mockito.Mockito.doReturn;

import org.assertj.core.util.Lists;
import org.json.JSONException;

public class GetRepositoryTasksServiceStubs {

  public static void
      behaviour(final GetRepositoryTasksService getRepositoryTasksService) throws JSONException {
    doReturn(Lists.newArrayList(TaskEntityTestData.get()))
        .when(getRepositoryTasksService)
        .call(GetRepositoryTasksServiceTestData.REPO_NAME);
  }

}
