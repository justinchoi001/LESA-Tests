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

package com.liferay.qa.util;

import java.io.InputStream;

import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

/**
 * @author Brian Wing Shun Chan
 */
public class LiferayQAPropsUtil {

	public static String get(String key) {
		return _instance._get(key);
	}

	public static Properties getProperties() {
		return _instance._props;
	}

	public static void printProperties() {
		_instance._printProperties(true);
	}

	public static void set(String key, String value) {
		_instance._set(key, value);
	}

	private LiferayQAPropsUtil() {
		try {
			ClassLoader classLoader = ClassLoader.getSystemClassLoader();

			InputStream is = classLoader.getResourceAsStream(
				"build.properties");

			_props.load(is);

			is = classLoader.getResourceAsStream(
				"build-ext.properties");

			if (is != null) {
				_props.load(is);
			}

			_printProperties(false);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	private String _get(String key) {
		return _props.getProperty(key);
	}

	private void _printProperties(boolean update) {
	}

	private void _set(String key, String value) {
		_props.setProperty(key, value);
	}

	private static LiferayQAPropsUtil _instance = new LiferayQAPropsUtil();

	private Properties _props = new Properties();

}