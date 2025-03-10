package com.tracking.lib.domain;

import java.time.LocalDateTime;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "chat_message") // 실제 테이블명 지정
@Schema(name = "ChatMessage 모델", description = "ChatMessage 모델 정보")
public class ChatMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_no")
    @Schema(description = "사용자번호")
    private String messageNo;

    @Column(name = "sender_no", nullable = false)
    @Schema(description = "송신자번호")
    private String senderNo;

    @Column(name = "receiver_no", nullable = false)
    @Schema(description = "수신자번호")
    private String receiverNo;

    @Column(name = "message", nullable = false)
    @Schema(description = "메시지")
    private String message;

    @Column(name = "reg_no")
    @Schema(description = "등록자번호")
    private String regNo;

    @Column(name = "reg_dtime", updatable = false)
    @Schema(description = "등록일시")
    private LocalDateTime regDtime;
}
