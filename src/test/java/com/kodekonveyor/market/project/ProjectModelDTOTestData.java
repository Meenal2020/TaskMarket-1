package com.kodekonveyor.market.project;

import java.util.Set;

import javax.annotation.Generated;

import com.kodekonveyor.market.tasks.TaskDTOTestData;

@Generated("by zenta-tools")
public class ProjectModelDTOTestData {

  public final static ProjectModelDTO get() {
    final ProjectModelDTO projectModelDTO = new ProjectModelDTO();
    projectModelDTO.setId(ProjectModelTestData.ID);
    projectModelDTO.setTask(Set.of(TaskDTOTestData.get()));
    projectModelDTO.setMilestone(Set.of(MilestoneDTOTestData.get()));

    return projectModelDTO;
  };

  public final static ProjectModelDTO getTwoTasks() {
    final ProjectModelDTO projectModelDTO = new ProjectModelDTO();
    projectModelDTO.setId(ProjectModelTestData.ID);
    projectModelDTO.setTask(
        Set.of(TaskDTOTestData.get(), TaskDTOTestData.getDifferentTask())
    );
    projectModelDTO.setMilestone(Set.of(MilestoneDTOTestData.get()));

    return projectModelDTO;
  };
}
