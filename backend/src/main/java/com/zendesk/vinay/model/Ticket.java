package com.zendesk.vinay.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(
        ignoreUnknown = true
)
public class Ticket implements Serializable {
    private static final long serialVersionUID = 1L;
    protected Long id;
    protected String url;
    protected String subject;
    protected String description;
    protected Status status;
    protected Long requesterId;
    protected Long organizationId;
    protected Long viaFollowupSourceId;
    protected Date createdAt;
    protected Date updatedAt;
    protected Boolean solved;
    protected Priority priority;
    protected Type type;
    private String externalId;
    private String recipient;
    private Long submitterId;
    private Long assigneeId;
    private Long groupId;
    private List<Long> collaboratorIds;
    private Long forumTopicId;
    private Long problemId;
    private boolean hasIncidents;
    private Date dueAt;
    private List<String> tags;
    private List<Long> sharingAgreementIds;
    private List<Long> followupIds;
    private Long ticketFormId;
    private Long brandId;
    private Boolean isPublic;

    public Ticket() {
    }

    @JsonProperty("created_at")
    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("organization_id")
    public Long getOrganizationId() {
        return this.organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @JsonProperty("updated_at")
    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("via_followup_source_id")
    public Long getViaFollowupSourceId() {
        return this.viaFollowupSourceId;
    }

    public void setViaFollowupSourceId(Long viaFollowupSourceId) {
        this.viaFollowupSourceId = viaFollowupSourceId;
    }

    @JsonProperty("solved")
    public Boolean getSolved() {
        return this.solved;
    }

    public void setSolved(Boolean solved) {
        this.solved = solved;
    }

    @JsonProperty("priority")
    public Priority getPriority() {
        return this.priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @JsonProperty("type")
    public Type getType() {
        return this.type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @JsonProperty("assignee_id")
    public Long getAssigneeId() {
        return this.assigneeId;
    }

    public void setAssigneeId(Long assigneeId) {
        this.assigneeId = assigneeId;
    }

    @JsonProperty("collaborator_ids")
    public List<Long> getCollaboratorIds() {
        return this.collaboratorIds;
    }

    public void setCollaboratorIds(List<Long> collaboratorIds) {
        this.collaboratorIds = collaboratorIds;
    }

    @JsonProperty("due_at")
    public Date getDueAt() {
        return this.dueAt;
    }

    public void setDueAt(Date dueAt) {
        this.dueAt = dueAt;
    }

    @JsonProperty("external_id")
    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @JsonProperty("followup_ids")
    public List<Long> getFollowupIds() {
        return this.followupIds;
    }

    public void setFollowupIds(List<Long> followupIds) {
        this.followupIds = followupIds;
    }

    @JsonProperty("forum_topic_id")
    public Long getForumTopicId() {
        return this.forumTopicId;
    }

    public void setForumTopicId(Long forumTopicId) {
        this.forumTopicId = forumTopicId;
    }

    @JsonProperty("group_id")
    public Long getGroupId() {
        return this.groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    @JsonProperty("has_incidents")
    public boolean isHasIncidents() {
        return this.hasIncidents;
    }

    public void setHasIncidents(boolean hasIncidents) {
        this.hasIncidents = hasIncidents;
    }

    @JsonProperty("problem_id")
    public Long getProblemId() {
        return this.problemId;
    }

    public void setProblemId(Long problemId) {
        this.problemId = problemId;
    }

    public String getRecipient() {
        return this.recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    @JsonProperty("brand_id")
    public Long getBrandId() {
        return this.brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    @JsonProperty("sharing_agreement_ids")
    public List<Long> getSharingAgreementIds() {
        return this.sharingAgreementIds;
    }

    public void setSharingAgreementIds(List<Long> sharingAgreementIds) {
        this.sharingAgreementIds = sharingAgreementIds;
    }

    @JsonProperty("submitter_id")
    public Long getSubmitterId() {
        return this.submitterId;
    }

    public void setSubmitterId(Long submitterId) {
        this.submitterId = submitterId;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @JsonProperty("ticket_form_id")
    public Long getTicketFormId() {
        return this.ticketFormId;
    }

    public void setTicketFormId(Long ticketFormId) {
        this.ticketFormId = ticketFormId;
    }


    @JsonProperty("is_public")
    public Boolean getIsPublic() {
        return this.isPublic;
    }

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public String toString() {
        return "Ticket{assigneeId=" + this.assigneeId + ", id=" + this.id + ", url='" + this.url + '\'' + ", externalId='" + this.externalId + '\'' + ", type='" + this.type + '\'' + ", subject='" + this.subject + '\'' + ", description='" + this.description + '\'' + ", priority='" + this.priority + '\'' + ", status='" + this.status + '\'' + ", recipient='" + this.recipient + '\'' + ", requesterId=" + this.requesterId + ", submitterId=" + this.submitterId + ", organizationId=" + this.organizationId + ", groupId=" + this.groupId + ", collaboratorIds=" + this.collaboratorIds + ", forumTopicId=" + this.forumTopicId + ", problemId=" + this.problemId + ", hasIncidents=" + this.hasIncidents + ", dueAt=" + this.dueAt + ", tags=" + this.tags + ", sharingAgreementIds=" + this.sharingAgreementIds + ", followupIds=" + this.followupIds + ", ticketFormId=" + this.ticketFormId + ", brandId=" + this.brandId + ", isPublic=" + this.isPublic + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + '}';
    }

    public static class Requester {
        private Integer localeId;
        private String name;
        private String email;

        public Requester() {
        }

        public Requester(String email) {
            this.email = email;
        }

        public Requester(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public Requester(Integer localeId, String name, String email) {
            this.localeId = localeId;
            this.name = name;
            this.email = email;
        }

        @JsonProperty("locale_id")
        public Integer getLocaleId() {
            return this.localeId;
        }

        public void setLocaleId(Integer localeId) {
            this.localeId = localeId;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return this.email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String toString() {
            return "Requester{localeId=" + this.localeId + ", name='" + this.name + '\'' + ", email='" + this.email + '\'' + '}';
        }
    }
}
