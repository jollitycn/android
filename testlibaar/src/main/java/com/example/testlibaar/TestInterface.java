package com.example.testlibaar;

/**
 * The interface Test interface.
 */
public interface TestInterface {
    /**
     * Send message.
     *
     * @param targetUserID the target user id
     * @param messageType  the message type
     * @param message      the message
     * @param tag          the tag
     * @param fragmentSize the fragment size
     * @param handler      the handler
     * @param handlerTag   the handler tag
     */
    void sendMessage(String targetUserID, int messageType, byte[] message, String tag, int fragmentSize,
                            Object handler, Object handlerTag);
}
