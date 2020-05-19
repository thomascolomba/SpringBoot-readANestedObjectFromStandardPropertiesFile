package readANestedObjectFromStandardPropertiesFile.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class MyConfigurationBean {
    private MyNestedObject myNestedObject;
	public static class MyNestedObject {
		private String myString;
		public String getMyString() {
			return myString;
		}
		public void setMyString(String myString) {
			this.myString = myString;
		}
	}
	public MyNestedObject getMyNestedObject() {
		return myNestedObject;
	}
	public void setMyNestedObject(MyNestedObject myNestedObject) {
		this.myNestedObject = myNestedObject;
	}
}