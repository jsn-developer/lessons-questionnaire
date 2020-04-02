package jp.co.solxyz.lessons.questionnaire.entity;

import lombok.Data;

@Data
public class QuestionnaireEntity {

    private int id;

    private String title;

    private String content;

    private long created;
    
}
