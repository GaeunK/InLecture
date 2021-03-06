package com.team3.inlecture.lecture.quiz;

import org.apache.ibatis.type.Alias;

@Alias("quizProblemVO")
public class QuizProblemVO {
	private int quizProblemSeq;
	private int quizSeq;
	private int idx;
	private String content;
	private String answer;
	private int score;
	private String comment;
	public int getQuizProblemSeq() {
		return quizProblemSeq;
	}
	public void setQuizProblemSeq(int quizProblemSeq) {
		this.quizProblemSeq = quizProblemSeq;
	}
	public int getQuizSeq() {
		return quizSeq;
	}
	public void setQuizSeq(int quizSeq) {
		this.quizSeq = quizSeq;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	
}
