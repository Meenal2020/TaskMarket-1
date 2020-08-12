package com.kodekonveyor.market.project;

import static com.kodekonveyor.market.project.ProjectTestData.EXPECTED_AUTH_ERROR_FOR_UPDATE_PROJECT;

import org.json.JSONException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import com.kodekonveyor.annotations.TestedBehaviour;
import com.kodekonveyor.annotations.TestedService;
import com.kodekonveyor.authentication.AuthenticatedUserServiceStubs;
import com.kodekonveyor.authentication.UserEntityTestData;
import com.kodekonveyor.exception.ThrowableTester;
import com.kodekonveyor.logging.LoggingMarkerConstants;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
@RunWith(MockitoJUnitRunner.class)
@TestedBehaviour("Logging")
@TestedService("UpdateProjectModelController")
public class UpdateProjectModelControllerLoggingTest
    extends UpdateProjectModelControllerTestBase {

  @Test
  @DisplayName("The call of the controller is logged")
  void test() throws JSONException {
    updateProjectModelController
        .call(ProjectModelDTOTestData.get(), ProjectTestData.PROJECT_NAME);
    Mockito.verify(logger)
        .info(LoggingMarkerConstants.PROJECT, ProjectTestData.PROJECT_NAME);
  }

  @Test
  @DisplayName("Return of project DTO is logged")
  void test1() throws JSONException {
    updateProjectModelController
        .call(ProjectModelDTOTestData.get(), ProjectTestData.PROJECT_NAME);
    Mockito.verify(logger).debug(
        LoggingMarkerConstants.PROJECT,
        ProjectConstants.PROJECT_DTO_RETURNED_SUCCESSFULLY + ProjectTestData.ID
    );
  }

  @Test
  @DisplayName(
    "Error is logged if the user does not have manager role"
  )
  void test2() {
    AuthenticatedUserServiceStubs.salesUser(authenticatedUserService);

    ThrowableTester.assertThrows(
        () -> updateProjectModelController.call(
            ProjectModelDTOTestData.get(), ProjectTestData.NAME_KODE_KONVEYOR
        )
    )
        .assertMessageIs(EXPECTED_AUTH_ERROR_FOR_UPDATE_PROJECT);
    Mockito.verify(logger).warn(
        LoggingMarkerConstants.PROJECT,
        ProjectConstants.USER_NOT_MANAGER +
            UserEntityTestData.getRoleSales().getId()
    );
  }

}
