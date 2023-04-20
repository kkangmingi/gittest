package com.jdbc.board.model.dto;

import java.sql.Date;
import java.util.Objects;

public class BoardComment {
	private int commentNo;
	private String boardContent;
	private String CommentWriter;
	private Date commentDate;

	
	public BoardComment() {
		// TODO Auto-generated constructor stub
	}


	public BoardComment(int commentNo, String boardContent, String commentWriter, Date commentDate) {
		super();
		this.commentNo = commentNo;
		this.boardContent = boardContent;
		CommentWriter = commentWriter;
		this.commentDate = commentDate;
	}


	public int getCommentNo() {
		return commentNo;
	}


	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
	}


	public String getBoardContent() {
		return boardContent;
	}


	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}


	public String getCommentWriter() {
		return CommentWriter;
	}


	public void setCommentWriter(String commentWriter) {
		CommentWriter = commentWriter;
	}


	public Date getCommentDate() {
		return commentDate;
	}


	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}


	@Override
	public String toString() {
		return "BoardComment [commentNo=" + commentNo + ", boardContent=" + boardContent + ", CommentWriter="
				+ CommentWriter + ", commentDate=" + commentDate + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(CommentWriter, boardContent, commentDate, commentNo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BoardComment other = (BoardComment) obj;
		return Objects.equals(CommentWriter, other.CommentWriter) && Objects.equals(boardContent, other.boardContent)
				&& Objects.equals(commentDate, other.commentDate) && commentNo == other.commentNo;
	}
	
	
	
}
