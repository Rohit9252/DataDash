package com.api.dataforge.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Root{


    @JsonProperty("source")
    public Source source;
    public String author;
    public String title;
    public String description;
    public String url;
    public String urlToImage;
    public Date publishedAt;
    public String content;



}








