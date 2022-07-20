package com.example.demo.review.dto;


//import lombok.AllArgsConstructor; (모든 필드 값을 파라미터로 받는 생성자를 만듦)
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data

@NoArgsConstructor
public class ReviewDto {
    private Long reviewNo;
    private Integer star_score;
    private String review_content;
    private String fileName;
    private String likeCnt;
    private Date regDate;
    private String updDate;
    private Long cafeNum;
    private Long memNo;
    private String memId;

    @Builder
    public ReviewDto(Long reviewNo,Integer star_score,String review_content,String fileName,String likeCnt, Date regDate,String updDate,Long cafeNum,Long memNo,
                     String memId) {
    this.reviewNo = reviewNo;
    this.star_score = star_score;
    this.review_content = review_content;
    this.fileName = fileName;
    this.likeCnt = likeCnt;
    this.regDate = regDate;
    this.updDate = updDate;
    this.cafeNum = cafeNum;
    this.memNo = memNo;
    this.memId = memId;
    }
}
