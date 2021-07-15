package 스터디.collection.hw1.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import 스터디.collection.hw1.model.vo.Board;

public class BoardDao {
	ArrayList<Board> list = new ArrayList<Board>();
	
	public BoardDao() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("board_list.dat"))){
			list.addAll((ArrayList<Board>)ois.readObject());
			
		} catch (FileNotFoundException e) {
			System.out.println("파일없음");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int getLastBoardNo()
	{
		if(list.isEmpty())
			return 0;
		else
			return list.get(list.size()-1).getBoardNo();
	}
	public void writeBoard(Board board)
	{
		list.add(board);
	}
	public ArrayList<Board> displayAllList()
	{
		return list;
	}
	public Board displayBoard(int no)
	{
		Board board=null;
		for(int i=0; i<list.size();i++)
		{
			if(list.get(i).getBoardNo()==no)
			{
				board=list.get(i);
				break;
			}
				
		}
		return board;
	}
	public void upReadCount(int no)
	{
		for(int i=0; i<list.size(); i++)
		{
			if(list.get(i).getBoardNo()==no)
			{
				list.get(i).setReadCount(list.get(i).getReadCount()+1);
				break;
			}
		}
	}
	public void modifyTitle(int no, String title)
	{
		for(int i=0; i<list.size(); i++)
		{
			if(list.get(i).getBoardNo()==no)
			{
				list.get(i).setBoardTitle(title);
				break;
			}
		}
	}
	public void modifyContent(int no, String content)
	{
		for(int i=0; i<list.size(); i++)
		{
			if(list.get(i).getBoardNo()==no)
			{
				list.get(i).setBoardContent(content);
				break;
			}
		}
	}
	public void deleteBoard(int no)
	{
		for(int i=0; i<list.size(); i++)
		{
			if(list.get(i).getBoardNo()==no)
			{
				list.remove(i);
				break;
			}
		}
	}
	public  ArrayList<Board> searchBoard(String title)
	{
		ArrayList<Board> search = new ArrayList<Board>();
		for(int i=0; i<list.size(); i++)
		{
			if(list.get(i).getBoardTitle().contains(title))
			{
				search.add(list.get(i));
				list.get(i).setReadCount(list.get(i).getReadCount()+1);
			}
		}
		return search;
	}
	public void saveListFile()
	{
		try(ObjectOutputStream oos = new ObjectOutputStream	(new FileOutputStream("board_list.dat"))){
			oos.writeObject(list);
			
		}catch(FileNotFoundException e) {
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
