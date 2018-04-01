package org.qinnan.user.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.zip.GZIPOutputStream;

public  class A {
  public static void main(String[] args) {
	for (int j=0,i = 0; j<7; j+=3) {
		i = i + j;
		System.out.println(i);
	}
}
}
