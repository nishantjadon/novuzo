package co.novu.api.layouts.responses;

import co.novu.common.contracts.IResponse;
import lombok.Data;

import java.util.List;

@Data
public class GetLayoutResponse implements IResponse {
    private String _id;
    private String _organizationId;
    private String _environmentId;
    private String _creatorId;
    private String name;
    private String description;
    private String channel;
    private String content;
    private String contentType;
    private List<?> variables;
    private Boolean isDefault;
    private Boolean isDeleted;
    private String createdAt;
    private String updatedAt;
    private String _parentId;
}
