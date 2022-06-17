package com.devsuperior.dslearnbds.dto;

import com.devsuperior.dslearnbds.entities.Notification;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NotificationDTO implements Serializable {
    private static final long serialVersionUID = -1599406977307628997L;

    private Long id;

    private String text;

    private Instant moment;

    private boolean read = false;

    private String route;

    private Long userId;

    public NotificationDTO(Notification entity) {
        this.id = entity.getId();
        this.text = entity.getText();
        this.moment = entity.getMoment();
        this.read = entity.isRead();
        this.route = entity.getRoute();
        this.userId = entity.getUser().getId();
    }
}
