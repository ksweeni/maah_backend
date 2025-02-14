package com.shinhan.maahproject.dto;

import com.shinhan.maahproject.vo.HiCardImageVO;

import lombok.Data;

@Data
public class MyCardHiDTO {
	private String memberHiNumber;
	private String memberHiNickname;
	private HiCardImageVO hiImageCode;
	private Integer memberHiPoint;
	private String classBenefitName;
	private Integer thisMonthSum;
	private Integer totalLimit;
}
