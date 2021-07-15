package 스터디.collection.hw1.model.comparator;

import java.util.Comparator;

import 스터디.collection.hw1.model.vo.Board;

public class AscBoardDate implements Comparator<Board>{

	@Override
	public int compare(Board b1, Board b2) {
		
		return b1.getBoardDate().compareTo(b2.getBoardDate());
	}

	
	

}
