package com.icarus.tutorial.commonsio.fileutils;

import org.apache.commons.io.FilenameUtils;

public class FilenameUtilsNormalize {
	
	public static void main(String[] args) {
		String filename = "C:/commons/io/../lang/project.xml";
		String normalized = FilenameUtils.normalize(filename);
		System.out.println(normalized);
	}
}