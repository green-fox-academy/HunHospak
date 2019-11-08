package com.reddit.post.models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private String url;
  private Long votes = 0L;
  private String date = formatDate();

  public Post() {
  }

  public Post(String title, String url) {
    this.title = title;
    this.url = url;
  }

  private String formatDate() {
    String strDateFormat = "yyyy.MM.dd HH:mm";
    DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
    String formattedDate = dateFormat.format(new Date());
    return formattedDate;
  }


  @Override
  public String toString() {
    return this.title;
  }
}
