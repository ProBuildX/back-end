package com.construtech.buildsphere.platform.iam.domain.model.queries;

import com.construtech.buildsphere.platform.iam.domain.model.valueobjects.Roles;

public record GetRoleByNameQuery(Roles roleName) {
}
