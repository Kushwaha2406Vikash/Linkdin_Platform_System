package com.linkdin_platform;

import java.time.LocalDate;
import java.util.Date;

public class Connection {
    public enum ConnectionStatus { PENDING, CONNECTED, DECLINED }

    private User fromUser;
    private User toUser;
    private ConnectionStatus status;
    private LocalDate createdAt;

    public Connection(User fromUse,User toUser,ConnectionStatus status) {
        this.fromUser = fromUser;
        this.toUser=toUser;
        this.status=status;
        this.createdAt= LocalDate.now();
    }

    public User getFromUser() {
        return fromUser;
    }

    public void setFromUser(User fromUser) {
        this.fromUser = fromUser;
    }

    public User getToUser() {
        return toUser;
    }

    public void setToUser(User toUser) {
        this.toUser = toUser;
    }

    public ConnectionStatus getStatus() {
        return status;
    }

    public void setStatus(ConnectionStatus status) {
        this.status = status;
    }


}
