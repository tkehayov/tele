package file;

import java.beans.Expression;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.file.FileComponent;
import org.springframework.stereotype.Component;

@Component
public class FileRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:/tmp/cim/?recursive=true&noop=true")
				.bean(File.class, "print(String)").setHeader("ContentProvider", constant("hell"));
	}

}
