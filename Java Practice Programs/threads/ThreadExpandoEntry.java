package Java.threads.concept;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true,property= {},service = ThreadExpandoEntry.class)
public class ThreadExpandoEntry {
	public void expandoEntry() {
		System.out.println("Entry Started");
		for(int i=0;i<5;i++) {
			new ExapndoEntry("Thread_"+i);
		}
	}
}
