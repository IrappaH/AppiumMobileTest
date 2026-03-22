package util;

import java.io.File;
import java.util.Date;
import java.util.Properties;

public class LoggerFactory {
	
	private static Properties configureLogger(String applicationLogFileName, String loggerName) {
		Properties props = new Properties();
		// Application Logs
		props.put("log4j.logger." + loggerName, "Info, dest1");
		props.put("log4j.appender.dest1", "org.apache.log4j.RollingFileAppender");
		props.put("log4j.appender.dest1.maxFileSize", "2000KB");
		props.put("log4j.appender.dest1.maxBackupIndex", "5");
		props.put("log4j.appender.dest1.layout", "org.apache.log4j.PatternLayout");
		props.put("log4j.appender.dest1.layout.ConversionPattern", "%d{ISO8601} [%t] %5p %C{1}:%L - %m%n");
		props.put("log4j.appender.dest1.Append", "false");
		props.put("log4j.appender.dest1.File", applicationLogFileName);
		props.put("log4j.appender.dest1.Append", "false");
		return props;

	}
}
