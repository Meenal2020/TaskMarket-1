package com.kodekonveyor.market.project;

import java.util.Set;

import javax.annotation.Generated;

import com.kodekonveyor.market.tasks.TaskDTO;

import lombok.Data;

@Generated("by zenta-tools")
@Data
public class ProjectModelDTO {

  private Long id;
  private Set<MilestoneDTO> milestone;
  private Set<TaskDTO> task;

}
