package Java.threads.concept;

import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.expando.kernel.model.ExpandoColumn;
import com.liferay.expando.kernel.model.ExpandoColumnConstants;
import com.liferay.expando.kernel.model.ExpandoTable;
import com.liferay.expando.kernel.service.ExpandoColumnLocalService;
import com.liferay.expando.kernel.service.ExpandoColumnLocalServiceUtil;
import com.liferay.expando.kernel.service.ExpandoRowLocalService;
import com.liferay.expando.kernel.service.ExpandoRowLocalServiceUtil;
import com.liferay.expando.kernel.service.ExpandoTableLocalService;
import com.liferay.expando.kernel.service.ExpandoTableLocalServiceUtil;
import com.liferay.expando.kernel.service.ExpandoValueLocalService;
import com.liferay.expando.kernel.service.ExpandoValueLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true,property= {},service = ExapndoEntry.class)
public class ExapndoEntry implements Runnable{

	private String name;
	private String className;
	private Thread thread;
	private long companyId;

	public ExapndoEntry(String name) {
		this.name = name;
		this.className = ThreadExpandoEntry.class.getName();
		thread = new Thread(this,name);
		this.companyId = CompanyThreadLocal.getCompanyId();
		System.out.println(companyId);
		thread.start();
	}
	
	@Override
	public void run() {
		try {
			System.out.println("---- thread is -- " + thread);
			System.out.println(companyId+" "+  className + " " + name);
			ExpandoTable expandoTable =	ExpandoTableLocalServiceUtil.addTable(companyId, className, name);
			System.out.println(expandoTable.getTableId() +" "+ name +" "+ ExpandoColumnConstants.STRING);
			ExpandoColumn expandoColumn = ExpandoColumnLocalServiceUtil.addColumn(expandoTable.getTableId(), name, ExpandoColumnConstants.STRING);
			ExpandoValueLocalServiceUtil.addValue(companyId, className, expandoTable.getName(), expandoColumn.getName(), CounterLocalServiceUtil.increment(className), "SampleDate_"+CounterLocalServiceUtil.increment(className));
			System.out.println("---- thread Stop --" + thread);
		} catch (PortalException e) {
			e.printStackTrace();
		}
	}

	@Reference
	protected ExpandoTableLocalService expandoTableLocalService;
	
	@Reference
	protected ExpandoColumnLocalService expandoColumnLocalService;
	
	@Reference
	protected ExpandoRowLocalService expandoRowLocalService;
 	
	@Reference
	protected ExpandoValueLocalService expandoValueLocalService;
	
	@Reference
	protected CounterLocalService counterLocalService;
}