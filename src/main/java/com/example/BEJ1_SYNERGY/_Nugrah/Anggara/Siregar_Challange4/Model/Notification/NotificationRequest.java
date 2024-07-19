package com.example.BEJ1_SYNERGY._Nugrah.Anggara.Siregar_Challange4.Model.Notification;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NotificationRequest {
    private String title;
    private String body;
    private String topic;
    private String token;//token client
}
