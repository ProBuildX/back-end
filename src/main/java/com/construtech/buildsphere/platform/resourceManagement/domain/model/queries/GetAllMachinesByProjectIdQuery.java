package com.construtech.buildsphere.platform.resourceManagement.domain.model.queries;

import com.construtech.buildsphere.platform.resourceManagement.domain.model.valueobjects.Project;

public record GetAllMachinesByProjectIdQuery(Project projectId) {
}
