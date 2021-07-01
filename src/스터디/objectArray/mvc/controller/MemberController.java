package 스터디.objectArray.mvc.controller;

import 스터디.objectArray.mvc.model.vo.Member;

public class MemberController {
	public final static int SIZE =10;
	private int memberCount;
	private Member[] mem = new Member[SIZE];
	
	{
		mem[0] = new Member("user01", "pass01", "김유신", 20, 'M', "kim12@naver.com");
		mem[1] = new Member("user02", "pass02", "이순신", 60, 'M', "lee2@naver.com");
		mem[2] = new Member("user03", "pass03", "유관순", 17, 'F', "yo5@hanmail.net");
		mem[3] = new Member("user04", "pass04", "연개소문", 57, 'M', "yeon@gmail.com");
		mem[4] = new Member("user05", "pass05", "신사임당", 45, 'F', "shin@naver.com");
		memberCount = 5;
	}

	public int getMemberCount() {
		return memberCount;
	}

	public Member[] getMem() {
		return mem;
	}

	public Member checkId(String userId) {
		Member m = null;
		for (int i = 0; i < memberCount; i++) {
			if (mem[i].getUserId().equals(userId)) {
				m= mem[i];
			}
		}
		return m;

	}

	public void insertMember(Member m) {
		mem[memberCount++] = m;
	}

	public Member searchMember(int menu, String search) {
		Member searchMember = null;
		switch (menu) {
		case 1:
			for (int i = 0; i < memberCount; i++) {
				if (mem[i].getUserId().equals(search))
					searchMember = mem[i];
			}
			break;
		case 2:
			for (int i = 0; i < memberCount; i++) {
				if (mem[i].getName().equals(search))
					searchMember = mem[i];
			}
			break;
		case 3:
			for (int i = 0; i < memberCount; i++) {
				if (mem[i].getEmail().equals(search))
					searchMember = mem[i];
			}
			break;
		}
		return searchMember;
	}

	public void updateMember(Member m, int menu, String update) {

		switch (menu) {
		case 1:
			m.setUserPwd(update);

			break;
		case 2:
			m.setName(update);
			break;
		case 3:
			m.setEmail(update);
			break;
		}
	}

	public void deleteMember(String userId) {
		for (int i = 0; i < memberCount; i++) {
			if (mem[i].getUserId().equals(userId)) {
				mem[i] = null;
				memberCount -= 1;
			}
		}
	}

	public Member[] sortIdAsc() {

		Member[] copy = mem.clone();
		String a;
		String b;
		Member[] temp = new Member[1];
		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < i; j++) {
				a = copy[i].getUserId();
				b = copy[j].getUserId();
				if (a.compareTo(b) > 1) {
					temp[0] = copy[j];
					copy[i] = copy[j];
					copy[j] = temp[0];
				}
			}

		}
		return copy;
	}

	public Member[] sortIdDesc() {
		// 위와 동일한 방식이지만 내림차순으로 정렬 후 주소 값 리턴
		Member[] copy = mem.clone();
		String a;
		String b;
		Member[] temp = new Member[1];
		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < i; j++) {
				a = copy[i].getUserId();
				b = copy[j].getUserId();
				if (a.compareTo(b) < 0) {
					temp[0] = copy[j];
					copy[i] = copy[j];
					copy[j] = temp[0];
				}
			}

		}
		return copy;

	}

	public Member[] sortAgeAsc() {
		Member[] copy = mem.clone();
		int a;
		int b;
		Member[] temp = new Member[1];
		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < i; j++) {
				if (copy[i].getAge() > copy[j].getAge()) {
					temp[0] = copy[j];
					copy[i] = copy[j];
					copy[j] = temp[0];
				}

			}

		}
		return copy;
	}

	public Member[] sortAgeDesc() {
		Member[] copy = mem.clone();
		int a;
		int b;
		Member[] temp = new Member[1];
		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < i; j++) {
				if (copy[i].getAge() < copy[j].getAge()) {
					temp[0] = copy[j];
					copy[i] = copy[j];
					copy[j] = temp[0];
				}

			}

		}
		return copy;
	}

	public Member[] sortGenderDesc() {
		// 위와 동일한 방식이지만 성별 별 내림차순으로 정렬 후 주소 값 리턴
		// (남여 순으로 정렬)
		Member[] copy = mem.clone();
		Member[] temp = new Member[1];
		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < i; j++) {
				if (copy[i].getGender() < copy[j].getGender()) {
					temp[0] = copy[j];
					copy[i] = copy[j];
					copy[j] = temp[0];
				}

			}

		}
		return copy;
	}
}
