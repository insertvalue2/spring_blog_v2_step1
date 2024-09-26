package com.tenco.blog_jpa_step1.board;



import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

// JPA(Java Persistence API)를 사용하여 데이터베이스와 연동하는 Board 엔티티 클래스를 정의
@Data
@Table(name = "board_tb")
@Entity
public class Board {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String content;
    private String username;
    private Timestamp createdAt;
}