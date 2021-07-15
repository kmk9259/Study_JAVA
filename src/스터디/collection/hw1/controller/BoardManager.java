package 스터디.collection.hw1.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import 스터디.collection.hw1.model.comparator.AscBoardDate;
import 스터디.collection.hw1.model.comparator.AscBoardNo;
import 스터디.collection.hw1.model.comparator.AscBoardTitle;
import 스터디.collection.hw1.model.comparator.DescBoardDate;
import 스터디.collection.hw1.model.comparator.DescBoardNo;
import 스터디.collection.hw1.model.comparator.DescBoardTitle;
import 스터디.collection.hw1.model.dao.BoardDao;
import 스터디.collection.hw1.model.vo.Board;

public class BoardManager {
	private BoardDao bd = new BoardDao();
	private Scanner sc  = new Scanner(System.in);
	
	public BoardManager() {
		// TODO Auto-generated constructor stub
	}
	public void writeBoard()
	{
		System.out.println("새 게시글 쓰기 입니다");
		System.out.println("글 제목 :");
		String title = sc.nextLine();
		System.out.println("작성자 :");
		String author = sc.nextLine();
		
		Date date = new Date();
		System.out.println("글 내용 : ");
		String content="";
		String temp="";
		while(true)
		{
			content = sc.nextLine();
			
			
			if(content.equals("exit"))
			{
				temp+=content;
				break;
			}
		}
		int lastno = bd.getLastBoardNo();
		
		
		try {
			bd.writeBoard(new Board(lastno+1, title, author, date, temp));
		}catch(ArrayIndexOutOfBoundsException e) {
			bd.writeBoard(new Board(1, title, author, date, temp));
		}	
	}
	public void displayAllList()
	{
		Iterator it = bd.displayAllList().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public void displayBoard()
	{
		System.out.println("조회할 글 번호 : ");
		int num = sc.nextInt();
		Board board = bd.displayBoard(num);
		if(board==null)
			System.out.println("조회된 글이 없습니다.");
		else
		{
			System.out.println(board);
			bd.upReadCount(num);
		}
	}
	public void modifyTitle()
	{
		System.out.println("수정할 글 번호 : ");
		int num = sc.nextInt();
		Board board = bd.displayBoard(num);
		if(board==null)
			System.out.println("조회된 글이 없습니다.");
		else
		{
			System.out.println(board);
			System.out.println("변경할 글 제목 :");
			sc.nextLine();
			String title = sc.nextLine();
			bd.modifyTitle(num, title);
		}
			
	}
	public void modifyContent()
	{
		System.out.println("수정할 글 번호 : ");
		int num = sc.nextInt();
		Board board = bd.displayBoard(num);
		if(board==null)
			System.out.println("조회된 글이 없습니다.");
		else
		{
			System.out.println(board);
			System.out.println("변경할 글 내용 :");
			sc.nextLine();
			String content = sc.nextLine();
			bd.modifyContent(num, content);
		}
			
	}
	public void deleteBoard()
	{
		System.out.println("삭제할 글 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();
		Board board = bd.displayBoard(num);
		if(board==null)
			System.out.println("조회된 글이 없습니다.");
		else
		{
			System.out.println("정말로 삭제하겠습니까?(y/n)");
			char yes = sc.nextLine().charAt(0);
			if(yes=='y' || yes=='Y')
				bd.deleteBoard(num);
		}
			
	}
	public void searchBoard()
	{
		System.out.println("검색할 제목 : ");
		String title = sc.nextLine();
		ArrayList<Board> list = bd.searchBoard(title);
		if(list.isEmpty())
			System.out.println("검색 결과가 없습니다.");
		else
		{
			for(int i=0; i<list.size();i++)
			{
				System.out.println(list.get(i));
			}
		}
			System.out.println(list.toString());
	}
	public void saveListFile()
	{
		bd.saveListFile();
	}
	public void sortList(int item, boolean isDesc)
	{
		ArrayList<Board> list = bd.displayAllList();
		switch(item) {
		case 1:
			if(isDesc==true)
				list.sort(new DescBoardNo());
			else
				list.sort(new AscBoardNo());
			break;
		case 2:
			if(isDesc==true)
				list.sort(new DescBoardDate());
			else
				list.sort(new AscBoardDate());
			break;
		case 3:
			if(isDesc==true)
				list.sort(new DescBoardTitle());
			else
				list.sort(new AscBoardTitle());
			break;
		}
	}
	

}
