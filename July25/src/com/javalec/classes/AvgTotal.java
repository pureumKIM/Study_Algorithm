package com.javalec.classes;

public class AvgTotal extends Avg{
	public int total(int kor, int mat){
		int score = kor+mat;
		return score;
	}
	
	public int total(int kor, int mat, int eng){
		int score = kor+mat+eng;
		return score;
	}
}
