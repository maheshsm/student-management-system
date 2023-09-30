package com.ecommerce.model;

public class ActionDetails {
    private Integer actionId;
    private String actionDetails;
    private String actionKey;
    private String actionDescription;


    // Getter and Setter methods
    public Integer getActionId() {
        return actionId;
    }

    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }

    public String getActionDetails() {
        return actionDetails;
    }

    public void setActionDetails(String actionDetails) {
        this.actionDetails = actionDetails;
    }

    public String getActionKey() {
        return actionKey;
    }

    public void setActionKey(String actionKey) {
        this.actionKey = actionKey;
    }

    public String getActionDescription() {
        return actionDescription;
    }

    public void setActionDescription(String actionDescription) {
        this.actionDescription = actionDescription;
    }

    // toString method for debugging
    @Override
    public String toString() {
        return "ActionDetails [actionId=" + actionId + ", actionDetails=" + actionDetails + ", actionKey=" + actionKey
                + ", actionDescription=" + actionDescription + "]";
    }
}
