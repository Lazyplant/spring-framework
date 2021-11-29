package org.springframework.tests;

import org.junit.Test;
import org.springframework.core.io.*;

import java.io.IOException;

/**
 * TODO
 *
 * @author zenghong.sz
 * @version 1.0.0
 * @ClassName MyTest.java
 * @date 2021年11月18日 16:48:00
 */
public class MyTest {

	@Test
	public void resourceLoaderTest(){
		ResourceLoader resourceLoader = new DefaultResourceLoader();

		Resource fileResource1 = resourceLoader.getResource("D:/home/ap/p8dsdf/dsfFiles/TOPWAY91120211117.txt");
		System.out.println("fileResource1 is FileSystemResource:" + (fileResource1 instanceof FileSystemResource));

		Resource fileResource2 = resourceLoader.getResource("org/springframework/util/testlog4j.properties");
		System.out.println("fileResource2 is ClassPathResource:" + (fileResource2 instanceof ClassPathResource));

		Resource urlResource1 = resourceLoader.getResource("file:/home/ap/p8dsdf/dsfFiles/TOPWAY91120211117.txt");
		System.out.println("urlResource1 is UrlResource:" + (urlResource1 instanceof UrlResource));

		Resource urlResource2 = resourceLoader.getResource("http://www.baidu.com");
		System.out.println("urlResource1 is urlResource:" + (urlResource2 instanceof  UrlResource));


		try {

			System.out.println(fileResource2.getFile().getPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
