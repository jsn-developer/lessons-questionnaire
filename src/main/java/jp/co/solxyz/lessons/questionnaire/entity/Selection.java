package jp.co.solxyz.lessons.questionnaire.entity;

import lombok.Data;

@Data
public class Selection {

    private int id;

    private int questionnaire;

    private int sequence;
    
    private String name;

}
