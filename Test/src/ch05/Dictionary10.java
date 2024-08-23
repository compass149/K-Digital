package ch05;

public class Dictionary10 extends PairMap {

	private int count = 0; // 현재 들어있는 개수//원소의 값을 저장함-넣으면 1씩 증가하고 빼면 1씩 감소하므로 변화하는 값을 저장해놓아야 함

	public Dictionary10(int capacity) {
		// TODO Auto-generated constructor stub
		keyArray = new String[capacity];
		valueArray = new String[capacity];
	}

	@Override
	String get(String key) {// key값으로 value를 가져옴
		// TODO Auto-generated method stub

		for (int i = 0; i < count; i++) {
			if (key.equals(keyArray[i])) {
				return valueArray[i];
			}
		}
		return null;
	}

	@Override
	void put(String key, String value) {
		// 현재 키값의 존재 여부 확인
		int i = 0;
		for (i = 0; i < count; i++) {
			if (key.equals(keyArray[i]))
				break;
		}

		if (i == count) {// 1. key값이 있을 경우
			if (i < keyArray.length) {
				keyArray[i] = key;
				valueArray[i] = value;
				count++; // 현재 개수 갱신
			}
		} else {// 2. key값이 없을 경우
			keyArray[i] = key;
			valueArray[i] = value;
		}
	}

	@Override
	String delete(String key) {
		// 0. 키값 존재여부 검사, 위치(i) 저장
		int i = 0;
		for (i = 0; i < count; i++) {
			if (key.equals(keyArray[i]));
				
			break;
		}
		// 1. 키값 없으면 삭제 불가
		if (i == count)
			return null;
		// 2. 키값이 있으면 삭제, 뒤 원소를 앞으로 배치

		int lastNo = count - 1;
		for (int j = 0; j < lastNo; j++) {
			keyArray[j] = keyArray[j + 1];
			valueArray[j] = valueArray[j + 1];
		}
		count--;

		return valueArray[i];
	}

	@Override
	int length() {
		return count;
	}
}
