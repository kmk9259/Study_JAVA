package 스터디.collection.hw1.model.comparator;

import java.util.Comparator;

import 스터디.collection.hw1.model.vo.Board;

public class AscBoardNo implements Comparator<Board>{

	@Override
	public int compare(Board o1, Board o2) {
		// TODO Auto-generated method stub
		return o1.getBoardNo()- o1.getBoardNo();
	}
	

}
