package com.demo.web.utility;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Paths;

import org.apache.log4j.Priority;
import org.apache.log4j.RollingFileAppender;

public class LevelSplitRollingFileAppender extends RollingFileAppender {
	@Override
	public boolean isAsSevereAsThreshold(Priority priority) {
		return this.getThreshold().equals(priority);
	}

	@Override
	public void setFile(String file) {
		String path;
		String fullPath = "";
		try {
			path = LevelSplitRollingFileAppender.class.getResource("/").toURI()
					.toString();
			String parent = Paths.get(new URI(path)).getParent().toString();
			fullPath = Paths.get(parent, "logs", file).toString();
			
		} catch (URISyntaxException e1) {
			e1.printStackTrace();
		}

		super.setFile(fullPath);
	}
}
