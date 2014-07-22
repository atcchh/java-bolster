package com.cango.monitor.model;

/**
 * Created by caoyanfei079 on 7/22/14.
 */
public class EventLog {
    private Type eventType;
    private String eventUUID;
    private Long startAt;
    private Long endAt;
    private String description;
    private String eventSequence;

    public Type getEventType() {
        return eventType;
    }

    public void setEventType(Type eventType) {
        this.eventType = eventType;
    }

    public String getEventUUID() {
        return eventUUID;
    }

    public void setEventUUID(String eventUUID) {
        this.eventUUID = eventUUID;
    }

    public Long getStartAt() {
        return startAt;
    }

    public void setStartAt(Long startAt) {
        this.startAt = startAt;
    }

    public Long getEndAt() {
        return endAt;
    }

    public void setEndAt(Long endAt) {
        this.endAt = endAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEventSequence() {
        return eventSequence;
    }

    public void setEventSequence(String eventSequence) {
        this.eventSequence = eventSequence;
    }

    public static enum Type {
        URL,
        SQL,
        SERVICE,
        REMOTE_INVOKE,
        JOB,
        MQ
    }

}
