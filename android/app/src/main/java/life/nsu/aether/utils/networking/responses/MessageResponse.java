/*
 * MessageResponse Created by Samiur Prapon
 * Last modified  6/1/21 8:14 AM
 * Copyright (c) 2021. All rights reserved.
 *
 */

package life.nsu.aether.utils.networking.responses;

public class MessageResponse {
    private boolean success;
    private String message;

    public MessageResponse(String message) {
        this.message = message;
    }

    public MessageResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return success;
    }
}
