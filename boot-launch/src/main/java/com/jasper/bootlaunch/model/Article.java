package com.jasper.bootlaunch.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Article {
    private Long  id;
    private String author;
    private String title;
    private String content;
    private Date createTime;

    private List<Reader> reader;
}
