package org.app.mom;

import java.util.logging.Logger;

import org.app.mom.contracts.factory.ApplicationContext;
import org.app.mom.contracts.service.Service;
import org.app.mom.contracts.structure.Queue;
import org.app.mom.factory.ServiceFactory;
import org.app.mom.helper.FileType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class MomApplication {

	static Logger logger = Logger.getLogger(MomApplication.class.getName());

	@Autowired
	@Qualifier(value = "appContext")
	private ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(MomApplication.class, args);
		Service servivce = ServiceFactory.getSrevice(FileType.TXT);
		Queue queue = servivce.readActivity("D:\\activity.txt");
		while (true) {
			if (!queue.isEmpty())
				logger.info("Activity name:" + queue.poll().getActivity());
			if (queue.isQueueClosed() && queue.isEmpty())
				break;
		}
	}

}
