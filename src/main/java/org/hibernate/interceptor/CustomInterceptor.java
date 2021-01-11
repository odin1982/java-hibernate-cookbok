package org.hibernate.interceptor;

import java.io.Serializable;
import java.util.Arrays;
import org.apache.log4j.Logger;
import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;

import javassist.bytecode.Descriptor.Iterator;
public class CustomInterceptor extends EmptyInterceptor{
	private static final long serialVersionUID = -8012757385766739888L;
	private Logger log = Logger.getLogger(CustomInterceptor.class);
	public boolean onSave(Object entity,Serializable id,Object[] state,String[] propertyNames,Type[] types) {
		System.out.println("On Save");
		System.out.println("entity: " + entity);
		System.out.println("id: " + id);
		System.out.println("state: " + Arrays.toString(state));
		System.out.println("propertyNames: " + Arrays.toString(propertyNames));
		System.out.println("types: " + Arrays.toString(types));
		return false;
	}
	
	public void preFlush(Iterator iterator) {
		System.out.println("\n\nPre flush");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public void postFlush(Iterator iterator) {
		System.out.println("\n\nPost flush");
		log.info("\n\nPost flush");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
