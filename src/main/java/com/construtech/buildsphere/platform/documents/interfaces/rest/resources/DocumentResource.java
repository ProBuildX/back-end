package com.construtech.buildsphere.platform.documents.interfaces.rest.resources;

public record DocumentResource(Long id, String name, String description, String type, String url, Long projectId){
}
