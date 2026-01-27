package ex04;

import java.util.ArrayList;

public class QuizService {
	private ArrayList<QuizDto> list;
	private QuizDto dto;

	public QuizService() {
		list = new ArrayList<QuizDto>();
	}

	public void addMemList(QuizDto dto) {
		list.add(dto);
	}

	public QuizDto setMem(String stNum, String name, int age) {
		dto = new QuizDto();
		dto.setStNum(stNum);
		dto.setName(name);
		dto.setAge(age);
		return dto;
	}

	public int getIdx(String stNum) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStNum().equals(stNum)) {
				return i;
			}
		}
		return -1;
	}

	public QuizDto getMem(String stNum) {
		int idx = getIdx(stNum);
		if (idx >= 0) {
			return list.get(idx);
		}
		return null;
	}

	public boolean removeMem(String stNum) {
		int removeIdx = getIdx(stNum);
		if (removeIdx >= 0) {
			list.remove(removeIdx);
			return true;
		}
		return false;
	}

	public boolean modifyMem(String stNum, String name, int age) {
		// 일치하는 stNum 찾기
		int modifyIdx = getIdx(stNum);
		if (modifyIdx != -1) {
			list.set(modifyIdx, setMem(stNum, name, age));
			return true;
		} else {
			return false;
		}
	}

	public ArrayList<QuizDto> listMem() {
		return list;
	}
}