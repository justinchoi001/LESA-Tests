/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.qa;

import com.liferay.qa.util.LiferayQAPropsValues;

import java.io.File;

import org.apache.tools.ant.DirectoryScanner;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;

/**
 * @author Brian Wing Shun Chan
 */
public class MarkdownBuilder {

	public static void main(String[] args) throws Exception {
		new MarkdownBuilder(args);
	}

	public MarkdownBuilder(String[] args) throws Exception {
		String file;

		String[] fileNames = getFileNames();

		for (String fileName : fileNames) {
			file = _BASE_DIR + fileName;
			file = file.replace("\\","/");

			markdown(file);
			html(file);
		}
	}

	protected String[] getFileNames() throws Exception {
		DirectoryScanner directoryScanner = new DirectoryScanner();

		directoryScanner.setBasedir(_BASE_DIR);
		directoryScanner.setExcludes(
			new String[] {});
		directoryScanner.setIncludes(
			new String[] {
				"**\\src\\*.markdown"
			});

		directoryScanner.scan();

		return directoryScanner.getIncludedFiles();
	}

	private void html(String file) throws Exception {
		String srcString = "/src/";

		if (_OS_UNIX) {
			srcString = "/src/";
		}

		int x = file.indexOf(srcString) + 1;
		int y = x + 4;

		String fileDir = file.substring(0, x);
		String fileName = file.substring(y);

		new File(fileDir + "html").mkdirs();

		x = fileName.indexOf(".markdown");

		String testName = fileName.substring(0, x);

		String[] command;

		if (_OS_UNIX) {
			String[] unixCommand = {
				_PANDOC_APP, "-f", "markdown", "-t", "html", "-o",
				fileDir + "html/" + testName + ".html",
				fileDir + "src/" + testName + ".markdown"
			};

			command = unixCommand;
		}
		else {
			String[] windowsCommand = {
				_PANDOC_APP, "-f", "markdown", "-t", "html", "+RTS", "-K64m",
				"-RTS", "-smart", "-o",
				fileDir + "html/" + testName + ".html",
				fileDir + "src/" + testName + ".markdown"
			};

			command = windowsCommand;
		}

		Runtime runtime = Runtime.getRuntime();

		runtime.exec(command);
	}

	private void markdown(String file) throws Exception {
		String srcString = "/src/";

		if (_OS_UNIX) {
			srcString = "/src/";
		}

		int x = file.indexOf(srcString) + 1;
		int y = x + 4;

		String fileDir = file.substring(0, x);
		String fileName = file.substring(y);

		new File(fileDir + "html").mkdirs();

		x = fileName.indexOf(".markdown");

		String testName = fileName.substring(0, x);

		FileUtils fileUtils = new FileUtils();

		File srcFile = new File(fileDir + "src/" + testName + ".markdown");
		File destFile = new File(fileDir + testName + ".markdown");

		String content = FileUtils.readFileToString(srcFile, "UTF-8");

		imageValidate(content, file);

		content = markdownUpdateURL(content, file);

		FileUtils.write(
			new File(fileDir + testName + ".markdown"),
			content, "UTF-8"
		);
	}

	private void imageValidate(String content, String file) {
		String srcString = "/src/";

		if (_OS_UNIX) {
			srcString = "/src/";
		}

		int x = file.indexOf(srcString) + 1;
		int y = x + 4;

		String fileDir = file.substring(0, x);
		String fileName = file.substring(y);

		x = fileName.indexOf(".markdown");

		String testName = fileName.substring(0, x);

		String[] imageNames = StringUtils.substringsBetween(
			content, "../images/", ")");
		try {
				for(int i=0; i<imageNames.length; i++){
					File imageFile = new File(fileDir + "images/" + imageNames[i]);
					boolean exists = imageFile.exists();

					if (!exists){
						System.out.println(imageNames[i] + " does not exist!");
						System.exit(-1);
					}
				}
			}
		catch (Exception e){
		}
	}

	private String markdownUpdateURL(String content, String file) {
		String srcString = "/src/";

		if (_OS_UNIX) {
			srcString = "/src/";
		}

		String url = "https://github.com/liferay/liferay-qa-ee/raw/master/";
		int x = file.indexOf(srcString) + 1;
		int z = _BASE_DIR.length();

		file = file.replaceAll("\\\\","\\/");

		String fileUrl = file.substring(z, x);

		url = url + fileUrl +"images";

		content = content.replaceAll("../images", url);

		return content;
	}

	private static String _BASE_DIR = LiferayQAPropsValues.BASE_DIR;
	private static String _PANDOC_APP = LiferayQAPropsValues.PANDOC_APP;
	private static boolean _OS_UNIX =
		Boolean.parseBoolean(LiferayQAPropsValues.OS_UNIX);

}
