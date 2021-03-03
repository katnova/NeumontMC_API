package com.neumontmc.api.Models;

import com.neumontmc.api.Exceptions.MalformedUUIDException;

import java.io.Serializable;

public class UUID implements Serializable {
    private String UUID;

    /**
     * @param UUID to set.
     * @catch MalformedUUIDException if UUID is invalid.
     */
    public UUID(String UUID) {
        try {
            setUUID(UUID);
        } catch (MalformedUUIDException e) {
            e.printStackTrace();
        }
    }

    /**
     * Get valid UUID.
     *
     * @return String containing valid UUID.
     */
    public String getUUID() {
        return UUID;
    }

    /**
     * Check if a UUID id a valid length.
     *
     * @param UUID to validate and set
     * @catch IllegalArgumentException if UUID is an invalid length.
     * @throws MalformedUUIDException if UUID is an invalid length.
     */
    public void setUUID(String UUID) throws MalformedUUIDException {
        try {
            isVaildUUID(UUID);
            if (UUID.length() == 36)
                this.UUID = UUID;
        } catch (IllegalArgumentException e) {
            throw new MalformedUUIDException("len of " + UUID.length(), e);
        }
    }

    /**
     * Vailidate UUID length (indicator of UUID will process)
     *
     * @param UUID to validate.
     * @throws IllegalArgumentException if UUID is not exactly 36 charecters long.
     */
    private void isVaildUUID(String UUID) {
        if (UUID.length() != 36)
            throw new IllegalArgumentException("");
    }
}
