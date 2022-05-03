package ru.geekbrains.chat.common;

public class Library {

    public static final int MSG_TYPE_INDEX = 0;
    public static final int AUTH_REQUEST_LENGTH = 3;
    public static final String DELIMITER = "±";
    public static final String AUTH_REQUEST = "/auth_request";
    public static final String AUTH_ACCEPT = "/auth_accept";
    public static final String AUTH_DENIED = "Неверный логин или пароль. ";
    public static final String MSG_FORMAT_ERROR = "/msg_format_error";
    public static final String SERVER_BCAST_MSG = "/bcast";
    public static final String USER_LIST = "/user_list";
    public static final String CLIENT_BCAST_MSG = "/client_broadcast";

    public static String getTypeBcastClient(String msg) {
        return CLIENT_BCAST_MSG + DELIMITER + msg;
    }

    public static String getUserList (String users) {
        return USER_LIST + DELIMITER + users;
    }

    public static String getAuthRequest(String login, String password) {
        System.out.println(AUTH_REQUEST + DELIMITER + login + DELIMITER + password);
        return AUTH_REQUEST + DELIMITER + login + DELIMITER + password;
    }

    public static String getAuthAccept (String name) {
        return AUTH_ACCEPT + DELIMITER + name;
    }

    public static String getAuthDenied() {
        return AUTH_DENIED;
    }

    public static String getMsgFormatError(String message) {
        return MSG_FORMAT_ERROR + DELIMITER + message;
    }

    public static String getTypeBroadcast(String src, String message) {
        return SERVER_BCAST_MSG + DELIMITER + System.currentTimeMillis() +
                DELIMITER + src + DELIMITER + message ;
    }


}
