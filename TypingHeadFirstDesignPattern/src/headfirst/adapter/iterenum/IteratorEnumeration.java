package headfirst.adapter.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumeration implements Enumeration {
	Iterator iterator;

	public IteratorEnumeration(Iterator iterator) {
		super();
		this.iterator = iterator;
	}
	
	public boolean hasMoreElements() {
		return iterator.hasNext();
	}
	
	public Object nextElement() {
		return iterator.next();
	}
}
