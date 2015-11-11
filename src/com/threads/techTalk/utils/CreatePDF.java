package com.threads.techTalk.utils;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class CreatePDF {

	  private static String FILE = "C:/Users/ibustamante/Dropbox/Algor/src/com/threads/techTalk/phaseOne/output/PdfThreadContainer.pdf";
	  private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
	      Font.BOLD);
	  private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
	      Font.BOLD);
	  

	  public static void setPDF(int[] numbers, List<String> lines, int[] fibo){
		  
		  try {
		      Document document = new Document();
		      PdfWriter.getInstance(document, new FileOutputStream(FILE));
		      document.open();
		      addTitlePage(document);
		      addContent(document, numbers);
		      addContent2(document, lines);
		      addContent3(document, fibo);
		      document.close();
		    } catch (Exception e) {
		      e.printStackTrace();
		    }
		  
	  }

	  private static void addTitlePage(Document document) throws DocumentException {
	    Paragraph preface = new Paragraph();
	    addEmptyLine(preface, 1);
	    preface.add(new Paragraph("Threads Documents", catFont));
	    document.add(preface);
	    document.newPage();
	  }
	  
	  private static void addContent(Document document, int[] numbers) throws DocumentException {
		   Paragraph preface = new Paragraph();
		    addEmptyLine(preface, 1);
		    preface.add(new Paragraph("Sorted Numbers", catFont));
		    addEmptyLine(preface, 1);
		    String numberList ="";
		    for (int i = 0; i < numbers.length; i++) {
		    	numberList+= String.valueOf(numbers[i])+" ";
			}
		    preface.add(new Paragraph(numberList, smallBold));
		    document.add(preface);
		    document.newPage();	  
	  }
	  
	  private static void addContent2(Document document, List<String> lines) throws DocumentException {		  
		   Paragraph preface = new Paragraph();
		    addEmptyLine(preface, 1);
		    preface.add(new Paragraph("Copied Text", catFont));
		    addEmptyLine(preface, 1);
		    for (String line : lines) { 	
			    preface.add(new Paragraph(line, smallBold));
			}
		    
		    document.add(preface);
		    document.newPage();	  
	  }
	  
	  private static void addContent3(Document document, int[] fibo) throws DocumentException {		  
		   Paragraph preface = new Paragraph();
		    addEmptyLine(preface, 1);
		    preface.add(new Paragraph("Fibonnacci sequence", catFont));
		    addEmptyLine(preface, 1);
		    for (int i = 0; i < fibo.length; i++) {
				preface.add(new Paragraph(String.valueOf(fibo[i]), smallBold));
			}	    
		    document.add(preface);
		    document.newPage();	  
	  }

	  private static void addEmptyLine(Paragraph paragraph, int number) {
	    for (int i = 0; i < number; i++) {
	      paragraph.add(new Paragraph(" "));
	    }
	  }
} 
