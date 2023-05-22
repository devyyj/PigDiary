package com.devyyj.pigdiary.user.entity;

import com.devyyj.pigdiary.common.entity.CommonEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class User extends CommonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String social_id;

    @Column(nullable = false)
    private String nick_name;
}
