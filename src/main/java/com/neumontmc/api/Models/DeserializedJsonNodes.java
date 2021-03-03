package com.neumontmc.api.Models;

import com.fasterxml.jackson.databind.JsonNode;

import java.io.Serializable;

public class DeserializedJsonNodes implements Serializable {
    public JsonNode stats;
    public JsonNode[] content;
    public String error;
    public int status;

    public JsonNode getStats() {
        return stats;
    }

    public JsonNode[] getContent() {
        return content;
    }

    public String getError() {
        return error;
    }

    public int getStatus() {
        return status;
    }
}
