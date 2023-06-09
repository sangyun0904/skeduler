package com.example.skeduler.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Member member;
    @ManyToOne
    private Category category;
    @NonNull
    @Column(nullable = false)
    private String title;
    @Builder.Default
    private String content = "";
    @NonNull
    @Column(nullable = false)
    private LocalDateTime startDateTime;
    @Builder.Default
    private final LocalDateTime uploadDateTime = LocalDateTime.now();
    @Builder.Default
    private boolean important = false;
    @Builder.Default
    private boolean veryImportant = false;

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", member=" + member +
                ", startDateTime=" + startDateTime +
                ", uploadDateTime=" + uploadDateTime +
                ", important=" + important +
                ", veryImportant=" + veryImportant +
                ", category=" + category +
                '}';
    }
}
