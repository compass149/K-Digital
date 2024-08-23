package ch05;

public class Dictionary extends PairMap {

private int count = 0;//현재 들어있는 갯수
	
	public Dictionary(int capacity) {
		keyArray = new String[capacity];
		valueArray = new String[capacity];
	}

	@Override
	String get(String key) {
		
		for(int i=0; i<count; i++)
		{
//			if(keyArray[i].equals(key)) {
			if(key.equals(keyArray[i])) {
				return valueArray[i];
			}
		}
		
		return null;
	}

	@Override
	void put(String key, String value) {
		
		//0.현재 키값이 있는지 없는지 검사하고, 위치(i)를 저장
		int i=0;
		for(i=0; i<count; i++) {
			if(key.equals(keyArray[i]))
				break;
		}
		
		//1.key값이 없을 경우
		if(i == count) {
			if(i<keyArray.length) {//꽉차지 않았을때만 넣기
				keyArray[i] = key;
				valueArray[i] = value;
				count++; //현재갯수 증가 업데이트
			}
		}
		else{//2.key값이 있을 경우
			keyArray[i] = key;
			valueArray[i] = value;
//			count++;//갯수는 바꾸면 안된다!!
		}
	}

	@Override
	String delete(String key) {
		
		//0.key값이 있는지 없는지 검사, 위치(i)를 저장
		int i=0;
		for(i=0; i<count; i++) {
			if(key.equals(keyArray[i]));
				break;
		}
		
		//1.key값이 없으면, 삭제안됨
		if(i==count)
			return null;
		
		//2.key값이 있으면, 삭제, 그리고 후처리(뒤에 원소를 앞으로 땡겨줘야함)
		//지우고자 하는 위치의 키값과 value값에다가, 
		//바로뒤에 있는 값을 가져와서 넣는다.(덮어쓰는 효과)
		
		int last = count-1;
		for(int j=0; j<last; j++) {
			keyArray[j] = keyArray[j+1];
			valueArray[j] = valueArray[j+1];
		}
		count--;
		
		
		return valueArray[i];
	}

	@Override
	int length() {
		return count;
	}

}
