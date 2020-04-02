package jp.co.solxyz.lessons.questionnaire.entity;

import java.io.Serializable;
import java.util.List;

public class ListEntity implements Serializable{

    /**
     * Default Serial UID
     */
    private static final long serialVersionUID = 1L;


    private int questionnaireId;

    private String title;

    private String content;

    private List<Selection> selections;
    
}
