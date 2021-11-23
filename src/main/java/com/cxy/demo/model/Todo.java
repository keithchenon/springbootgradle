package com.cxy.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "name")
    @SequenceGenerator(name = "name", sequenceName = "SEQ1", allocationSize = 1)
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GeneratedValue
    @Column(updatable = false, nullable = false)
    Long id;
    @Column
    String title;
    @Column
    String description;
    @Column
    TodoStatus todoStatus;

    @CreationTimestamp
    @Column(updatable = false)
    LocalDateTime dateCreated;
    @UpdateTimestamp
    LocalDateTime lastModified;

}
