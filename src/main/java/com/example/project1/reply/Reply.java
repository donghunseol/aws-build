package com.example.project1.reply;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Table(name = "reply_tb")
@Data
@Entity
public class Reply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer userId;
    private Integer boardId;

    @Column(nullable = false)
    private String comment;

    private Timestamp createdAt;
}
