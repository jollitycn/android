package com.example.testlibaar;


/**
 * The type Test tip.
 */
public class TestTip implements TestInterface {

    /**
     * Function 1.
     *
     * @param money the money
     * @param name  the name
     */
    public void function1(int money, String name) {
        System.out.println(money + name);
    }

    /**
     * Function 2 string.
     *
     * @param testMoney the test money
     * @param name      the name
     * @return the string
     */
    public String function2(int testMoney, String name) {
        return testMoney + name;
    }


    @Override
    public void sendMessage(String targetUserID, int messageType, byte[] message, String tag, int fragmentSize, Object handler, Object handlerTag) {
        System.out.println(targetUserID + targetUserID);
    }
}
