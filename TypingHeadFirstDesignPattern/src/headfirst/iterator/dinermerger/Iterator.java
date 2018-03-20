package headfirst.iterator.dinermerger;

public interface Iterator {
	
	boolean hasNext();			// 다음으로 반복작업을 수행할 항목이 있는지 확인한 다음 그 결과를 부울 값으로 리턴합니다.
	
	Object next();				// next()메소드에서는 다음 항목을 리턴합니다.
	
}
